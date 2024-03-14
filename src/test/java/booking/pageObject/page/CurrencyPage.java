package booking.pageObject.page;

import framework.elements.Button;
import org.openqa.selenium.By;

public class CurrencyPage extends BaseBookingPage {
    private static final String PAGE_LOCATOR = "//h2[text()='Select your currency']";
    private static final Button CURRENCY_ITEM = new Button(By.xpath("//span[text()='Доллар США']"));

    public CurrencyPage(String title) {
        super(By.xpath(String.format(PAGE_LOCATOR, title)), "'Currency' Page");
    }

    public void clickCurrency() {
        CURRENCY_ITEM.click();
    }
}