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
    protected static final Button HEADER_LANGUAGE = new Button(By.xpath("//button[@data-testid='header-language-picker-trigger']"));
    protected static final Button HEADER_CURRENCY = new Button(By.xpath("//button[@data-testid='header-currency-picker-trigger']"));
    protected static final Button HEADER_REGISTER = new Button(By.xpath("//a[@data-testid='header-sign-up-button']"));
    protected static final Button HEADER_SING_IN = new Button(By.xpath("//a[@data-testid='header-sign-in-button']"));
    private static final Button CURRENCY_ITEM = new Button(By.xpath("//span[text()='Доллар США']"));
    private static final Button LANGUAGE_ITEM = new Button(By.xpath("//span[@class='cf67405157' and text()='%s']"));
    private static final List<String> LANGUAGE_LIST = getDriver().findElements(By.xpath
                    ("//div[@class='eb33ef7c47']")).stream().map(e -> e.getText())
            .collect(Collectors.toList());
    private static final List<String> CURRENCY_LIST = getDriver().findElements(By.xpath
                    ("///div[@class='c0528ecc22']")).stream().map(e -> e.getText())
            .collect(Collectors.toList());

    private WebElement languageItem;
    public static String languageName;
    private WebElement currencyItem;
    public static String currencyName;
    private static String item;

    @Step("Click Header Logo")
    public void clickHeaderLogo() {
        Label headerLogo = new Label(By.xpath(String.format(HEADER_LOGO, item)));
        headerLogo.click();
    }

    @Step("Click Button Language")
    public void clickButtonLanguage() {
        HEADER_LANGUAGE.click();
    }

    @Step("Click Language")
    public void clickLanguage() {
        LANGUAGE_ITEM.click();
    }

    @Step("Click button currency")
    public void clickButtonCurrency() {
        HEADER_CURRENCY.click();
    }

    @Step("Click currency")
    public void clickCurrency() {
        CURRENCY_ITEM.click();
    }

    @Step("Click button register")
    public void clickButtonRegister() {
        HEADER_REGISTER.click();
    }

    @Step("Click button sing in")
    public void clickButtonSingIn() {
        HEADER_SING_IN.click();
    }

    @Step("Language selection")
    public WebElement languageSelection() {
        Random random = new Random();
        int r = random.nextInt(LANGUAGE_LIST.size());
        String languageName = LANGUAGE_LIST.get(r);
        System.out.println(languageName);
        return languageItem = getDriver().findElement(By.xpath(String.format(languageName, LANGUAGE_ITEM)));
    }

    @Step("Item validation language")
    public void itemValidationLanguage() {
        if (languageItem.equals(languageName)) {
            System.out.println("Items are equal");
        } else {
            System.out.println("Items are not equal");
        }
    }

    @Step("Currency selection")
    public WebElement currencySelection() {
        Random random = new Random();
        int r = random.nextInt(CURRENCY_LIST.size());
        String currencyName = CURRENCY_LIST.get(r);
        System.out.println(currencyName);
        return currencyItem = getDriver().findElement(By.xpath(String.format(currencyName, CURRENCY_LIST)));
    }

    @Step("Item validation currency")
    public void itemValidationCurrency() {
        if (currencyItem.equals(currencyName)) {
            System.out.println("Items are equal");
        } else {
            System.out.println("Items are not equal");
        }
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
}