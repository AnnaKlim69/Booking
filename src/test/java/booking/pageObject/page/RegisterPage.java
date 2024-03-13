package booking.pageObject.page;

import framework.BasePage;
import framework.elements.Button;
import framework.elements.TextBox;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class RegisterPage extends BasePage {
    private static final String PAGE_LOCATOR = "//h1[text()='Sign in or create an account']";
    private static final TextBox EMAIL_ADDRESS = new TextBox(By.xpath("//input[@id='username']"));
    private static final Button CONTINUE_WITH_EMAIL_BUTTON = new Button(By.xpath(
            "//span[@type='submit']"));

    public RegisterPage() {
        super(By.xpath(PAGE_LOCATOR),"'Register' Page");
    }

    @Step("Fill in register From with '{emailAddress}'")
    public void setEmailAddress(String emailAddress) {
        EMAIL_ADDRESS.sendKeys(emailAddress);
    }
    @Step("Click on button Continue with email")
    public void clickContinueWithEmailButton() {//нажатие кнопки
        CONTINUE_WITH_EMAIL_BUTTON.click();
    }
}