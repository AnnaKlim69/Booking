package booking.pageObject.baseComponents;

import framework.elements.Button;
import framework.elements.TextBox;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class Header {
    SoftAssert softAssert = new SoftAssert();
    private static final String HEADER_LOGO = "//a[@aria-label='Booking.com']";
    private static final String CURRENCY_ITEM = "//span[text()='%s']";
    private static final String LANGUAGE_ITEM = "//span[text()='%s']";
    protected static final Button HEADER_CURRENCY = new Button(By.xpath(
            "//button[@class='a83ed08757 c21c56c305 f38b6daa18 f671049264 deab83296e fd3248769f'] " +
                    " [@data-testid='header-currency-picker-trigger']"));
    protected static final Button HEADER_LANGUAGE = new Button(By.xpath(
            "//button[@class='a83ed08757 c21c56c305 f38b6daa18 f671049264 deab83296e fd3248769f']  " +
                    "[@data-testid='header-language-picker-trigger']"));

    @Step("Click Header Logo")
    public void clickHeaderLogo() {
        TextBox textBox = new TextBox(By.xpath(String.format(HEADER_LOGO)));
        textBox.click();
    }

    @Step("Click button currency")
    public void clickButtonCurrency() {
        HEADER_CURRENCY.click();
    }

    @Step("Click currency")
    public void clickCurrency(String currency) {
        TextBox textBox = new TextBox(By.xpath(String.format(CURRENCY_ITEM, currency)));
        textBox.click();
    }

    @Step("Click Button Language")
    public void clickButtonLanguage() {
        HEADER_LANGUAGE.click();
    }

    @Step("Click Language")
    public void clickLanguage(String language) {
        TextBox textBox = new TextBox(By.xpath(String.format(LANGUAGE_ITEM, language)));
        textBox.click();
    }

    @Step("Assertion: currency is equal to parameter")
    public void checkHeaderCurrency() {
        softAssert.assertEquals(HEADER_CURRENCY, HEADER_CURRENCY,
                "Expected result: " + HEADER_CURRENCY + ". Actual result: "
                        + HEADER_CURRENCY);
        softAssert.assertAll();
    }
    @Step("Assertion: language is equal to parameter")
    public void checkHeaderLanguage() {
        softAssert.assertEquals(HEADER_LANGUAGE, HEADER_LANGUAGE,
                "Expected result: " + HEADER_LANGUAGE + ". Actual result: "
                        + HEADER_LANGUAGE);
        softAssert.assertAll();
    }
}