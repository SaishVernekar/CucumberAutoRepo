package com.Trimble.Testing2;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features={"src/test/Resources/F1CircuitStatusCheck"},
glue={"com/Trimble/Testing2"},
plugin= {"pretty",
		"html:target/cucumber-htmlreport",
		"json:target/cucumber-report4.json",
		"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport4.html"
})

public class F1TrackTest {

	
}
