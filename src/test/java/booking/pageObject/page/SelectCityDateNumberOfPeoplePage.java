package booking.pageObject.page;

import framework.elements.Button;
import framework.elements.Label;
import framework.elements.TextBox;
import io.qameta.allure.Step;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import static framework.Browser.getDriver;

public class SelectCityDateNumberOfPeoplePage extends BaseBookingPage {
    private static final String PAGE_LOCATOR_1 = "//script[@nonce='NboFqWRpyMq4FNE']";
    private static final String PAGE_LOCATOR = "//div[@class='hero-banner-searchbox']";
    private static final TextBox WHERE_WE_GO = new TextBox(By.xpath("//div[@data-testid='destination-container']"));
    public static final Label DATE_TUR = new Label(By.xpath("//div[@data-testid='searchbox-dates-container']"));
    private static final Label DATE_DEPARTURE = new Label(By.xpath("///span[@aria-label='2 April 2024']"));
    private static final Label DATE_ARRIVAL = new Label(By.xpath("///span[@aria-label='6 April 2024']"));
    public static final Label NUMBER_OF_PEOPLE_Box = new Label(By.xpath(
            "//div[@data-testid='searchbox-dates-container']"));
    public static final Label ADD_NUMBER_OF_PEOPLE = new Label(By.xpath("//div[@data-testid='occupancy-popup']/div[2]"));
    private static final Button DONE_BUTTON = new Button(By.xpath("//span[text()='Done']"));
    private static final Button SEARCH_BUTTON = new Button(By.xpath("//span[text()='Search']"));

    public SelectCityDateNumberOfPeoplePage(String pageTitle) {
        super(By.xpath(String.format(PAGE_LOCATOR, pageTitle)), "'Select' Сity Date Number Of People Page");
    }

    @Step("Close window PopUp")//!!!???
    public void closeWindowPopUp() {
        Alert alert = getDriver().switchTo().alert();
        alert.dismiss();
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
    public void clickSearchButton() {
        DONE_BUTTON.click();
    }

    @Step("Click button Done")
    public void clickDoneButton() {
        SEARCH_BUTTON.click();
    }
}