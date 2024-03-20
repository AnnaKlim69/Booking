package booking.pageObject.baseComponents;

import framework.elements.Button;
import framework.elements.Label;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import static framework.Browser.getDriver;

public class Header {
    private static final String HEADER_LOGO = "//a[@aria-label='Booking.com']";
    private static final String CURRENCY_ITEM = "//span[text()='Доллар США']";
    private static final String LANGUAGE_ITEM = "//span[@class='cf67405157' and text()='English (US)']";
    protected static final Button HEADER_LANGUAGE = new Button(By.xpath("//button[@data-testid='header-language-picker-trigger']"));
    protected static final Button HEADER_CURRENCY = new Button(By.xpath("//button[@data-testid='header-currency-picker-trigger']"));
    protected static final Button HEADER_REGISTER = new Button(By.xpath("//a[@data-testid='header-sign-up-button']"));
    protected static final Button HEADER_SING_IN = new Button(By.xpath("//a[@data-testid='header-sign-in-button']"));

    public static String languageName;
    public static String currencyName;
    private static String item;

    public String getLanguageName() {
        languageName = LANGUAGE_ITEM;
        return languageName;
    }

    public String getCurrency() {
        currencyName = CURRENCY_ITEM;
        return currencyName;
    }

    @Step("Click Header Logo")
    public void clickHeaderLogo() {
        Label headerLogo = new Label(By.xpath(String.format(HEADER_LOGO, item)));
        headerLogo.click();
    }

    @Step("Click button currency")
    public void clickButtonCurrency() {
        HEADER_CURRENCY.click();
    }

    @Step("Click currency")
    public void clickCurrency() {
        Label currencyItem = new Label(By.xpath(String.format(CURRENCY_ITEM, item)));
        currencyItem.click();
    }

    @Step("Click Button Language")
    public void clickButtonLanguage() {
        HEADER_LANGUAGE.click();
    }

    @Step("Click Language")
    public void clickLanguage() {
        Label languageItem = new Label(By.xpath(String.format(LANGUAGE_ITEM, item)));
        languageItem.click();
    }

    @Step("Click button register")
    public void clickButtonRegister() {
        HEADER_REGISTER.click();
    }

    @Step("Click button sing in")
    public void clickButtonSingIn() {
        HEADER_SING_IN.click();
    }

    @Step("Get button register item")
    public void getButtonRegisterItem() {
        Label buttonRegisterItem = new Label(By.xpath(String.format(item, HEADER_REGISTER)));
        buttonRegisterItem.click();
    }

    @Step("Get button singIn item")
    public void getButtonSingInItem() {
        Label buttonRegisterItem = new Label(By.xpath(String.format(item, HEADER_SING_IN)));
        buttonRegisterItem.click();
    }

    @Step("Item validation language")
    public void itemValidationLanguage() {
        if (item.equals(languageName)) {
            System.out.println("Items are equal");
        } else {
            System.out.println("Items are not equal");
        }
    }

    @Step("Item validation currency")
    public void itemValidationCurrency() {
        if (item.equals(currencyName)) {
            System.out.println("Items are equal");
        } else {
            System.out.println("Items are not equal");
        }
    }
}