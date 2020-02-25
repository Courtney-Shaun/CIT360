package JUnit;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


// Base code was found on Tutorialspoint.com and edited.
// Program will run the Junit tests in TestAssertMethods and print to the console if the test passed with a
// true or if it failed with a false.
public class TestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TestAssertMethods.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
            System.out.println("A test has failed.");
        }

        System.out.println("All tests have passed");
        System.out.println(result.wasSuccessful());
    }
}
