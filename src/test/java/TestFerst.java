import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

public class TestFerst {
    WebDriverWait wait;
    private static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    @Before
    public void startScenario() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        wait  = new WebDriverWait(driver, 60);

        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @After
    public void afterMethod() {
        driver.quit();
    }
}
