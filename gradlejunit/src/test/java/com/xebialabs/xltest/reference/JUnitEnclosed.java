package com.xebialabs.xltest.reference;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import static junit.framework.TestCase.assertTrue;

/**
 *  Tests executed with Enclosed and inner classes may generate duplicate test results in some reporters.
 */
@RunWith(Enclosed.class)
public class JUnitEnclosed {

    public static class Inner {

        @Test
        public void insideInnerClass() {
            assertTrue(true);
        }
    }

}