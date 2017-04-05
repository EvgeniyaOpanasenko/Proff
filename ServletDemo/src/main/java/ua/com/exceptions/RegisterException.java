package ua.com.exceptions;

/**
 * Created by EVA on 05.04.2017.
 */
public class RegisterException extends Exception {
    public RegisterException(String message) {
        super("Something id going wrong");
    }
}
