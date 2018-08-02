package net.jakim.automation;

import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin =
                {
                        "json:target/cucumber.json",
                        "junit:target/cucumber.xml"
                },
        features = "test/resourcesfeatures/",
        glue = "net.jakim.automation.steps",
        snippets = SnippetType.CAMELCASE,
        tags = "@jr-debug")
public class TestRunner {
}


