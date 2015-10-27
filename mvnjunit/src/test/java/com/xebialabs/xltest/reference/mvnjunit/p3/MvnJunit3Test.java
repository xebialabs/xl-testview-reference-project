package com.xebialabs.xltest.reference.mvnjunit.p3;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.junit.Ignore;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

public class MvnJunit3Test {

    @Test
    public void succeed() {
        assertTrue(true);
    }

    @Test
    @Ignore
    public void ignore() {

    }

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

    @Test
    public void random1() {
        Random r = new Random();
        assertThat(r.nextBoolean(), is(true));
    }

    @Test
    public void random2() {
        Random r = new Random();
        assertThat(r.nextBoolean(), is(true));
    }

    @Test
    public void random3() {
        Random r = new Random();
        assertThat(r.nextBoolean(), is(true));
    }

    @Test
    public void random4() {
        Random r = new Random();
        assertThat(r.nextBoolean(), is(true));
    }

    @Test
    public void random5() {
        Random r = new Random();
        assertThat(r.nextBoolean(), is(true));
    }

    @Test
    public void random6() {
        Random r = new Random();
        assertThat(r.nextBoolean(), is(true));
    }

    @Test
    public void random7() {
        Random r = new Random();
        assertThat(r.nextBoolean(), is(true));
    }

    @Test
    public void random8() {
        Random r = new Random();
        assertThat(r.nextBoolean(), is(true));
    }

    @Test
    public void random9() {
        Random r = new Random();
        assertThat(r.nextBoolean(), is(true));
    }

    @Test
    public void random10() {
        Random r = new Random();
        assertThat(r.nextBoolean(), is(true));
    }
}
