package net.jakim.automation.pages;

import net.jakim.automation.pages.elements.TestMainMenu;
import net.jakim.automation.pages.elements.TestMainMenuInterface;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@DefaultUrl ( "/" )
public class JackLandingPage
    extends PageObject
{
    private static final Logger logger = LoggerFactory.getLogger( JackLandingPage.class );

    public JackLandingPage( WebDriver driver )
    {
        super( driver );
    }

    @FindBy ( css = "nav.main-nav" )
    private TestMainMenuInterface mainMenu;

    @FindBy ( id = "js-main-header" )
    private WebElement mainHeader;

    @FindBy ( className = "main-nav" )
    private WebElement mainMenuElement;

    public JackLandingPage getmenuItems( )
    {
        logger.info (this.mainHeader.getText());
        logger.info( this.mainMenu.getAllMenuItems( ) );
        logger.debug( this.mainMenu.getAllMenuItems( ) );
        System.out.println( " The menus are: " + this.mainMenu.getAllMenuItems( ) );

        return this;
    }

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
