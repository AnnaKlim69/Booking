package booking.tests;

import booking.pageObject.baseComponents.Header;
import booking.pageObject.baseComponents.PopUp;
import framework.BaseTest;
import org.testng.annotations.Test;

public class HeaderTest extends BaseTest {
    @Test
    public void headerTest() {
        PopUp popUp = new PopUp();
        popUp.closeWindowPopUp();

        Header header = new Header();
//        header.clickHeaderLogo();
        header.checkHeaderCurrency();
        header.clickButtonCurrency();
        header.clickCurrency("Белорусский рубль");
        header.checkHeaderLanguage();
        header.clickButtonLanguage();
        header.clickLanguage("Русский");
    }
}