package raiffeisen.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class TransferPage extends BasePage {

    @FindBy(xpath = "//div[contains (@class,'page-navigation-item')]")
    public List<WebElement> pageNavigation;

    @FindBy(xpath = "//div[@class='rc-select__select-template__text']")
    public List<WebElement> card;

    @FindBy(xpath = "//input[@class='c-input-select__input c-input ng-pristine ng-valid ng-touched']")
    public WebElement inputCard;
}
