package step_definitions.autotest;

import core.autotest.driver.StepsStartHook;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.Assert;

import org.openqa.selenium.WebDriver;
import pages.autotest.LoginPage;
import pages.autotest.FlightFinderPage;

public class LoginSteps{

    WebDriver driver;
    LoginPage loginPage;
    FlightFinderPage flightFinderPage;

    public LoginSteps(StepsStartHook stepsStartHook){
        this.driver = stepsStartHook.getDriver();
    }

    @Given("^I am at the login page$")
    public void iAmAtTheLoginPage() throws Throwable {
        loginPage = new LoginPage(driver);
        Assert.assertTrue(loginPage.checkLoginPage());
    }

    @When("^I login to the application$")
    public void iLoginToTheApplication() throws Throwable {
        loginPage.loginToApplication();
    }

    @Then("^I navigate to the Flight Finder page of the application$")
    public void iNavigateToTheFlightFinderPageOfTheApplication() throws Throwable {
        flightFinderPage = new FlightFinderPage(driver);
        Assert.assertTrue(flightFinderPage.visibilityOfPassengerCount());
    }

    @And("^I see the action for move to footer happed$")
    public void iSeeTheActionForMoveToFooterHapped() throws Throwable {
       flightFinderPage.moveToFooter();
    }
}
