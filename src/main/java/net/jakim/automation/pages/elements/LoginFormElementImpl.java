package net.jakim.automation.pages.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginFormElementImpl
    extends ModalDialogGeneralImpl
{

    @FindBy ( id = "username" )
    private WebElement userNameFieldElement;

    @FindBy ( id = "password" )
    private WebElement passwordFieldElement;

    @FindBy ( css = "input[type='checkbox'][value='remember']" )
    private WebElement rememberMeCheckBoxElement;

    @FindBy ( css = "input[type='submit']" )
    private WebElement loginButtonElement;

    @FindBy ( css = "label.error" )
    private List<WebElement> errorMessagesElements;

    public LoginFormElementImpl( final ModalDialogElement modalDialog )
    {
        super( modalDialog.getWrappedDriver( ),
               modalDialog.getLocator( ),
               modalDialog.getWrappedElement( ),
               modalDialog.getImplicitTimeoutInMilliseconds( ) );

        PageFactory.initElements( modalDialog.getWrappedDriver( ),
                                  this );
    }

    public LoginFormElementImpl fillUserName(String name){
        this.userNameFieldElement.clear();
        this.userNameFieldElement.sendKeys( name );

        return this;
    }


    public LoginFormElementImpl fillPassword(String password){
        this.passwordFieldElement.clear();
        this.passwordFieldElement.sendKeys( password );

        return this;
    }

    public LoginFormElementImpl checkRememberMe(boolean shouldRemember){
        if (this.rememberMeCheckBoxElement.isSelected() != shouldRemember){
            this.rememberMeCheckBoxElement.click();
        }

        return this;
    }

}
