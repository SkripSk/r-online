package raiffeisen.steps;

import cucumber.api.java.en.When;
import raiffeisen.pages.MainPage;

public class MainSteps {

    MainPage mainPage = new MainPage();

    @When("выбрать Демо-версия")
    public void selectSidebarDemo(){
        mainPage.click(mainPage.demo);
    }

    @When("закрыть всплывающее окно")
    public void closePopup(){
        mainPage.click(mainPage.popup);
    }

    @When("выбрать раздел \"(.*)\"")
    public void selectMenuItem(String menuItem){
        mainPage.selectMenuItem(mainPage.actionsMenu, menuItem);
    }

}
