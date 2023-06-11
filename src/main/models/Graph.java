package main.models;


import main.exceptions.ElementNotFound;
import main.exceptions.RepeatedElement;

public class Graph<A> implements IGraph<A> {
    private IList<LinkedList<A>> adjList;

    public Graph(){
        this.adjList = new ArrayList<>();
    }

    @Override
    public void addNode(A info) throws RepeatedElement, ElementNotFound{
        for (LinkedList<A> current : adjList){
            if (current.get(0).equals(info))
                throw new RepeatedElement("Repeated element");
        }
        
        LinkedList<A> currentList = new LinkedList<>();
        currentList.add(info);
        adjList.add(currentList);
    }

    @Override
    public void removeNode(A info) throws ElementNotFound{
        for(LinkedList<A> currentList : adjList){
            if (currentList.get(0).equals(info)){
                adjList.remove(currentList);
                return;
            }
        }
    }

    @Override
    public boolean checkNode(A info) throws ElementNotFound{
        for (LinkedList<A> currentList : adjList){
            if (currentList.get(0).equals(info))
                return true;
        }
        return false;
    }

    @Override @SuppressWarnings("unchecked")
    public void addEdge(int origin, int destination) throws RepeatedElement, ElementNotFound{
        LinkedList<A> originList = (LinkedList<A>) adjList.get(origin);
        LinkedList<A> destinationList = (LinkedList<A>) adjList.get(destination);
        if (originList.contains(destinationList.get(0)))
            throw new RepeatedElement("Repeated element");

        originList.add(destinationList.get(0));
    }

    @Override @SuppressWarnings("unchecked")
    public void removeEdge(int origin, int destination) throws ElementNotFound{
        LinkedList<A> originList = (LinkedList<A>) adjList.get(origin);
        LinkedList<A> destinationList = (LinkedList<A>) adjList.get(destination);
        if (!originList.contains(destinationList.get(0)))
            throw new ElementNotFound("The element was not found");

        originList.remove(destinationList.get(0));
    }

    @Override @SuppressWarnings("unchecked")
    public boolean checkEdge (int origin, int destination) throws ElementNotFound{
        LinkedList<A>  originList = (LinkedList<A>) adjList.get(origin);
        LinkedList<A> destinationList = (LinkedList<A>) adjList.get(destination);
        for (A info : originList)
            if (info.equals(destinationList.get(0)))
                return true;

        return false;
    }

    @Override
    public void print(){
        for (LinkedList<A> currentList : adjList){
            for (A current : currentList)
                System.out.print(current + " -> ");
            System.out.println();
        }
    }

}
