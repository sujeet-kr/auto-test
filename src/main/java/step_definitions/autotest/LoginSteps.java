package step_definitions.autotest;

import core.autotest.driver.Steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.Assert;

import core.autotest.driver.DriverBI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.autotest.LoginPage;
import pages.autotest.FlightFinderPage;

public class LoginSteps {

    WebDriver driver;
    LoginPage loginPage;
    FlightFinderPage flightFinderPage;

    public LoginSteps() throws Exception {
        driver = new DriverBI().createWebDriver();
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        flightFinderPage = PageFactory.initElements(driver, FlightFinderPage.class);
    }

    @Given("^I am at the login page$")
    public void iAmAtTheLoginPage() throws Throwable {
        driver.get("http://newtours.demoaut.com/");
    }

    @When("^I login to the application$")
    public void iLoginToTheApplication() throws Throwable {
        loginPage.loginToApplication();
    }

    @Then("^I navigate to the Flight Finder page of the application$")
    public void iNavigateToTheFlightFinderPageOfTheApplication() throws Throwable {
        Assert.assertTrue(flightFinderPage.visibilityOfPassengerCount());
    }
}
