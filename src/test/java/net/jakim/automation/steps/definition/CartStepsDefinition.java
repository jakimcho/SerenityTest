package net.jakim.automation.steps.definition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import net.jakim.automation.steps.libraries.PersonSteps;
import net.thucydides.core.annotations.Steps;

public class CartStepsDefinition {

    @Steps
    PersonSteps personSteps;

    @Given("^I am on \"([^\"]*)\" page$")
    public void iAmOnPage(String page) throws Exception {
        personSteps.openSite();
        switch (page){
            case "Home":
                personSteps.navigateToHomePage();
                break;
            case "All Products":
                personSteps.navigateToAllProductsPage();
                break;
            case "Product Category":
                personSteps.navigateToProductCategoryPage();
                break;
        }
    }

    @Given("^I have navigated to \"([^\"]*)\" page$")
    public void iHaveNavigatedToPage(String pageName) throws Exception {
        personSteps.navigatePage(pageName);
    }

}
