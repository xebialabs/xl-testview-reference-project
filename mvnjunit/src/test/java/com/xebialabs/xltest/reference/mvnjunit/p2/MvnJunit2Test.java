package com.xebialabs.xltest.reference.mvnjunit.p2;

import java.util.Random;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

public class MvnJunit2Test {

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
