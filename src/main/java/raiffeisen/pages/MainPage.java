package raiffeisen.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;


public class MainPage extends BasePage {

    @FindBy(xpath = "//a[@class='login-sidebar-left__item'][@href='/demo/']")
    public WebElement demo;

    @FindBy(xpath = "//*[@class='one-click-popup__close icon']")
    public WebElement popup;

    @FindBy(xpath = "//a[contains (@class,'actions-menu__item actions-menu__item_')]")
    public List<WebElement> actionsMenu;

}
