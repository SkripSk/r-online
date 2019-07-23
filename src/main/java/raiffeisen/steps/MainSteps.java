package raiffeisen.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import raiffeisen.pages.MainPage;

/**
 * Данный класс предназначен для выполнения действий, котоыре нужны в каждом сценарии
 */
public class MainSteps {

    MainPage mainPage = new MainPage();

    @When("выбрать Демо-версия")
    public void selectSidebarDemo(){
        mainPage.click(mainPage.demo);
    }

    @And("закрыть всплывающее окно")
    public void closePopup(){
        mainPage.click(mainPage.popup);
    }

    @And("выбрать раздел \"(.*)\"")
    public void selectMenuItem(String menuItem){
        mainPage.selectMenuItem(mainPage.actionsMenu, menuItem);
    }
}
