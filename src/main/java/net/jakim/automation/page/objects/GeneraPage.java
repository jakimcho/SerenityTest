package net.jakim.automation.page.objects;

import net.jakim.automation.page.elements.MenuWebElement;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class GeneraPage extends PageObject {

    @FindBy(id = "main-nav")
    private WebElement menuElementContainer;


    public HomePage clickOnHomeMenuItem() {
        MenuWebElement menuWebElement = new MenuWebElement(menuElementContainer);
        return menuWebElement.clickOnHomeMenuItem();
    }

    public AllProductsPage clickOnAllProductsMenuItem() {
        MenuWebElement menuWebElement = new MenuWebElement(menuElementContainer);
        return menuWebElement.clickOnAllProductsMenuItem();
    }

    public ProductCategoryPage clickOnProductCategoryMenuItem() {
        MenuWebElement menuWebElement = new MenuWebElement(menuElementContainer);
        return menuWebElement.clickOnProductCategoryMenuItem();
    }

}
