package JUnit;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.junit.Assert.*;

// Base code was found on Tutorialspoint.com and edited.
//  All tests are set to pass and can have values changed to demonstrate failure.
public class TestAssertMethods {

    @Test
    public void testAssertions() {
        //test data
        String testStr1 = "AssertTesting";
        String testStr2 = "Testing";
        String testStr3 = null;
        String testStr4 = "AssertTesting";


        int val1 = 3;
        int val2 = 10;

        String[] expectedArray = {"QB", "RB", "WR"};
        String[] resultArray = {"QB", "RB", "WR"};

        // assertArrayEquals- Checks whether two arrays are equal
        assertArrayEquals(expectedArray, resultArray);

        // assertEquals - Checks that two objects are equal
        assertEquals(testStr1, testStr4);

        // assertFalse - Checks that a condition is false
        assertFalse(val1 > val2 );

        // assertNotNull - checks that an object is not null
        assertNotNull(testStr1);

        // assertNotSame - checks that two object references do not point to the same object
        assertNotSame(testStr1, testStr3);

        // assertNull - Checks that an object is null
        assertNull(testStr3);

        // assertSame - Checks that two objects are equal
        assertSame(testStr2, testStr2);

        // assertThat - Check if an array contains particular values
        assertThat(Arrays.asList("Red", "White", "Blue"), hasItems("Red", "Blue"));

        // assertTrue - checks that a condition is true
        assertTrue(val1 < val2);



    }

}

