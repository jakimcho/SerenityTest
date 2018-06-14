package net.jakim.automation;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty" ,"html:Folder_Name" ,
                "json:target/cucumber.json" ,
                "junit:target/cucumber.xml"},
        features = "xray-features/",
        //features = "src/test/resources/features",
        glue = "net.jakim.automation.steps.definition"
)
public class TestRunner {

}
