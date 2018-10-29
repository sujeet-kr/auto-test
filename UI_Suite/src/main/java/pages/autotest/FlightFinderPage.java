package pages.autotest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
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

    @FindBy(how = How.CLASS_NAME, using = "footer")
    private WebElement footer;

    public boolean visibilityOfPassengerCount(){
        return passengerCount.isDisplayed();
    }

    public void moveToFooter(){
        Actions action = new Actions(driver);
        Action actionSeries = action
                .moveToElement(footer)
                .doubleClick(footer)
                .build();
        actionSeries.perform();
    }
}
