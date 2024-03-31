package booking.pageObject.page;

import framework.elements.Button;
import framework.elements.TextBox;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class SingInPage extends BaseBookingPage {
    private static final String PAGE_LOCATOR = "//h1[text()='Sign in or create an account']";
    private static final TextBox EMAIL_ADDRESS = new TextBox(By.xpath("//input[@id='username']"));
    private static final Button HEADER_SING_IN = new Button(By.xpath("//a[@data-testid='header-sign-in-button']"));
    private static final Button CONTINUE_WITH_EMAIL_BUTTON = new Button(By.xpath(
            "//span[text()='Продолжить через электронную почту']"));

    public SingInPage() {
        super(By.xpath(PAGE_LOCATOR),"'Register' Page");
    }
    @Step("Click button sing in")
    public void clickButtonSingIn() {
        HEADER_SING_IN.click();
    }

    @Step("Fill in register From with {emailAddress}'")
    public void setEmailAddress(String emailAddress) {
        EMAIL_ADDRESS.sendKeys(emailAddress);
    }

    @Step("Click on button 'Continue with email'")
    public void clickContinueWithEmailButton() {//нажатие кнопки
        CONTINUE_WITH_EMAIL_BUTTON.click();
    }
}