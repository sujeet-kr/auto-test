package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs {
    @Given("^I am at the login page$")
    public void iAmAtTheLoginPage() throws Throwable {
        System.out.print("This is me 1");
    }

    @When("^I provide the login credentials$")
    public void iProvideTheLoginCredentials() throws Throwable {
        System.out.print("This is me 2");

    }

    @Then("^I land in the landing page of the application$")
    public void iLandInTheLandingPageOfTheApplication() throws Throwable {
        System.out.print("This is me 3");
    }
}
