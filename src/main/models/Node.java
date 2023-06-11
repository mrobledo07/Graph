package main.models;

public class Node<A> {
    private A info;
    private Node<A> next;

    public Node(A info) {
        this.info = info;
        this.next = null;
    }

    public Node(A info, Node<A> next) {
        this.info = info;
        this.next = next;
    }

    public A getInfo() {
        return this.info;
    }

    public void setInfo(A info) {
        this.info = info;
    }

    public Node<A> getNext() {
        return this.next;
    }

    public void setNext(Node<A> next) {
        this.next = next;
    }

}
