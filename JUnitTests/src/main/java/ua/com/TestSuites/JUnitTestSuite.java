package ua.com.TestSuites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

//JInit suite test
@RunWith(Suite.class)
@Suite.SuiteClasses({
        TestJunit1.class, TestJunit2.class, TestJunitAssert.class
})
public class JUnitTestSuite {
}
