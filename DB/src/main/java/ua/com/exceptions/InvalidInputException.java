package ua.com.exceptions;

/**
 * Created by EVA on 29.03.2017.
 */
public class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super("Pls check input data");
    }
}
