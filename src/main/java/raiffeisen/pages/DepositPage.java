package raiffeisen.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DepositPage extends BasePage{

    @FindBy(xpath = "//a[@class='left-sidebar__item']")
    public List<WebElement> leftSidebar;

    @FindBy(xpath = "//section[@class='product-widget product-widget_deposit']")
    public List<WebElement> placeMoney;
}
