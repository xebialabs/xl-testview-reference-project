package com.xebialabs.xltest.reference;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class JunitBreakBefore {

    @Before
    public void init() {
        throw new RuntimeException();
    }

    @Test
    public void test() {
        assertThat(true, is(true));
    }
}
