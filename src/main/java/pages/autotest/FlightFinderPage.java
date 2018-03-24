package pages.autotest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class FlightFinderPage {

    WebDriver driver;

    public FlightFinderPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(how = How.NAME, using = "passCount")
    private WebElement passengerCount;

    public boolean visibilityOfPassengerCount(){
        return passengerCount.isDisplayed();
    }
}
