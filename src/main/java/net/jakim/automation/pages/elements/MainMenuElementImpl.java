package net.jakim.automation.pages.elements;

import net.serenitybdd.core.pages.WebElementFacadeImpl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.ElementLocator;

import java.util.List;

public class MainMenuElementImpl
    extends WebElementFacadeImpl implements MainMenuElement
{
    public MainMenuElementImpl( final WebDriver driver,
                                final ElementLocator locator,
                                final WebElement webElement,
                                final long implicitTimeoutInMilliseconds,
                                final long waitForTimeoutInMilliseconds )
    {
        super( driver,
               locator,
               webElement,
               implicitTimeoutInMilliseconds,
               waitForTimeoutInMilliseconds);

        PageFactory.initElements( driver, this);
    }

    @FindBy( css = "li.main-nav__link--tournaments" )
    private WebElement item;
    @FindBy (className = "main-nav__link")
    private List<WebElement> menuItems;

    public String getAllMenuItems(){
        StringBuilder sb = new StringBuilder(  );
        sb.append( item.getText() );
        for (WebElement el : menuItems){
            sb.append( ", Menu Item: " ).append( el.getText() );
        }

        return sb.toString();
    }

}
