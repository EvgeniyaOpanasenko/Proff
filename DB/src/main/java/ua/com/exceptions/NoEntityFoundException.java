package ua.com.exceptions;

/**
 * Created by EVA on 29.03.2017.
 */
public class NoEntityFoundException extends Exception {
    public NoEntityFoundException(String message) {
        super("No such entity found");
    }
}
