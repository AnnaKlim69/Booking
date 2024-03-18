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
        header.clickHeaderLogo();
        header.clickButtonCurrency();
        header.currencySelection();
        header.itemValidationCurrency();
        header.clickCurrency();
        header.clickButtonLanguage();
        header.languageSelection();
        header.itemValidationLanguage();
        header.clickLanguage();
        header.getButtonRegisterItem();
        header.getButtonSingInItem();
    }
}