package booking.pageObject.baseComponents;

import framework.elements.Label;
import org.openqa.selenium.By;

public class Header {
    private static final String HEADER_LOGO = "//a[@aria-label='Booking.com']";

    public void clickHeaderLogo(String item) {
        Label headerLogo = new Label(By.xpath(String.format(HEADER_LOGO, item)));
        headerLogo.click();
    }
}