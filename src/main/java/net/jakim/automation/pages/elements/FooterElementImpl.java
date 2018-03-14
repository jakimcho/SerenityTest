package net.jakim.automation.pages.elements;

import net.serenitybdd.core.pages.WebElementFacadeImpl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.ElementLocator;

public class FooterElementImpl
    extends WebElementFacadeImpl
    implements FooterElement
{
    public FooterElementImpl( final WebDriver driver,
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
    }
}
