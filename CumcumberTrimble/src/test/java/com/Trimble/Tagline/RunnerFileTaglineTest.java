package com.Trimble.Tagline;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith (Cucumber.class) 
@CucumberOptions(
		
		//dryRun=true,
		tags={"@Important"}, //All scenario executed if this is tag for feature file
		 //tags={"@Smoke"}, //only tag with @smoke
		//tags={"@Smoke","@Regression"}, //AND condition
		 //tags={"@Smoke,@Regression"} , // OR condition
		monochrome=true,
		dryRun=false,
		features= {"src/test/Resources/Tagline"},
		glue={"com/Trimble/Tagline"},
		plugin={"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report3.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport3.html"
		}
	)
public class RunnerFileTaglineTest {

}
