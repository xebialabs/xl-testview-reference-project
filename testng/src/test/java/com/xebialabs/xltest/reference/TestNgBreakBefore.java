package com.xebialabs.xltest.reference;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class TestNgBreakBefore {

    @BeforeMethod
    public void init() {
        throw new RuntimeException();
    }

    @Test
    public void test() {
        assertTrue(true);
    }
}
