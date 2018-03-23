package pages.autotest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class FlightFinderPage {

    @FindBy(how = How.NAME, using = "passCount")
    private WebElement passengerCount;

    public boolean visibilityOfPassengerCount(){
        return passengerCount.isDisplayed();
    }
}
