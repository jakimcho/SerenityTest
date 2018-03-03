package net.jakim.automation.page.elements;

import net.jakim.automation.page.objects.AllProductsPage;
import net.jakim.automation.page.objects.HomePage;
import net.jakim.automation.page.objects.ProductCategoryPage;
import org.openqa.selenium.*;

import java.util.List;

public class MenuWebElement implements WebElement {

    private WebElement navMenuContainer;
    private final String HOME_MENU_ITEM_SELECTOR = "menu-item-15";
    private final String PRODUCT_CATEGORY_MENU_ITEM_SELECTOR = "menu-item-33";
    private final String ALL_PRODUCTS_MENU_ITEM_SELECTOR = "menu-item-72";
    //private final String PROBLEM_MENU_ITEM_SELECTOR = "menu-item-16";

    public HomePage clickOnHomeMenuItem(){
        this.navMenuContainer.findElement(By.id(this.HOME_MENU_ITEM_SELECTOR)).click();
        return new HomePage();
    }

    public AllProductsPage clickOnAllProductsMenuItem(){
        this.navMenuContainer.findElement(By.id(this.ALL_PRODUCTS_MENU_ITEM_SELECTOR)).click();
        return new AllProductsPage();
    }

    public ProductCategoryPage clickOnProductCategoryMenuItem(){
        this.navMenuContainer.findElement(By.id(this.PRODUCT_CATEGORY_MENU_ITEM_SELECTOR)).click();
        return new ProductCategoryPage();
    }


    public MenuWebElement(WebElement menuContainer) {
        this.navMenuContainer = menuContainer;
    }

    public void click() {
        System.out.println("What do you expect by clicking on the menu???");
    }

    public void submit() {
        System.out.println("What do you expect by submitting the menu???");

    }

    public void sendKeys(CharSequence... charSequences) {
        System.out.println("What do you expect by typing in the menu???");
    }

    public void clear() {
        System.out.println("What do you expect by clearing the menu???");
    }

    public String getTagName() {
        return this.navMenuContainer.getTagName();
    }

    public String getAttribute(String s) {
        return this.navMenuContainer.getAttribute(s);
    }

    public boolean isSelected() {
        System.out.println("Do you expect the menu to be selectable ???");
        return false;
    }

    public boolean isEnabled() {
        System.out.println("Do you expect the menu to be selectable ???");

        return false;
    }

    public String getText() {
        System.out.println("What do you expect by getting the text of the menu???");
        return "";
    }

    public List<WebElement> findElements(By by) {
        return this.navMenuContainer.findElements(by);
    }

    public WebElement findElement(By by) {
        return this.navMenuContainer.findElement(by);
    }

    public boolean isDisplayed() {
        return this.navMenuContainer.isDisplayed();
    }

    public Point getLocation() {
        return this.navMenuContainer.getLocation();
    }

    public Dimension getSize() {
        return this.navMenuContainer.getSize();
    }

    public Rectangle getRect() {
        return this.navMenuContainer.getRect();
    }

    public String getCssValue(String s) {
        return this.navMenuContainer.getCssValue(s);
    }

    public <X> X getScreenshotAs(OutputType<X> outputType) throws WebDriverException {
        return this.navMenuContainer.getScreenshotAs(outputType);
    }
}
