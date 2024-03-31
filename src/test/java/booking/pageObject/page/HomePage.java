package booking.pageObject.page;

import framework.elements.Button;
import framework.elements.TextBox;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class HomePage extends BaseBookingPage {
    private static final String PAGE_LOCATOR = "//a[@aria-label='Booking.com']";
    private static final TextBox WHERE_WE_GO = new TextBox(By.xpath("//input[@name='ss']"));
    public static final String DATE_TUR = "//div[@data-testid='searchbox-dates-container']";
    private static final String DATE_DEPARTURE = "//span[@data-date='%s']";
    private static final String DATE_ARRIVAL = "//span[@data-date='%s']";
    public static final String NUMBER_OF_PEOPLE_Box = "//span[@data-testid='searchbox-form-button-icon']";
    public static final String ADD_NUMBER_OF_PEOPLE =
            "//button[@class='a83ed08757 c21c56c305 f38b6daa18 d691166b09 ab98298258 deab83296e bb803d8689 f4d78af12a']";
    private static final Button DONE_BUTTON = new Button(By.xpath("//span[text()='Готово']"));
    private static final Button SEARCH_BUTTON = new Button(By.xpath("//span[text()='Найти']"));

    public HomePage() {
        super(By.xpath(PAGE_LOCATOR), "'Home' Page");
    }

    @Step("Input city")
    public void inputCity(String city) {
        WHERE_WE_GO.sendKeys(city);
    }

    @Step("Click on the date box")
    public void clickOnDateBox() {
        TextBox textBox = new TextBox(By.xpath(String.format(DATE_TUR)));
        textBox.click();
    }

    @Step("Set date department")
    public void setDateDeparture(String date) {
        TextBox textBox = new TextBox(By.xpath(String.format(DATE_DEPARTURE, date)));
        textBox.click();
    }

    @Step("Set date arrival")
    public void setDateArrival(String date) {
        TextBox textBox = new TextBox(By.xpath(String.format(DATE_ARRIVAL, date)));
        textBox.click();
    }

    @Step("Click number of people box")
    public void clickNumberOfPeopleBox() {
        TextBox textBox = new TextBox(By.xpath(String.format(NUMBER_OF_PEOPLE_Box)));
        textBox.click();
    }

    @Step("Click button add number of people")
    public void clickAddNumberOfPeopleButton() {
        TextBox textBox = new TextBox(By.xpath(String.format(ADD_NUMBER_OF_PEOPLE)));
        textBox.click();
    }

    @Step("Click button Done")
    public void clickDoneButton() {
        DONE_BUTTON.click();
    }

    @Step("Click button Search")
    public void clickSearchButton() {
        SEARCH_BUTTON.click();
    }
}