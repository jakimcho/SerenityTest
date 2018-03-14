package net.jakim.automation.pages;

import net.jakim.automation.pages.elements.HeaderElement;
import net.jakim.automation.pages.elements.LoginFormElementImpl;
import net.jakim.automation.pages.elements.MainMenuElement;
import net.jakim.automation.pages.elements.ModalDialogElement;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasePage
    extends PageObject
{
    protected  Logger logger = LoggerFactory.getLogger( this.getClass());

    @FindBy ( tagName = "header" )
    protected HeaderElement headerElement;

    @FindBy ( css = "nav.main-nav" )
    protected MainMenuElement mainMenuElement;

    @FindBy ( id = "js-dialog-overlay-content" )
    protected ModalDialogElement modalDialogElement;

    public LoginFormElementImpl openLoginForm( )
    {

        return new LoginFormElementImpl( this.modalDialogElement );
    }


    public BasePage getmenuItems( )
    {
        logger.info( this.mainMenuElement.getText( ) );
        logger.info( this.mainMenuElement.getAllMenuItems( ) );
        logger.debug( this.mainMenuElement.getAllMenuItems( ) );
        System.out.println( " The menus are: " + this.mainMenuElement.getAllMenuItems( ) );

        return this;
    }

    public BasePage clickLogin(){
        this.headerElement.clickLogin();

        return this;
    }

}
