package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions 
	(
		features=".//Features/Home.feature",
		glue="stepDefinitions", 
		dryRun=false, //crosschecks every feature file contains step definition or not
		monochrome=true, //removes unncecessary characters from window
		plugin={"pretty",
				"html:target/cucumber-html-report",
				"json:target/cucumber-json-report.json",
		} //every step is generated clearly and generates the report
		
			
	)
public class TestRun {

}
