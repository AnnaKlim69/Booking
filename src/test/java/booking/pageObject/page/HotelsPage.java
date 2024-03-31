package booking.pageObject.page;

import framework.elements.Button;
import framework.elements.CheckBox;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class HotelsPage extends BaseBookingPage {
    SoftAssert softAssert = new SoftAssert();
    private static final String PAGE_LOCATOR = "//div[@data-testid='map-trigger']";
    private static final String SORTING_ITEM = "//span[text()='%s']";
    private static final CheckBox APPLIED_FILTER_HOTEL = new CheckBox(By.xpath(
            "//h3[text()='Тип размещения']//..//..//div[@data-testid='filters-group-label-content' and text()='Виллы']"));
    public static final CheckBox APPLIED_FILTER_PARKING = new CheckBox(By.xpath(
            "//div[text()='Парковка']"));
    private static final CheckBox APPLIED_FILTER_RATING = new CheckBox(By.xpath(
            "//div[text()='Превосходно: 9+']"));
    private static final Button EXPAND_ACCOMMODATION_TYPE = new Button(By.xpath(
            "//h3[text()='Тип размещения']//..//..//span[@data-testid='filters-group-expand']"));
    private static final Button SEE_AVAILABILITY_BUTTON = new Button(By.xpath(
            "//span[text()='Наличие мест']"));
    private static final String HOTELS_SORTING = "//button[@data-testid='sorters-dropdown-trigger']";

    public HotelsPage() {
        super(By.xpath(PAGE_LOCATOR), "'Check' Hotel Page");
    }

    @Step("Click button expand accommodation type")
    public void clickExpandAccommodationTypeButton() {
        EXPAND_ACCOMMODATION_TYPE.click();
    }

    @Step("Click if the hotel filter is applied")
    public void clickHotelFilterApplied() {
        APPLIED_FILTER_HOTEL.click();
    }

    @Step("Click if the parking filter is applied")
    public void clickParkingFilterApplied() {
        APPLIED_FILTER_PARKING.click();
    }

    @Step("Click if the rating filter is applied")
    public void clickRatingFilterApplied() {
        APPLIED_FILTER_RATING.click();
    }

    @Step("Click button see availability button")
    public void clickSeeAvailabilityButton() {
        SEE_AVAILABILITY_BUTTON.click();
    }

    @Step("Click on the reservation button")
    public void clickHotelsSortingButton() {
        Button button = new Button(By.xpath(String.format(HOTELS_SORTING)));
        button.click();
    }

    @Step("Check hotels sorting checkbox")
    public void selectHotelsSorting(String sorting) {
        CheckBox checkHotelsSorting = new CheckBox(By.xpath(String.format(SORTING_ITEM, sorting)));
        checkHotelsSorting.scrollIntoView();
        checkHotelsSorting.click();
        checkHotelsSorting.isSelected();
    }

    @Step("Assertion: hotel is equal to parameter")
    public void checkHotelFilter(String hotel) {
        softAssert.assertEquals(APPLIED_FILTER_HOTEL.getText(), hotel,
                "Expected result: " + hotel + ". Actual result: "
                        + APPLIED_FILTER_HOTEL.getText());
        softAssert.assertAll();
    }

    @Step("Assertion: parking is equal to parameter")
    public void checkParkingFilter(String parking) {
        softAssert.assertEquals(APPLIED_FILTER_PARKING.getText(), parking,
                "Expected result: " + parking + ". Actual result: " + APPLIED_FILTER_PARKING.getText());
    }

    @Step("Assertion: rating is equal to parameter")
    public void checkRatingFilter(String rating) {
        softAssert.assertEquals(APPLIED_FILTER_RATING.getText(), rating,
                "Expected result: " + rating + ". Actual result: " + APPLIED_FILTER_RATING.getText());
    }

    @Step("Assertion: sorting is equal to parameter")
    public void checkHotelsSorting() {
        softAssert.assertEquals(HOTELS_SORTING, HOTELS_SORTING,
                "Expected result: " + HOTELS_SORTING + ". Actual result: " + HOTELS_SORTING);
    }
}