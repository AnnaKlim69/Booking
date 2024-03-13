package booking.pageObject.page;

import framework.elements.Button;
import org.openqa.selenium.By;

public class HomePage extends BaseBookingPage {

    private static final String PAGE_LOCATOR = "//a[@aria-label='Booking.com']";
    protected static final Button HEADER_LANGUAGE = new Button(By.xpath("//button[@data-testid='header-language-picker-trigger']"));
    protected static final Button HEADER_CURRENCY = new Button(By.xpath("//button[@data-testid='header-currency-picker-trigger']"));
    protected static final Button HEADER_REGISTER = new Button(By.xpath("//a[@data-testid='header-sign-up-button']"));
    protected static final Button HEADER_SING_IN = new Button(By.xpath("//a[@data-testid='header-sign-in-button']"));
    private static String item;

    public HomePage() {
        super(By.xpath(PAGE_LOCATOR), "'Home' Page");
    }

    public void clickButtonLanguage() {
        HEADER_LANGUAGE.click();
    }
    public void clickButtonCurrency(){HEADER_CURRENCY.click();}
    public void clickButtonRegister(){HEADER_REGISTER.click();}
    public void clickButtonSingIn(){HEADER_SING_IN.click();}
}