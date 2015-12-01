package com.xebialabs.xltest.reference.mvnjunitcucumber.p1;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(strict = false, features = "src/test/resources/com/xebialabs/xltest/reference/mvnjunitcucumber/p1", format = { "pretty",
        "json:target/cucumber-report.json" }, tags = { "~@ignore" })
public class MvnJunitCucumber1Test {


}
