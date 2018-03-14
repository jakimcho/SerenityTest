package net.jakim.automation.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@DefaultUrl ( "/" )
public class LandingPage
    extends BasePage
{
    private static final Logger logger = LoggerFactory.getLogger( LandingPage.class );



    @WhenPageOpens
    public void makeBrowserWindowFullScreen( )
    {
        this
            .getDriver( )
            .manage( )
            .window( )
            .maximize( );
    }

}
