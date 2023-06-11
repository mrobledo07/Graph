package main.models;

import main.exceptions.ElementNotFound;

import java.util.Iterator;

public class LinkedList<A> implements IList<A> {
    private Node<A> head;
    private int numElem;

    public LinkedList(){
        this.head = null;
        this.numElem = 0;
    }

    @Override
    public void add(A element){
        Node<A> newNode = new Node<>(element);
        if (head == null)
            head = newNode;
        else{
            Node<A> aux = head;
            while (aux.getNext() != null)
                aux = aux.getNext();
            aux.setNext(newNode);
        }
        numElem++;
    }

    @Override
    public void remove(A element) throws ElementNotFound{

        if (head.getInfo().equals(element)){
            head = head.getNext();
            numElem--;
        }else{
            Node<A> aux = head;

            while (aux.getNext() != null && !aux.getNext().getInfo().equals(element))
                aux = aux.getNext();
            
            if (aux.getNext() == null)
                throw new ElementNotFound("The element was not found");
            else{
                aux.setNext(aux.getNext().getNext());
                numElem--;
            }

        }   
    }

    @Override
    public boolean contains(A element){
        Node<A> aux = head;
        while (aux != null){
            if (aux.getInfo().equals(element))
                return true;
            aux = aux.getNext();
        }
        return false;
    }

    @Override
    public int size(){
        return numElem;
    }

    @Override
    public A get(int index) throws ElementNotFound{
        Node<A> aux = head;
        int i = 0;
        while (aux != null && i < index){
            aux = aux.getNext();
            i++;
        }

        if (aux == null)
            throw new ElementNotFound("The index was to high");
        else
            return aux.getInfo();

    }

    @Override
    public void print(){
        Node<A> aux = head;
        while (aux != null){
            System.out.print(aux.getInfo() + "->");
            aux = aux.getNext();
        }
    }

    @Override
    public Iterator<A> iterator(){
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements Iterator<A>{
        private Node<A> current;
        public LinkedListIterator(){
            current = head;
        }

        @Override
        public boolean hasNext(){
            if (current != null)
                return true;
            else
                return false;
        }

        @Override
        public A next(){
            A elem = current.getInfo();
            current = current.getNext();
            return elem;
        }
    }

}
