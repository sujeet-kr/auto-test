package core.autotest.driver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;

import utilities.autotest.DataFileReader;

public class StepsStartHook {

    public static boolean initialized = false;
    private WebDriver driver;

    @Before
    public void beforeScenario() throws Exception {
        if(!initialized){
            this.driver = new DriverFactory().createWebDriver();
            initialized = true;
            DataFileReader envData = new DataFileReader("EnvironmentDetails.yml");
            driver.get(envData.getEnvironmentData().get("System-Testing").get("url").asText());
        }
    }

    @After
    public void afterScenario(){
        this.driver.quit();
        this.driver = null;
    }

    public WebDriver getDriver() {
        return this.driver;
    }
}
