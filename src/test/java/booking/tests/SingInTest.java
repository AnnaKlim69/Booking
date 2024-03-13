package booking.tests;

import booking.pageObject.page.EnteringPassword;
import booking.pageObject.page.HomePage;
import booking.pageObject.page.RegisterPage;
import framework.BaseTest;
import framework.PropertyReader;
import org.testng.annotations.Test;

public class SingInTest extends BaseTest {
    @Test
    public void singInWithCorrectEmailAddress() {
        HomePage homePage = new HomePage();
        homePage.clickButtonSingIn();
        RegisterPage registerPage = new RegisterPage();
        registerPage.setEmailAddress(PropertyReader.getProperty("emailAddress"));
        registerPage.clickContinueWithEmailButton();
        EnteringPassword enteringPassword = new EnteringPassword();
        enteringPassword.enteringPassword(PropertyReader.getProperty("password"));
        enteringPassword.clickGetLoginLinkButton();
    }
}
