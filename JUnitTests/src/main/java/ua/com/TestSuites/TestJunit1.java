package ua.com.TestSuites;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

public class TestJunit1 {

    String message = "Robert";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void printMessage() {
        System.out.println("Inside test print message");
        assertEquals(message, messageUtil.printMessagge());
    }
}
