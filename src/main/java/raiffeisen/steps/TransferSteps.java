package raiffeisen.steps;

import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import raiffeisen.pages.TransferPage;

public class TransferSteps {

    TransferPage transferPage = new TransferPage();

    @When("выбрать пункт \"(.*)\"")
    public void selectMenuItem(String menuItem){
        transferPage.selectMenuItem(transferPage.pageNavigation, menuItem);
    }

    @When("выбрать карту списания \"(.*)\"")
    public void  selectCard (String card){
        transferPage.click2(By.xpath("//input[@class='c-input-select__input c-input ng-pristine ng-valid ng-touched']"));
//        transferPage.click(transferPage.inputCard);
        transferPage.selectCard(transferPage.card, card);
    }
}
