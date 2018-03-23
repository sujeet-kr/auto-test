package pages.autotest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

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
