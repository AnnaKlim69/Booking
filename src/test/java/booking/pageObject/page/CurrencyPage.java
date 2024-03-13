package booking.pageObject.page;

import framework.elements.Button;
import org.openqa.selenium.By;

public class CurrencyPage extends BaseBookingPage {
    private static final String PAGE_LOCATOR = "//h2[@id=':r7:-title]' and text()='Select your language']";
    private static final Button CURRENCY_ITEM = new Button(By.xpath("//button[@data-testid='selection-item']/span[text()='%s']"));

    public CurrencyPage(String title) {
        super(By.xpath(String.format(PAGE_LOCATOR, title)), "'Currency' Page");
    }

    public void catalogueCurrency() {
        CURRENCY_ITEM.click();
    }
}