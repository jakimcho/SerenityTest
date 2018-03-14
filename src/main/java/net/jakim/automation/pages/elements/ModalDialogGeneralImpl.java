package net.jakim.automation.pages.elements;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.pages.WebElementFacadeImpl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.ElementLocator;

public class ModalDialogGeneralImpl
    extends WebElementFacadeImpl
    implements ModalDialogElement
{
    private WebDriver driver;

    public ModalDialogGeneralImpl( final WebDriver driver,
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

        this.driver = driver;
    }

    public ModalDialogGeneralImpl( final WebDriver driver,
                                   final ElementLocator locator,
                                   final WebElement webElement,
                                   final long implicitTimeoutInMilliseconds )
    {
        super( driver,
               locator,
               webElement,
               implicitTimeoutInMilliseconds );

        this.driver = driver;
    }


    @Override
    public WebDriver getWrappedDriver(){
        return this.driver;
    }

}
