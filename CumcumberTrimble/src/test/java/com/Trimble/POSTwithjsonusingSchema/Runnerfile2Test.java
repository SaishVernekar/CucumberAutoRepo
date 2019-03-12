package com.Trimble.POSTwithjsonusingSchema;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"src/test/Resources/UpdatePOSTjsonwithschema"},
		
		glue= {"com/Trimble/POSTwithjsonusingSchema"},
		plugin={"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report2.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport2.html"
		}
		)
public class Runnerfile2Test {

}
