package booking.pageObject.page;

import framework.elements.Button;
import framework.elements.TextBox;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class EnteringPassword extends BaseBookingPage{

    private static final String PAGE_LOCATOR = "//h1[@tclass='bui_font_display_one bui_font_heading--bold bui-spacer--medium nw-step-header']";
    private static final TextBox ENTERING_PASSWORD = new TextBox(By.xpath("//input[@name='password']"));
    protected static final Button GET_LOGIN_lINK_BUTTON = new Button(By.xpath(
            "//span[text()='Получить ссылку для входа']"));

    public EnteringPassword() {
        super(By.xpath(PAGE_LOCATOR),"'Register' Page");
    }

    @Step("Fill in register From with '{password}'")
    public void enteringPassword(String password) {
        ENTERING_PASSWORD.sendKeys(password);
    }
    @Step("Click on button Get login link")
    public void clickGetLoginLinkButton() {//нажатие кнопки
        GET_LOGIN_lINK_BUTTON.click();
    }
}