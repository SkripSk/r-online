package raiffeisen.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import raiffeisen.util.DriverManager;

import java.util.List;

/**
 * Данный класс содержит реализацию наиболее общих шагов.
 */
public class BasePage {

    public WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), 20);

    public BasePage() {
        PageFactory.initElements(DriverManager.getDriver(), this);
    }

    public void click2(By by){
        wait.until(ExpectedConditions.elementToBeClickable(by)).click();
    }

    public void click(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    public void selectMenuItem(List<WebElement> menuItems, String itemName) {
        for (WebElement item : menuItems) {
            if (item.getText().equalsIgnoreCase(itemName)) {
                click(item);
                return;
            }
        }
        Assert.fail("Не найден элмент коллеции - " + itemName);
    }

    public void selectCard(List<WebElement> menuItems, String itemName) {

        for (WebElement item : menuItems) {
            if (item.getAttribute("title").contains(itemName)) {
                click(item);
                return;
            }
        }
        Assert.fail("Не найдена карта - " + itemName);
    }

}
