package ua.com.exceptions;

/**
 * Created by EVA on 29.03.2017.
 */
public class NoAvaliableTableException extends Exception {
    public NoAvaliableTableException(String message) {
        super("No such table found");
    }
}
