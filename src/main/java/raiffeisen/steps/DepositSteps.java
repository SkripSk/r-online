package raiffeisen.steps;

import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import raiffeisen.pages.DepositPage;
import raiffeisen.util.DriverManager;

import java.util.List;
import java.util.Random;

public class DepositSteps {

    DepositPage depositPage = new DepositPage();

    @When("выбрать \"(.*)\"")
    public void selectMenuItem(String menuItem) {
        depositPage.selectMenuItem(depositPage.leftSidebar, menuItem);
    }

    @When("поплнить вклад \"(.*)\"")
    public void selectPlaceMoney(String menuItem) throws Exception {
        for(int i = 0; i < 100; i++) {
            System.out.println(new Random().nextInt(8));
        }
        try {
        for(WebElement element: depositPage.placeMoney) {
            WebElement header = element.findElement(By.className("ng-star-inserted"));
            Thread.sleep(2_000);
            System.out.println(header.getText());

            if (header.getText().contains(menuItem)) {
                List<WebElement> button = element.findElements(By.tagName("button"));
//                Thread.sleep(2_000);
                for(WebElement e: button) {
                    System.out.println();
                    if (e.getText().equals("Пополнить вклад")) {
                        depositPage.click(e);
                        Thread.sleep(3_000);
                        return;
                    }
                }
                System.out.println();
//                button.click();
            }
        }


        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

}
