package booking.pageObject.page;

import framework.elements.Button;
import org.openqa.selenium.By;

public class LanguagePage extends BaseBookingPage {
    private static final String PAGE_LOCATOR = "//h2[@id=':r7:-title]' and text()='Select your language']";
    private static final Button LANGUAGE_ITEM = new Button(By.xpath("//button[@data-testid='selection-item']/span[text()='%s']"));

    public LanguagePage(String title) {
        super(By.xpath(String.format(PAGE_LOCATOR, title)), "'Language' Page");
    }

    public void catalogueLanguage() {
        LANGUAGE_ITEM.click();
    }
}