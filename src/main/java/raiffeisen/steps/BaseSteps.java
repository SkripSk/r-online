package raiffeisen.steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import raiffeisen.util.DriverManager;
import raiffeisen.util.TestProperties;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

/**
 * Данный класс предназначен для открытия браузера перед выполнением теста и закрытием после выполнения.
 */

public class BaseSteps {

    public static Properties properties = TestProperties.getInstance().getProperties();

    /**
     * @param "app.url" - app.url из конфига
     */
    @Before
    public void startScenario() {
        WebDriver driver = DriverManager.getDriver();
        driver.get(properties.getProperty("app.url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
    }

    @After
    public void afterMethod() {
        DriverManager.quitDriver();
    }
}
