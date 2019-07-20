import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class TestSecond extends TestFerst {
    @Test
    public void enter() {
        WebDriver driver = getDriver();
        driver.get("https://online.raiffeisen.ru");
    }
}
