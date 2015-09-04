package com.xebialabs.xltest.reference.mvnjunitcucumber.p1;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertTrue;

public class MvnJunitCucumber1Steps {
    @Given("a test without parameters")
    public void addNewBook() {

    }

    @When("doing nothing")
    public void when1() {
    }

    @Then("I will succeed")
    public void succeed() {
        assertTrue(true);
    }

    @Then("I will fail")
    public void willFail() {
        assertTrue(false);
    }

    @Then("I will throw")
    public void willThrow() {
        throw new RuntimeException("Boom!");
    }

    @Given("a test with parameter (\\d+)")
    public void given2(Integer i) {

    }

    @When("and another parameter (.+)")
    public void when2(String s) {
    }

    @Then("we still succeed")
    public void succeed2() {
        assertTrue(true);
    }

    @Then("we still fail")
    public void willFail2() {
        assertTrue(false);
    }
}
