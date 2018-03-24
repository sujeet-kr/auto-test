package core.autotest.driver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;

public class StepsStartHook {

    public static boolean initialized = false;
    private WebDriver driver;

    @Before
    public void beforeScenario() throws Exception {
        if(!initialized){
            this.driver = new DriverFactory().createWebDriver();
            initialized = true;
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
