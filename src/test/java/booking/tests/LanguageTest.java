package booking.tests;

import booking.pageObject.baseComponents.BoxPaddingGeniusPage;
import booking.pageObject.page.HomePage;
import booking.pageObject.page.LanguagePage;
import framework.BaseTest;
import org.testng.annotations.Test;

public class LanguageTest extends BaseTest {
    @Test
    public void languageSelection() {
        BoxPaddingGeniusPage boxPaddingGeniusPage = new BoxPaddingGeniusPage("CloseWindowPopUp");
        boxPaddingGeniusPage.closeWindowPopUp();

        HomePage homePage = new HomePage();
        homePage.clickButtonLanguage();

        LanguagePage languagePage = new LanguagePage("Language");
        languagePage.clickLanguage();
    }
}