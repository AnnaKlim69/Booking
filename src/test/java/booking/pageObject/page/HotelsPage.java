package booking.pageObject.page;

import framework.elements.Button;
import framework.elements.CheckBox;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class HotelsPage extends BaseBookingPage {
    private static final String PAGE_LOCATOR = "//div[@data-testid='map-trigger']";
    private static final CheckBox APPLIED_FILTER_HOTEL = new CheckBox(By.xpath("//div[text()='Виллы']"));//изменить на %s
    public static final CheckBox APPLIED_FILTER_PARKING = new CheckBox(By.xpath("//div[text()='Парковка']"));
    private static final CheckBox APPLIED_FILTER_RATING = new CheckBox(By.xpath("//div[text()='Превосходно: 9+']"));
    private static final Button SEE_AVAILABILITY_BUTTON = new Button(By.xpath("//span[text()='Наличие мест']"));

    public HotelsPage() {
        super(By.xpath(String.format(PAGE_LOCATOR, "Все фильтры")), "'Check' Hotel Page");
    }

    @Step("Check if the hotel filter is applied")
    public void checkHotelFilterApplied(String hotel) {
        APPLIED_FILTER_HOTEL.click();
    }

    @Step("Check if the parking filter is applied")
    public void checkParkingFilterApplied(String parking) {
        APPLIED_FILTER_PARKING.click();
    }

    @Step("Check if the rating filter is applied")
    public void checkRatingFilterApplied(String reting) {
        APPLIED_FILTER_RATING.click();
    }

    @Step("Click button see availability button")
    public void clickSeeAvailabilityButton() {
        SEE_AVAILABILITY_BUTTON.click();
    }
}