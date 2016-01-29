package com.xebialabs.xltest.reference;

import static org.testng.Assert.*;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

/**
 * Using the Factory method creates duplicate test results, as the tests will appear with the same name and hierarchy in the results.
 */
public class TestNgFactory {

    public class SimpleTest {
        @Test
        public void willSucceed() {
            assertTrue(true);
        }
    }

    @Factory
    public Object[] factoryMethod() {
        return new Object[] {new SimpleTest(), new SimpleTest()};
    }

}
