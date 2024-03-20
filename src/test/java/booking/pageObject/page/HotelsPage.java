package booking.pageObject.page;

import framework.elements.Button;
import framework.elements.CheckBox;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class HotelsPage extends BaseBookingPage {
    SoftAssert softAssert = new SoftAssert();
    private static final String PAGE_LOCATOR = "//div[@data-testid='map-trigger']";
    private static final CheckBox APPLIED_FILTER_HOTEL = new CheckBox(By.xpath("//div[text()='Вилла']"));//изменить на %s
    public static final CheckBox APPLIED_FILTER_PARKING = new CheckBox(By.xpath("//div[text()='Парковка']"));
    private static final CheckBox APPLIED_FILTER_RATING = new CheckBox(By.xpath("//div[text()='Превосходно: 9+']"));
    private static final Button SEE_AVAILABILITY_BUTTON = new Button(By.xpath("//span[text()='Наличие мест']"));

    public HotelsPage() {
        super(By.xpath(String.format(PAGE_LOCATOR, "Все фильтры")), "'Check' Hotel Page");
    }

    @Step("Click if the hotel filter is applied")
    public void clickHotelFilterApplied(String hotel) {
        APPLIED_FILTER_HOTEL.click();
    }

    @Step("Click if the parking filter is applied")
    public void clickParkingFilterApplied(String parking) {
        APPLIED_FILTER_PARKING.click();
    }

    @Step("Click if the rating filter is applied")
    public void clickRatingFilterApplied(String rating) {
        APPLIED_FILTER_RATING.click();
    }

    @Step("Click button see availability button")
    public void clickSeeAvailabilityButton() {
        SEE_AVAILABILITY_BUTTON.click();
    }

    @Step("Assertion: hotel is equal to parameter")
    private void checkHotelFilter(String hotel) {
        softAssert.assertEquals(APPLIED_FILTER_HOTEL.getText(), hotel,
                "Expected result: " + hotel + ". Actual result: " + APPLIED_FILTER_HOTEL.getText());
    }

    @Step("Assertion: parking is equal to parameter")
    private void checkParkingFilter(String parking) {
        softAssert.assertEquals(APPLIED_FILTER_RATING.getText(), parking,
                "Expected result: " + parking + ". Actual result: " + APPLIED_FILTER_RATING.getText());
    }

    @Step("Assertion: rating is equal to parameter")
    private void checkRatingFilter(String parking) {
        softAssert.assertEquals(APPLIED_FILTER_RATING.getText(), parking,
                "Expected result: " + parking + ". Actual result: " + APPLIED_FILTER_RATING.getText());
    }
}