package booking.pageObject.page;

import booking.pageObject.baseComponents.Header;
import framework.BasePage;
import org.openqa.selenium.By;

public class BaseBookingPage extends BasePage {

    public Header header = new Header();
    public BaseBookingPage(By locator, String pageTitle){
        super(locator, pageTitle);
    }
}