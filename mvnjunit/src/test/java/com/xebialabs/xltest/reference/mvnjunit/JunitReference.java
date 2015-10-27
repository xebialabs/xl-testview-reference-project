package com.xebialabs.xltest.reference.mvnjunit;

import org.junit.Ignore;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static junit.framework.TestCase.assertTrue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;
import static org.junit.Assume.assumeTrue;

public class JunitReference {
    @Test
    public void succeed() {
        assertTrue(true);
    }

    @Test
    @Ignore
    public void ignore() {

    }

    @Test
    public void falseAssumption() { assumeTrue(false); }
    @Test
    public void willFail() {
        fail();
    }

    @Test
    public void failWithMessage() {
        assertThat("true != false", true, is(false));
    }

    @Test
    public void exceptionWithMessage() {
        throw new RuntimeException("Exception with message");
    }

    @Test
    public void exceptionWithoutMessage() {
        throw new RuntimeException();
    }

    @Test(expected = IllegalArgumentException.class)
    public void expectedException() {
        throw new IllegalArgumentException();
    }

    @Test
    public void throwError() {
        throw new InternalError();
    }

    @Test(timeout = 10)
    public void timeOut() {
        try {
            TimeUnit.MILLISECONDS.sleep(100);
        } catch (InterruptedException e) {

        }
    }

}
