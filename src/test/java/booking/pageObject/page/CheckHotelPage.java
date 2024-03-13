package booking.pageObject.page;

import framework.elements.Button;
import framework.elements.CheckBox;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class CheckHotelPage extends BaseBookingPage {
    private static final String PAGE_LOCATOR = "//div[@data-testid='map-trigger']";
    private static final CheckBox APPLIED_FILTER_HOTEL = new CheckBox(By.xpath("//div[@data-testid='filters-group-label-content' and text()='Villas']"));
    public static final CheckBox APPLIED_FILTER_PARKING = new CheckBox(By.xpath("//div[@data-testid='filters-group-label-content' and text()='Parking']"));
    private static final CheckBox APPLIED_FILTER_RATING = new CheckBox(By.xpath("//div[@data-testid='filters-group-label-content' and text()='Wonderful: 9+']"));
    private static final Button SEE_AVAILABILITY_BUTTON = new Button(By.xpath("//span[text()='See availability']"));

    public CheckHotelPage(String pageTitle) {
        super(By.xpath(String.format(PAGE_LOCATOR, pageTitle)), "'Check' Hotel Page");
    }

    @Step("Check if the hotel filter is applied")
    public void checkHotelFilterApplied(String hotel) {
        softAssert.assertEquals(APPLIED_FILTER_HOTEL.getText(), hotel,
                "Expected result: " + hotel + ". Actual result: " + APPLIED_FILTER_HOTEL.getText());
    }

    @Step("Check if the parking filter is applied")
    public void checkParkingFilterApplied(String parking) {
        softAssert.assertEquals(APPLIED_FILTER_PARKING.getText(), parking,
                "Expected result: " + parking + ". Actual result: " + APPLIED_FILTER_PARKING.getText());
    }

    @Step("Check if the rating filter is applied")
    public void checkRatingFilterApplied(String reting) {
        softAssert.assertEquals(APPLIED_FILTER_RATING.getText(), reting,
                "Expected result: " + reting + ". Actual result: " + APPLIED_FILTER_RATING.getText());
    }

    @Step("Click button see availability button")
    public void clickSeeAvailabilityButton() {
        SEE_AVAILABILITY_BUTTON.click();
    }
}