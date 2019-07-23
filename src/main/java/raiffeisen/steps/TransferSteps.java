package raiffeisen.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import raiffeisen.pages.TransferPage;

public class TransferSteps {

    TransferPage transferPage = new TransferPage();

    @And("выбрать пункт \"(.*)\"")
    public void selectMenuItem(String menuItem){
        transferPage.selectMenuItem(transferPage.pageNavigation, menuItem);
    }

    @And("выбрать карту списания \"(.*)\"")
    public void  selectCard (String card){
        transferPage.selectSourceCard(card);
    }

    @And("ввести номер несуществующей карты в поле \"(.*)\"")
    public void  inputDestinationCard (String number){
        transferPage.fillDestinationCardNumber(number);
    }

    @Then("выводится ошибка")
    public void  checkError (){
        transferPage.checkErrorMessage();
    }
}
