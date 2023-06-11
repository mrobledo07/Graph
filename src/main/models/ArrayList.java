package main.models;

import main.exceptions.ElementNotFound;

public class ArrayList<A> implements IList<A> {
    private Object[] list;
    private int numElem;

    public ArrayList(){
        this.list = new Object[10];
        this.numElem = 0;
    }
    
    @Override
    public void add(A element){
        Object elem = (Object) element;
        if (numElem == list.length){
            Object[] aux = new Object[list.length + 10];
            for (int i = 0; i < numElem; i++)
                aux[i] = list[i];

            list = aux;
        }
        list[numElem] = elem;
        numElem++;
    }

    @Override
    public void remove(A element) throws ElementNotFound{
        Object elem = (Object) element;
        for (int i = 0; i < numElem; i++)
            if (list[i].equals(elem)){
                list[i] = null;
                if (i != numElem - 1)
                    rotate(i);
                return;
            }
        
        throw new ElementNotFound("The element was not found");
    }

    private void rotate(int index){
        for (int i = index; i < numElem - 1; i++)
            list[i+1] = list[i];
    }

    @Override
    public boolean contains(A element){
        Object elem = (Object) element;
        for (int i = 0; i < numElem; i++)
            if (list[i].equals(elem))
                return true;
        
        return false;
    }

    @Override
    public int size(){
        return numElem;
    }

    public Object get(int index) throws ElementNotFound{
        Object ret = null;
        try{
           ret = list[index];
        }catch (ArrayIndexOutOfBoundsException e){
            throw new ElementNotFound("The index was to high");
        }
        return ret;
    }
}
