package net.jakim.automation.steps.libraries;

import net.jakim.automation.page.objects.AllProductsPage;
import net.jakim.automation.page.objects.GeneraPage;
import net.jakim.automation.page.objects.HomePage;
import net.jakim.automation.page.objects.ProductCategoryPage;
import net.thucydides.core.annotations.Step;

public class PersonSteps {

    GeneraPage page;
    HomePage homePage;
    AllProductsPage allProductsPage;
    ProductCategoryPage productCategoryPage;

    @Step("Go to the site")
    public void openSite() {
        homePage.open();
    }

    @Step
    public void navigateToHomePage() {
        this.homePage.clickOnHomeMenuItem();
    }

    @Step
    public void navigateToAllProductsPage() {
        this.homePage.clickOnAllProductsMenuItem();
    }

    @Step
    public void navigateToProductCategoryPage() {
        this.homePage.clickOnProductCategoryMenuItem();
    }

    public void navigatePage(String pageName) {
        switch (pageName){
            case "Home":
                page.clickOnHomeMenuItem();
                break;
            case "All Products":
                page.clickOnAllProductsMenuItem();
                break;
            case "Product Category":
                page.clickOnProductCategoryMenuItem();
        }
    }

    @Step ("Adding {0} item to the Cart")
    public void addItem(String item) {
        productCategoryPage.addItemToCart(item);
    }
}
