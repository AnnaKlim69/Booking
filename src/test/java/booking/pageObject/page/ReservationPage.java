package booking.pageObject.page;

import framework.elements.Button;
import framework.elements.TextBox;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class ReservationPage extends BaseBookingPage {

    private static final String PAGE_LOCATOR = "//a[@aria-label='Booking.com']";
    private static final String NUMBER_VILLE = "//option[@value='%s']";
    private static final Button RESERVATION_BUTTON = new Button(By.xpath(
            "///span[@class='bui-button__text js-reservation-button__text']"));
    private static final Button SELECT_VILLE = new Button(By.xpath(
            "//select[@class='hprt-nos-select js-hprt-nos-select']']"));

    public ReservationPage() {
        super(By.xpath(String.format(PAGE_LOCATOR, "Найти")), "'Hotel Reservation' Page");
    }


    @Step("Click on the select ville")
    public void clickSelectVille() { SELECT_VILLE.click();
    }

    @Step("Click on the number ville item")
    public void clickNumberVilleItem(String villeItem) {
        TextBox textBox = new TextBox(By.xpath(String.format(NUMBER_VILLE, villeItem)));
        textBox.click();
    }

    @Step("Click on the reservation button")
    public void clickReservationButton() {
        RESERVATION_BUTTON.click();
    }

    @Step("Assertion: villeItem is equal to parameter")
    public void checkVilleItemFilter() {
        softAssert.assertEquals(NUMBER_VILLE, NUMBER_VILLE,
                "Expected result: " + NUMBER_VILLE + ". Actual result: " + NUMBER_VILLE);
    }
}