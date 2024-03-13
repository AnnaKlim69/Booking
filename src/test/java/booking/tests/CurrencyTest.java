package booking.tests;

import booking.pageObject.page.CurrencyPage;
import booking.pageObject.page.HomePage;
import framework.BaseTest;
import org.testng.annotations.Test;

public class CurrencyTest extends BaseTest {
    @Test
    public void currencySelection() {
        HomePage homePage = new HomePage();
        homePage.clickButtonCurrency();
        CurrencyPage currencyPage = new CurrencyPage("BYN");
        currencyPage.catalogueCurrency();
    }
}