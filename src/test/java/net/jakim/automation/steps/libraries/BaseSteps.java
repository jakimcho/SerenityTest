package net.jakim.automation.steps.libraries;

import net.jakim.automation.pages.JackLandingPage;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;


public class BaseSteps
{

    JackLandingPage landingPage;

    @Step
    public void opens_Website(String page )
    {
        PageObject pageToOpen = null;
        switch ( page.toLowerCase().trim() ){
            case "landing":
                pageToOpen = landingPage;
                break;
        }

        landingPage.open( );
    }

    @Step
    public void checksMenuItems( )
    {
        this.landingPage.getmenuItems( );
    }

}
