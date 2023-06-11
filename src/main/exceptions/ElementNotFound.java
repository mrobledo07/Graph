package main.exceptions;

public class ElementNotFound extends Exception {
    public ElementNotFound (String errorMessage){
        super(errorMessage);
    }
}
