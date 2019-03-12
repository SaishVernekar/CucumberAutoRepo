package com.Trimble.POSTWithJSON;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/Resources/UpdatedPOSTjson"},
		
		glue= {"com/Trimble/POSTWithJSON"},
				plugin={"pretty",
						"html:target/cucumber-htmlreport",
						"json:target/cucumber-report1.json",
						"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport1.html"
				}
		)


public class RunnerFileTest {

}
