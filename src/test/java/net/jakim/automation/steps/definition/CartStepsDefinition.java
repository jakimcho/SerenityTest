package net.jakim.automation.steps.definition;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.junit.Assertions;
import net.jakim.automation.steps.libraries.PersonSteps;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

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

    @Given("^\"([^\"]*)\" page is opened$")
    public void page_is_opened(String arg1) throws Exception {
        System.out.println("page is opened: " + arg1);
    }

    @Given("^The \"([^\"]*)\" form is opened$")
    public void the_form_is_opened(String arg1) throws Exception {
        System.out.println("form is opened" + arg1);
    }

    @When("^The user enters valid details in all fields$")
    public void the_user_enters_valid_details_in_all_fields() throws Exception {
        System.out.println("The user enters valid details in all fields");
    }

    @When("^Submits the registration form$")
    public void submits_the_registration_form() throws Exception {
        System.out.println("Submits the registration form");
    }

    @Then("^The user is registered successfully and is logged into the website$")
    public void the_user_is_registered_successfully_and_is_logged_into_the_website() throws Exception {
        System.out.println("The user is registered successfully and is logged into the website");
    }

    @Then("^The account balance is \"([^\"]*)\" virtual chips$")
    public void the_account_balance_is_virtual_chips(String arg1) throws Exception {
        System.out.println("The account balance is: " + arg1.toString());
    }

    @When("^the player completes the Login form:$")
    public void the_player_completes_the_Login_form(DataTable arg1) throws Exception {
        System.out.println("the player completes the Login form: " + arg1.toString());
    }

    @Then("^player \"([^\"]*)\" is successfully logged into the website$")
    public void player_is_successfully_logged_into_the_website(String arg1) throws Exception {
        Assert.assertTrue("Just a dummy assertion", true);
    }

    @Then("^\"([^\"]*)\" message for \"([^\"]*)\" should appear on Login form$")
    public void message_for_should_appear_on_Login_form(String arg1, String arg2) throws Exception {
        Assert.assertTrue("Just a dummy assertion", false);
    }


}
