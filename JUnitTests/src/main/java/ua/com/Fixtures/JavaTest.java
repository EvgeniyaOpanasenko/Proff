package ua.com.Fixtures;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class JavaTest extends TestCase {
    protected int value1, value2;

    // assigning the values

    @Before
    protected void setUp(){
        value1 = 3;
        value2 = 3;
    }

    // test method to add two values
    @Test
    public void testAddPositive(){
        double result = value1 + value2;
        assertTrue(result == 6);
    }

    @Test
    public void testAddNegative(){
        double result = value1 + value2;
        assertTrue(result == 5);
    }
}