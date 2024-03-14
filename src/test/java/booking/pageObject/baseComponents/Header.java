package booking.pageObject.baseComponents;

import framework.elements.Button;
import framework.elements.Label;
import org.openqa.selenium.By;

public class Header {
    private static final String HEADER_LOGO = "//a[@aria-label='Booking.com']";
    protected static final Button HEADER_LANGUAGE = new Button(By.xpath("//button[@data-testid='header-language-picker-trigger']"));
    protected static final Button HEADER_CURRENCY = new Button(By.xpath("//button[@data-testid='header-currency-picker-trigger']"));
    protected static final Button HEADER_REGISTER = new Button(By.xpath("//a[@data-testid='header-sign-up-button']"));
    protected static final Button HEADER_SING_IN = new Button(By.xpath("//a[@data-testid='header-sign-in-button']"));
    private static final Button CURRENCY_ITEM = new Button(By.xpath("//span[text()='Доллар США']"));
    private static final Button LANGUAGE_ITEM = new Button(By.xpath("//span[@class='cf67405157' and text()='Русский']"));

    private static String item;

    public void clickHeaderLogo() {
        Label headerLogo = new Label(By.xpath(String.format(HEADER_LOGO, item)));
        headerLogo.click();
    }
    public void clickButtonLanguage() {
        HEADER_LANGUAGE.click();
    }
    public void clickLanguage() {
        LANGUAGE_ITEM.click();
    }

    public void clickButtonCurrency() {
        HEADER_CURRENCY.click();
    }
    public void clickCurrency() {
        CURRENCY_ITEM.click();
    }

    public void clickButtonRegister() {
        HEADER_REGISTER.click();
    }

    public void clickButtonSingIn() {
        HEADER_SING_IN.click();
    }
}