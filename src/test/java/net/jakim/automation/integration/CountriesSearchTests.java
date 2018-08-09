package net.jakim.automation.integration;

import net.jakim.automation.steps.rest.CountriesSearchSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.WithTag;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith( SerenityRunner.class )
public class CountriesSearchTests
{

    @Steps
    CountriesSearchSteps countriesSearchSteps;

    @Test
    @WithTag("integration:sanity")
    public void verifyThatWeCanFindUnitedStatesOfAmericaCountryUsingTheCodeUS()
    {
        countriesSearchSteps.searchCountryByCode( "US" );
        countriesSearchSteps.searchIsExecutedSuccesfully();
        countriesSearchSteps.iShouldFindCountry( "United States of America" );
    }

    @Test
    @WithTag("integration:sanity")
    public void verifyThatWeCanFindIndiaCountryUsingTheCodeIN()
    {
        countriesSearchSteps.searchCountryByCode( "IN" );
        countriesSearchSteps.searchIsExecutedSuccesfully();
        countriesSearchSteps.iShouldFindCountry( "India" );
    }

    @Test
    @WithTag("integration:sanity")
    public void verifyThatWeCanFindBrazilCountryUsingTheCodeBR()
    {
        countriesSearchSteps.searchCountryByCode( "BR" );
        countriesSearchSteps.searchIsExecutedSuccesfully();
        countriesSearchSteps.iShouldFindCountry( "Brazil" );
    }
}
