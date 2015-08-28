package com.xebialabs.xltest.reference.p3;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.fail;
import static org.testng.AssertJUnit.assertTrue;

@Test
public class TestNg {

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

    @Test
    public void random1() {
        Random r = new Random();
        Assert.assertTrue(r.nextBoolean());
    }

    @Test
    public void random2() {
        Random r = new Random();
        Assert.assertTrue(r.nextBoolean());
    }

    @Test
    public void random3() {
        Random r = new Random();
        Assert.assertTrue(r.nextBoolean());
    }

    @Test
    public void random4() {
        Random r = new Random();
        Assert.assertTrue(r.nextBoolean());
    }

    @Test
    public void random5() {
        Random r = new Random();
        Assert.assertTrue(r.nextBoolean());
    }

    @Test
    public void random6() {
        Random r = new Random();
        Assert.assertTrue(r.nextBoolean());
    }

    @Test
    public void random7() {
        Random r = new Random();
        Assert.assertTrue(r.nextBoolean());
    }

    @Test
    public void random8() {
        Random r = new Random();
        Assert.assertTrue(r.nextBoolean());
    }

    @Test
    public void random9() {
        Random r = new Random();
        Assert.assertTrue(r.nextBoolean());
    }

    @Test
    public void random10() {
        Random r = new Random();
        Assert.assertTrue(r.nextBoolean());
    }
}
