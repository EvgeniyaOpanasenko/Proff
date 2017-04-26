package ua.com.TestSuites;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Created by EVA on 24.04.2017.
 */
public class RunTestCasesTests {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TestCasesTest.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());
    }
}
