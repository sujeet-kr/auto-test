package pages.autotest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utilities.autotest.DataFileReader;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.NAME, using = "userName")
    private WebElement username;

    @FindBy(how = How.NAME, using = "password")
    private WebElement password;

    @FindBy(how = How.NAME, using = "login")
    private WebElement loginButton;

    public void loginToApplication(){

        String dataUsername = "mercury";
        String dataPassword = "mercury";

        username.sendKeys(dataUsername);
        password.sendKeys(dataPassword);
        loginButton.click();

    }

}
