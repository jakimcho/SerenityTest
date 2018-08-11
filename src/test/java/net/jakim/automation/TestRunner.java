package net.jakim.automation;

import cucumber.api.CucumberOptions;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;
import org.junit.Before;
import org.junit.runner.RunWith;

@RunWith( CucumberWithSerenity.class )
@CucumberOptions(
        plugin =
                {
                        "json:target/cucumber.json",
                        "junit:target/cucumber.xml"
                },
        features = "src/test/resources/features",
        //features = "src/test/resources/features",
        glue = "net.jakim.automation.steps.definition",
        tags = "@reporting"
)
public class TestRunner
{

}




