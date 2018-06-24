package net.jakim.automation;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		plugin = {
			"pretty",
		  	"json:target/cucumber-reports/Cucumber.json",
		  	"junit:target/cucumber-reports/Cucumber.xml",
			"html:target/cucumber-reports"
	  	}, 
		features = "src/test/resources/features", 
		glue = "net.jakim.automation.steps.definition")
public class TestRunner {

}
