package net.jakim.automation;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "xray-features/",
        glue = "net.jakim.automation.steps.definition"
)
public class TestRunner {

}
