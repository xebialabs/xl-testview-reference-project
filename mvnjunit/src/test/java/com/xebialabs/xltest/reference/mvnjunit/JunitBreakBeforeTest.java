package com.xebialabs.xltest.reference.mvnjunit;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class JunitBreakBeforeTest {

    @Before
    public void init() {
        throw new RuntimeException();
    }

    @Test
    public void test() {
        assertThat(true, is(true));
    }
}
