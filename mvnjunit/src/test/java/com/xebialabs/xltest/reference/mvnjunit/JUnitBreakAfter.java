package com.xebialabs.xltest.reference;

import org.junit.After;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class JUnitBreakAfter {
    @After
    public void teardown() {throw new RuntimeException();}

    @Test
    public void test() {
        assertThat(true, is(true));
    }
}
