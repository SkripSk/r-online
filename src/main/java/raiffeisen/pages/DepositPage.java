package raiffeisen.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Random;

public class DepositPage extends BasePage{

    @FindBy(xpath = "//a[@class='left-sidebar__item']")
    public List<WebElement> leftSidebar;

    @FindBy(xpath = "//section[@class='product-widget product-widget_deposit']")
    public List<WebElement> placeMoney;

    @FindBy(xpath = "//c-select-item[@class='c-select-item_selected c-select-item']")
    public WebElement depositSelector;

    @FindBy(xpath = "//div[@class='rc-select__select-template']")
    public List<WebElement> avaibleAccounts;

    @FindBy(css = "deposit-recharge-form > div > form > div:nth-child(2) > div.rc-row__value > quick-sums > c-input-currency > input")
    public WebElement depositMoneyAmount;

    @FindBy(xpath = "//button[@class='rc-form__submit rc-button']")
    public WebElement moneyAmountSubmit;

    @FindBy(css = "deposit-recharge-form > div > confirm-operation > div > tab-box > div.tab-box__body > confirm-operation-sms > form > div > div.confirm-operation-row__value > div > input")
    public WebElement smsCodeInpute;

    @FindBy(xpath = "//button[@class='confirm-operation-row__side-submit rc-button']")
    public WebElement smsCodeSubmit;

    @FindBy(xpath = "//success-operation-title[@class='success-operation-title']")
    public WebElement depositResult;


    public void selectRandomAccount(){
        click(depositSelector);
        WebElement randomOption = avaibleAccounts.get(new Random().nextInt(avaibleAccounts.size()));
        String amountValue = randomOption.findElement(By.className("amount__wholes")).getText();
        click(randomOption);

        int amountInt = Integer.parseInt(amountValue.replaceAll("\\s+",""));
        int depositRandomAmount = (int) (Math.random() * ++amountInt) + 1;
        fillField(depositMoneyAmount, Integer.toString(depositRandomAmount));
        click(moneyAmountSubmit);
    }

    public void selectDeposit(String name){
        try {
            for (WebElement element : placeMoney) {
                WebElement header = element.findElement(By.className("ng-star-inserted"));
                Thread.sleep(2000);
                if (header.getText().contains(name)) {
                    List<WebElement> button = element.findElements(By.tagName("button"));
                    for (WebElement e : button) {
                        if (e.getText().equals("Пополнить вклад")) {
                            click(e);
                        }
                    }
                }
            }
        }
        catch(InterruptedException e){
        }
    }

    public void fillSmsCode(String code){
        fillField(smsCodeInpute, code);
        click(smsCodeSubmit);
    }

    public void checkSuccessMessage(String message){
        String resultText = depositResult.getText();
        Assert.assertTrue(resultText.contains(message));
    }
}
