package raiffeisen.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import raiffeisen.pages.DepositPage;


public class DepositSteps {

    DepositPage depositPage = new DepositPage();

    @And("выбрать \"(.*)\"")
    public void selectMenuItem(String menuItem) {
        depositPage.selectMenuItem(depositPage.leftSidebar, menuItem);
    }

    @And("пополнить вклад \"(.*)\"")
    public void selectPlaceMoney(String depositName) {
        depositPage.selectDeposit(depositName);
    }

    @And("выбрав случайный счёт, ввести сумму не превышающую сумму на счёте")
    public void selectRandomAccount() {
        depositPage.selectRandomAccount();
    }

    @And("ввести смс код \"(.*)\"")
    public void fillSMSCode(String code){
        depositPage.fillSmsCode(code);
    }

    @Then("должно повиться сообщение: \"(.*)\"")
    public void checkSuccessMessage(String message){
        depositPage.checkSuccessMessage(message);
    }
}


