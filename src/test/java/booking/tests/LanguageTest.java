package booking.tests;

import booking.pageObject.page.HomePage;
import booking.pageObject.page.LanguagePage;
import framework.BaseTest;
import org.testng.annotations.Test;

public class LanguageTest extends BaseTest {
    @Test
    public void languageSelection() {
        HomePage homePage = new HomePage();
        homePage.clickButtonLanguage();
        LanguagePage languagePage = new LanguagePage("English (US)");
        languagePage.catalogueLanguage();
    }
}