package pages.autotest;

import com.fasterxml.jackson.databind.JsonNode;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utilities.autotest.DataFileReader;

public class LoginPage {

    WebDriver driver;
    JsonNode data;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.initData();
    }

    @FindBy(how = How.NAME, using = "userName")
    private WebElement username;

    @FindBy(how = How.NAME, using = "password")
    private WebElement password;

    @FindBy(how = How.NAME, using = "login")
    private WebElement loginButton;

    public void initData(){
        DataFileReader dataFileReader = new DataFileReader("LoginCredentials.yml");
        this.data = dataFileReader.getData();
    }

    public boolean checkLoginPage(){
        return username.isDisplayed();
    }

    public void loginToApplication(){
        JsonNode userData = data.get("default-user");
        username.sendKeys(userData.get("username").asText());
        password.sendKeys(userData.get("password").asText());
        loginButton.click();
    }

}
