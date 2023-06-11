package main.models;


import main.exceptions.ElementNotFound;
import main.exceptions.RepeatedElement;

public interface IGraph<A> {
    /**
     * Adds a new node to the graph.
     * @param info
     */
    public void addNode(A info) throws RepeatedElement, ElementNotFound;

    /**
     * Removes a node from the graph.
     * @param info
     * @throws ElementNotFound
     */
    public void removeNode(A info) throws ElementNotFound;

    /**
     * Checks if a node is in the graph.
     * @param info
     * @return
     */
    public boolean checkNode(A info) throws ElementNotFound;

    /**
     * Adds a new edge to the graph.
     * @param origin
     * @param destination
     */
    public void addEdge(int origin, int destination) throws RepeatedElement, ElementNotFound;

    /**
     * Removes an edge from the graph.
     * @param origin
     * @param destination
     */
    public void removeEdge(int origin, int destination) throws ElementNotFound;

    /**
     * Checks if an edge is in the graph.
     * @param origin
     * @param destination
     * @return
     */
    public boolean checkEdge(int origin, int destination) throws ElementNotFound;

    /**
     * Prints the graph.
     */
    public void print();
}
