package main.models;
import main.exceptions.ElementNotFound;

public interface IList<A> {
    /**
     * This method adds a new element at the end of the list.
     * @param element
     */
    public void add(A element);

    /**
     * Removes a certain element, throws an ElementNotFound exception if it is not in the list.
     * @param element
     */
    public void remove(A element) throws ElementNotFound;
    
    /**
     * Proves if a certain element exists in the list.
     * @param element
     * @return boolean that indicates the existance of certain element in the list.
     */
    public boolean contains(A element);

    /**
     * Method to know the number of elements in the list.
     * @return number of elements in the list.
     */
    public int size();


    public Object get(int index) throws ElementNotFound;
}
