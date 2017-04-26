package ua.com.TestSuites;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestJunitAssert {

    int num;
    String temp;
    String str;

    @Before
    public void init() {
        //test data
        num = 5;
        temp = null;
        str = "Junit is working fine";
    }

    @Test
    public void testEquality() {
        //check foe equality
        assertEquals("Junit is working fine", str);
    }

    @Test
    public void testFalseCondition() {
        //check for false condition
        assertFalse(num > 8);

    }

    @Test
    public void testNotNull() {
        //check for not null
        assertNotNull(str);
    }

}
