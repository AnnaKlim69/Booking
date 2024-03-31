package booking.tests;

import booking.pageObject.baseComponents.PopUp;
import booking.pageObject.page.EnteringPassword;
import booking.pageObject.page.SingInPage;
import framework.BaseTest;
import framework.PropertyReader;
import org.testng.annotations.Test;

public class SingInTest extends BaseTest {
    @Test
    public void singInWithCorrectEmailAddress() {
        PopUp popUp = new PopUp();
        popUp.closeWindowPopUp();

        SingInPage singInPage = new SingInPage();
        singInPage.clickButtonSingIn();
        singInPage.setEmailAddress(PropertyReader.getProperty("emailAddress"));
        singInPage.clickContinueWithEmailButton();

        EnteringPassword enteringPassword = new EnteringPassword();
        enteringPassword.enteringPassword(PropertyReader.getProperty("password"));
        enteringPassword.clickGetLoginLinkButton();
    }
}