package net.jakim.automation;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin =
                {
                        "json:target/cucumber.json",
                        "junit:target/cucumber.xml"
                },
        features = "src/test/resources/features/",
        glue = { "net.jakim.automation.steps.definition", "net.jakim.automation.transformers" },
        snippets = SnippetType.CAMELCASE,
        tags = "@jr:debug")
public class Runner
{
}
