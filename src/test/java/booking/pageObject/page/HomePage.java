package booking.pageObject.page;

import framework.elements.Button;
import framework.elements.Label;
import framework.elements.TextBox;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class HomePage extends BaseBookingPage {

    private static final String PAGE_LOCATOR = "//a[@aria-label='Booking.com']";

    //    private static final String PAGE_LOCATOR = "//div[@class='hero-banner-searchbox']";
    private static final TextBox WHERE_WE_GO = new TextBox(By.xpath("//input[@name='ss']"));
    public static final Label DATE_TUR = new Label(By.xpath("//div[@data-testid='searchbox-dates-container']"));
    private static final Label DATE_DEPARTURE = new Label(By.xpath("//span[@data-date='2024-04-01']"));
    private static final Label DATE_ARRIVAL = new Label(By.xpath("//span[@data-date='2024-04-06']"));
    public static final Label NUMBER_OF_PEOPLE_Box = new Label(By.xpath(
            "//span[@data-testid='searchbox-form-button-icon']"));
    public static final Label ADD_NUMBER_OF_PEOPLE = new Label(By.xpath(
            "//button[@class='a83ed08757 c21c56c305 f38b6daa18 d691166b09 ab98298258 deab83296e bb803d8689 f4d78af12a']"));
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
        DATE_TUR.click();
    }

    @Step("Set date department")
    public void setDateDeparture() {
        DATE_DEPARTURE.click();
    }

    @Step("Set date arrival")
    public void setDateArrival() {
        DATE_ARRIVAL.click();
    }

    @Step("Click number of people box")
    public void clickNumberOfPeopleBox() {
        NUMBER_OF_PEOPLE_Box.click();
    }

    @Step("Click button add number of people")
    public void clickAddNumberOfPeopleButton() {
        ADD_NUMBER_OF_PEOPLE.click();
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