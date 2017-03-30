package ua.com.exceptions;

/**
 * Created by EVA on 29.03.2017.
 */
public class noAvaliableTableException extends Exception {
    public noAvaliableTableException(String message) {
        super("No such table found");
    }
}
