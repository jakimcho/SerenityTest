package net.jakim.automation.pages.elements;

import net.serenitybdd.core.pages.WebElementFacadeImpl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.ElementLocator;

public class HeaderElementImpl
    extends WebElementFacadeImpl
    implements HeaderElement
{

    @FindBy ( xpath = "//a[text()='Login']" )
    private WebElement loginButtonElement;

    public HeaderElementImpl( final WebDriver driver,
                              final ElementLocator locator,
                              final WebElement webElement,
                              final long implicitTimeoutInMilliseconds,
                              final long waitForTimeoutInMilliseconds,
                              final By bySelector )
    {
        super( driver,
               locator,
               webElement,
               implicitTimeoutInMilliseconds,
               waitForTimeoutInMilliseconds,
               bySelector );

        PageFactory.initElements( driver,
                                  this );
    }

    @Override
    public void clickLogin( )
    {
        this.loginButtonElement.click( );

    }
}
