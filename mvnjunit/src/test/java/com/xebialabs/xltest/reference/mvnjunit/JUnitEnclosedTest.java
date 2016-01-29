package com.xebialabs.xltest.reference.mvnjunit;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import static junit.framework.TestCase.assertTrue;

/**
 *  Tests executed with Enclosed and inner classes may generate duplicate test results in some build tools.
 *  For a gradle bug with this behaviour see: https://github.com/gradle/gradle/pull/489
 */
@RunWith(Enclosed.class)
public class JUnitEnclosedTest {

    public static class Inner {

        @Test
        public void insideInnerClass() {
            assertTrue(true);
        }
    }

}
