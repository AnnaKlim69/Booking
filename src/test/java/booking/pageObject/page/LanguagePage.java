package booking.pageObject.page;

import framework.elements.Button;
import org.openqa.selenium.By;

public class LanguagePage extends BaseBookingPage {
    private static final String PAGE_LOCATOR = "//h2[@id=':r7:-title]' and text()='Select your language']";
    private static final Button LANGUAGE_ITEM = new Button(By.xpath("//span[@class='cf67405157' and text()='Русский']"));

    public LanguagePage(String title) {
        super(By.xpath(String.format(PAGE_LOCATOR, title)), "'Language' Page");
    }

      public void clickLanguage() {
        LANGUAGE_ITEM.click();
    }
}