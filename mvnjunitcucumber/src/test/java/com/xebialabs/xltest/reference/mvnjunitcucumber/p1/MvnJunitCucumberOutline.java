package com.xebialabs.xltest.reference.mvnjunitcucumber.p1;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.*;

public class MvnJunitCucumberOutline {

    private Integer numCucumbers;

    @Given("there are (\\d+) cucumbers")
    public void createStash(Integer numCucumbers) {
        this.numCucumbers = numCucumbers;
    }


    @When("we add (\\d+) cucumbers")
    public void addCucumbers(Integer num) {
        numCucumbers += num;
    }

    @Then("we should have (\\d+) cucumbers")
    public void validateNumber(Integer num) {
        assertEquals(numCucumbers, num);
    }
}
