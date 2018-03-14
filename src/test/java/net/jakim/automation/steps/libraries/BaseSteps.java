package net.jakim.automation.steps.libraries;

import net.jakim.automation.pages.BasePage;
import net.jakim.automation.pages.LandingPage;
import net.thucydides.core.annotations.Step;

public class BaseSteps
{

    BasePage anyPage;
    LandingPage landingPage;

    @Step
    public void startFromPage( String page )
    {
        BasePage pageToOpen = null;
        switch ( page.toLowerCase().trim() ){
            case "landing":
                pageToOpen = landingPage;
                break;
        }

        pageToOpen.open( );
    }

    @Step
    public void openForm( String form )
    {

        switch ( form.toLowerCase().trim() ){
            case "login":
                anyPage.clickLogin();
                break;
        }
    }

    @Step
    public void checksMenuItems( )
    {
        this.anyPage.getmenuItems( );
    }

}
