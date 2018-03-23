package core.autotest.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

public class DriverBI {

    private WebDriver driver;
    private String driverLocation = "/Users/MacJae/WebDriverServers/";
    private String browserName = "Chrome";

    public DriverBI(){
        System.setProperty("webdriver.gecko.driver", driverLocation + "geckodriver" );
        System.setProperty("webdriver.chrome.driver", driverLocation + "chromedriver");
    }

    public WebDriver createWebDriver() throws Exception {

        switch ( browserName.toUpperCase() ){
            case "CHROME":
                driver = new ChromeDriver();
                break;
            case "FIREFOX":
                driver = new FirefoxDriver();
                break;
            case "SAFARI":
                driver = new SafariDriver();
                break;
            case "IE":
                driver = new InternetExplorerDriver();
            default:
                throw new Exception();
        }

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }

}
