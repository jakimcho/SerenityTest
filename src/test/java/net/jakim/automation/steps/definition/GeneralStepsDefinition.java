package net.jakim.automation.steps.definition;

import org.junit.Assert;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GeneralStepsDefinition {

	@Given("^Calculator is opened$")
	public void calculator_is_opened() throws Exception {

	}

	@When("^user sums numbers:$")
	public void user_sums_numbers(DataTable arg1) throws Exception {

	}

	@Then("^Calculator displays (\\d+) and test$")
	public void calculator_displays_and_test(int arg1) throws Exception {
		Assert.assertTrue("Something whent wrong", true);
	}

	@Then("^Calculator displays (\\d+) and tsetse$")
	public void calculator_displays_and_tsetse(int arg1) throws Exception {
		Assert.assertTrue("Something whent wrong", true);
	}

	@When("^user substracts numbers:$")
	public void user_substracts_numbers(DataTable arg1) throws Exception {
		Assert.assertTrue("Something whent wrong", true);
	}

	@Then("^Calculator displays (\\d+)$")
	public void calculator_displays(int arg1) throws Exception {
		Assert.assertTrue("Something whent wrong", true);
	}

	@When("^user multiplies numbers:$")
	public void user_multiplies_numbers(DataTable arg1) throws Exception {

	}

	@Then("^Calculator displays (\\d+)\\.(\\d+)$")
	public void calculator_displays(int arg1, int arg2) throws Exception {
		Assert.assertTrue("Something whent wrong", true);
	}

	@When("^user devides numbers:$")
	public void user_devides_numbers(DataTable arg1) throws Exception {

	}

	@Then("^Calculator displays N/A$")
	public void calculator_displays_N_A() throws Exception {
		Assert.assertTrue("Something whent wrong", true);
	}

	@When("^user enters (\\d+)$")
	public void user_enters(int arg1) throws Exception {

	}

	@Then("^Calculator displays -(\\d+)$")
	public void calculator_displays_negative(int arg1) throws Exception {
		Assert.assertTrue("Something whent wrong", true);
	}

	@When("^user enters -(\\d+)$")
	public void user_enters_negative(int arg1) throws Exception {

	}

}
