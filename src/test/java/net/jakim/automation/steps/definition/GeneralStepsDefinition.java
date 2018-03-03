package net.jakim.automation.steps.definition;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.Transpose;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.jakim.automation.steps.libraries.PersonSteps;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class GeneralStepsDefinition {

    @Steps
    PersonSteps personSteps;


    @When("^I add to Cart items?:$")
    public void iAddToCartItems(List<String> items) throws Exception {
        for(String item : items ){
            personSteps.addItem(item);
        }
    }

    @Then("^I should see (\\d+) items? in the Cart$")
    public void iShouldSeeItemsInTheCart(int itemsNumber) throws Exception {
    }

    @Given("^I have (\\d+) items? in the Cart$")
    public void iHaveItemsInTheCart(int itemsCount) throws Exception {
    }

    @When("^I remove the (\\d+)(?:st|nd|rd|rth) item from the Cart$")
    public void iRemoveTheStItemFromTheCart(int itemNumber) throws Exception {
    }

    @When("^Start the checkout process with billing detils:$")
    public void startTheCheckoutProcessWithBillingDetails(@Transpose DataTable billingDetails) throws Exception {
    }

    @When("^I purchase$")
    public void iPurchase() throws Exception {
    }

    @Then("^I should see the total amount of my order$")
    public void iShouldSeeTheTotalAmountOfMyOrder() throws Exception {
    }
}
