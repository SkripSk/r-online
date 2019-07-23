package raiffeisen.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class TransferPage extends BasePage {

    @FindBy(xpath = "//div[contains (@class,'page-navigation-item')]")
    public List<WebElement> pageNavigation;

    @FindBy(xpath = "//div[@class='rc-select__select-template__text']")
    public List<WebElement> card;

    @FindBy(xpath = "//span[@class='simple-error']")
    public WebElement transferErrorMessageLabel;

    @FindBy(css = "card-transfer-form-card-source  .c-input-select > input")
    public WebElement inputCardNumber;

    @FindBy(css = "card-transfer-form-card-destination  .c-input-select > input")
    public WebElement destinationCardNumber;

    @FindBy(xpath = "//*[@class='extension-form']")
    public WebElement cardFormBackground;


    public void fillDestinationCardNumber(String number) {
        fillField(destinationCardNumber, number);
        click(cardFormBackground);
    }

    public void selectSourceCard(String cardName){
        click(inputCardNumber);
        for (WebElement item : card) {
            if (item.getAttribute("title").contains(cardName)) {
                click(item);
                return;
            }
        }
        Assert.fail("Не найдена карта - " + cardName);

    }

    public void checkErrorMessage() {
        try {
            transferErrorMessageLabel.wait(0);
            String text = transferErrorMessageLabel.getText();

            Assert.assertEquals("Проверьте правильность номера карты", text);
        } catch (Exception e) {

        }
    }

}
