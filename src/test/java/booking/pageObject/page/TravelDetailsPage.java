package booking.pageObject.page;

import framework.elements.Button;
import framework.elements.CheckBox;
import framework.elements.Label;
import framework.elements.TextBox;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class TravelDetailsPage extends BaseBookingPage {
    private static final String PAGE_LOCATOR = "//strong[@class='a3332d346a beb15c03b0' and text()='Ваши данные']";
    private static final Label CHECK_ALL_FILLED = new Label(By.xpath("//div[@data-component='bp/top-validation-errors']"));
    private static final TextBox FIRST_NAME = new TextBox(By.xpath("//input[@id='firstname']"));
    private static final TextBox LAST_NAME = new TextBox(By.xpath("//input[@id='lastname']"));
    private static final TextBox EMAIL_ADDRESS = new TextBox(By.xpath("//input[@id='email']"));
    private static final TextBox PHONE = new TextBox(By.xpath("//input[@id='phone']"));
    private static final TextBox GUEST = new TextBox(By.xpath("//input[@id='guest_name_1143888601_387812335_2_0_0']"));
    private static final String SELECT_COUNTRY = "//select[@id='cc1']";//!!!+++
    private static final String ARRIVAL_TIME = "//div[@class='bui-input-select']";//+++
    private static final CheckBox MAIN_GUEST = new CheckBox(By.xpath(
            "//span[@class='bui-radio__label' and text()='   Я     ']"));
    private static final Button FINAL_DATA_BUTTON = new Button(By.xpath("//span[text()=' Далее: финальные данные ']"));

    public TravelDetailsPage() {
        super(By.xpath(PAGE_LOCATOR), "Travel Details Page");
    }

    private static String item;

    @Step("Input first name")
    public void inputFirstName(String firstName) {
        FIRST_NAME.sendKeys(firstName);
    }

    @Step("Input last name")
    public void inputLastName(String lastName) {
        LAST_NAME.sendKeys(lastName);
    }

    @Step("Input email address")
    public void inputEmailAddress(String emailAddress) {
        EMAIL_ADDRESS.sendKeys(emailAddress);
    }

    @Step("Click box a country")
    public void clickBoxCountry() {
        TextBox textBox = new TextBox(By.xpath(String.format(SELECT_COUNTRY)));
        textBox.click();
    }

    @Step("Check country checkbox")
    public void selectCountry(String country) {
        CheckBox checkSelectCountry = new CheckBox(By.xpath(String.format(SELECT_COUNTRY, country)));
        checkSelectCountry.scrollIntoView();
        checkSelectCountry.clickViaJS();
        checkSelectCountry.isSelected();
    }

    @Step("Click box main guest")
    public void clickBoxMainGuest() {
        MAIN_GUEST.click();
    }

    @Step("Input guest name")
    public void inputGuestName(String guestName) {
        GUEST.sendKeys(guestName);
    }

    @Step("Click arrival time")
    public void clickArrivalTime() {
        TextBox textBox = new TextBox(By.xpath(String.format(ARRIVAL_TIME)));
        textBox.click();
    }

    @Step("Check arrivalTime checkbox")
    public void selectArrivalTime(String arrivalTime) {
        CheckBox checkSelectCountry = new CheckBox(By.xpath(String.format(ARRIVAL_TIME, arrivalTime)));
        checkSelectCountry.scrollIntoView();
        checkSelectCountry.clickViaJS();
        checkSelectCountry.isSelected();
    }

    @Step("Click on button 'Next: final data'")
    public void clickCNextFinalDataButton() {//нажатие кнопки
        FINAL_DATA_BUTTON.click();
    }

    @Step("Check all fields are filled out")
    public void checkAllFieldsAreFilledOut(String fields) {
        softAssert.assertEquals(CHECK_ALL_FILLED.getText(), fields,
                "Expected result: " + fields + ". Actual result: "
                        + CHECK_ALL_FILLED.getText());
        softAssert.assertAll();
    }
}