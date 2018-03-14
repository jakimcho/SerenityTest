package net.jakim.automation.steps;

import cucumber.api.java.en.Given;
import net.jakim.automation.steps.libraries.BaseSteps;
import net.thucydides.core.annotations.Steps;

public class LoginStepDefinition
{
    @Steps
    BaseSteps player;


    @Given("^\"([^\"]*)\" page is opened$")
    public void openSite(String page) throws Throwable {

        player.startFromPage( page );
        player.checksMenuItems();
    }

    @Given("^the \"([^\"]*)\" form is opened$")
    public void navigateToForm(String page) throws Throwable {

        player.startFromPage( page );
        player.checksMenuItems();
    }

}
