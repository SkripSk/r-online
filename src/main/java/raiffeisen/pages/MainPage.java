package raiffeisen.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import raiffeisen.annotaiton.FieldName;
import raiffeisen.util.DriverManager;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;


public class MainPage extends BasePage {

    @FindBy(xpath = "//a[@class='login-sidebar-left__item'][@href='/demo/']")
    public WebElement demo;

    @FindBy(xpath = "//*[@class='one-click-popup__close icon']")
    public WebElement popup;

    @FindBy(xpath = "//a[contains (@class,'actions-menu__item actions-menu__item_')]")
    public List<WebElement> actionsMenu;


}
