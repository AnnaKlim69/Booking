package booking.tests;

import booking.pageObject.baseComponents.PopUp;
import booking.pageObject.page.EnteringPassword;
import booking.pageObject.page.RegisterPage;
import framework.BaseTest;
import framework.PropertyReader;
import org.testng.annotations.Test;

public class RegisterTest extends BaseTest {
    @Test
    public void registrationWithCorrectEmailAddress() {
        PopUp popUp = new PopUp();
        popUp.closeWindowPopUp();

        RegisterPage registerPage = new RegisterPage();
        registerPage.clickButtonRegister();
        registerPage.setEmailAddress(PropertyReader.getProperty("emailAddress"));
        registerPage.clickContinueWithEmailButton();

        EnteringPassword enteringPassword = new EnteringPassword();
        enteringPassword.enteringPassword(PropertyReader.getProperty("password"));
        enteringPassword.clickGetLoginLinkButton();
    }
}