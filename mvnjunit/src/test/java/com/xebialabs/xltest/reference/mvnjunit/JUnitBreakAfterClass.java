package com.xebialabs.xltest.reference;

import org.junit.AfterClass;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class JUnitBreakAfterClass {
    @AfterClass
    public static void teardown() {throw new RuntimeException();}

    @Test
    public void test() {
        assertThat(true, is(true));
    }

}
