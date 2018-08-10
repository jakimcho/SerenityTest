package net.jakim.automation.steps.definition;

import cucumber.api.Transpose;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import net.jakim.automation.steps.libraries.PersonSteps;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class GeneralStepsDefinition
{

    @Steps
    PersonSteps personSteps;


    @When( "^I add to Cart items?:$" )
    public void iAddToCartItems( List<String> items )
    throws
    Exception
    {
        for( String item : items )
        {
            personSteps.addItem( item );
        }
    }

    @Then( "^I should see (\\d+) items? in the Cart$" )
    public void iShouldSeeItemsInTheCart( int itemsNumber )
    throws
    Exception
    {
        System.out.printf( "just testing" );
    }

    @Given( "^I have (\\d+) items? in the Cart$" )
    public void iHaveItemsInTheCart( int itemsCount )
    throws
    Exception
    {
        System.out.printf( "just testing" );
    }

    @When( "^I remove the (\\d+)(?:st|nd|rd|rth) item from the Cart$" )
    public void iRemoveTheStItemFromTheCart( int itemNumber )
    throws
    Exception
    {
        System.out.printf( "just testing" );
    }

    @When( "^Start the checkout process with billing detils:$" )
    public void startTheCheckoutProcessWithBillingDetails( @Transpose DataTable billingDetails )
    throws
    Exception
    {
        System.out.printf( "just testing" );
    }

    @When( "^I purchase$" )
    public void iPurchase()
    throws
    Exception
    {
        System.out.printf( "just testing" );
    }

    @Then( "^I should see the total amount of my order$" )
    public void iShouldSeeTheTotalAmountOfMyOrder()
    throws
    Exception
    {
        System.out.printf( "just testing" );
    }

    @Given( "^Login page is open$" )
    public void loginPageIsOpen()
    throws
    Throwable
    {
        System.out.printf( "just testing" );
    }

    @When( "^I complete login form:$" )
    public void iCompleteLoginForm( DataTable dataTable )
    throws
    Throwable
    {
        System.out.printf( "just testing" );
    }

    @Then( "^system let me log in successfully$" )
    public void systemLetMeLogInSuccessfully()
    throws
    Throwable
    {
        System.out.printf( "just testing" );
    }

    @Given( "^I'm logged in my account$" )
    public void iMLoggedInMyAccount()
    throws
    Throwable
    {
        System.out.printf( "just testing" );
    }

    @When( "^I logout$" )
    public void iLogout()
    throws
    Throwable
    {
        System.out.printf( "just testing" );
    }

    @Then( "^system destroy my sesison$" )
    public void systemDestroyMySesison()
    throws
    Throwable
    {
        System.out.printf( "just testing" );
    }
}
