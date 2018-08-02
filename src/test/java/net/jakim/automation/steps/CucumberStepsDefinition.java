package net.jakim.automation.steps;

import cucumber.api.java.en.Given;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CucumberStepsDefinition
{
    static Logger logger = LoggerFactory.getLogger( CucumberStepsDefinition.class );

    @Given( "I have {float} red balls")
    public void iHaveNumber(double number){
        logger.info( "I've gotten number {} ", number );
    }
}
