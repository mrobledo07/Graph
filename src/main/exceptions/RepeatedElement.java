package main.exceptions;

public class RepeatedElement extends Exception {
    public RepeatedElement (String errorMessage){
        super(errorMessage);
    }
}
