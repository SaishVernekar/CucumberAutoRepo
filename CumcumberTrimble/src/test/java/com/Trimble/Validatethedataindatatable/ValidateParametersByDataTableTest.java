package com.Trimble.Validatethedataindatatable;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features={"src/test/Resources/F1matchingcircuitparam"},
glue={"com/Trimble/Validatethedataindatatable"},
plugin= {"pretty",
		"html:target/cucumber-htmlreport",
		"json:target/cucumber-report5.json",
		"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport5.html"
})


public class ValidateParametersByDataTableTest {

}
