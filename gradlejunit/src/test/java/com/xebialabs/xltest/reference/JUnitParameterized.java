package com.xebialabs.xltest.reference;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class JUnitParameterized {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] { { 0, 0 }, { 1, 2 }, { 2, 4 }, { 4, 8 }, { 5, 10 } });
    }

    private int input;
    private int expected;

    public JUnitParameterized(int input, int expected) {
        this.input = input;
        this.expected = expected;
    }

    @Test
    public void testAllSucceed() {
        assertEquals(expected, input * 2);
    }

    @Test
    public void testSomeFail() {
        assertTrue(input % 2 == 0);
    }
}
