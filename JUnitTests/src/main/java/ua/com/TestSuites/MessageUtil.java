package ua.com.TestSuites;

/**
 * Created by EVA on 24.04.2017.
 */
public class MessageUtil {
    private String message;

    public MessageUtil(String message) {
        this.message = message;
    }

    public MessageUtil() {
    }

    public String printMessagge() {
       return message;
    }

    public String salutationMessage() {
        message = "Hi!" + message;
        return message;
    }
}
