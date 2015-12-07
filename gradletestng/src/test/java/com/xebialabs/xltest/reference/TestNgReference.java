package com.xebialabs.xltest.reference;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;

import static org.testng.Assert.fail;
import static org.testng.AssertJUnit.assertTrue;

public class TestNgReference {

    @Test
    public void succeed() {
        assertTrue(true);
    }

    @Test(enabled = false)
    public void ignore() {

    }

    @Test
    public void willFail() {
        fail();
    }

    @Test(dependsOnMethods = "willFail")
    public void notExecuted() {
        assertTrue(true);
    }

    @Test
    public void failWithMessage() {
        assertTrue("This fails", false);
    }

    @Test
    public void exceptionWithMessage() {
        throw new RuntimeException("Oeps");
    }

    @Test
    public void exceptionWithoutMessage() {
        throw new RuntimeException();
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void expectedException() {
        throw new IllegalArgumentException();
    }

    @Test
    public void throwError() {
        throw new InternalError();
    }

    @Test(timeOut = 10)
    public void timeOut() {
        try {
            TimeUnit.MILLISECONDS.sleep(100);
        } catch (InterruptedException e) {

        }
    }

}
