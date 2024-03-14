package booking.pageObject.page;

import framework.elements.Button;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class HotelReservationPage extends BaseBookingPage{

    private static final String PAGE_LOCATOR = "//a[@aria-label='Booking.com']";
    private static final Button RESERVATION_BUTTON = new Button(By.xpath("//button[@id='hp_book_now_button']"));

    public HotelReservationPage(String pageTitle) {
        super(By.xpath(String.format(PAGE_LOCATOR, pageTitle)), "'Hotel Reservation' Page");
    }
    @Step("Click on the reservation button")
    public void clickReservationButton() {
        RESERVATION_BUTTON.click();
    }
}