package booking.pageObject.page;

import framework.elements.Button;
import framework.elements.CheckBox;
import framework.elements.Label;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class ReservationPage extends BaseBookingPage {

    private static final String PAGE_LOCATOR = "//a[@aria-label='Booking.com']";
    private static final Button RESERVATION_BUTTON = new Button(By.xpath(
            "//div[@class='bui-box--border-width-100 bui-box--border-color-neutral_alt bui-box--border-radius-100 " +
                    "bui-u-padding-start--16 bui-u-padding-end--16 bui-u-padding-bottom--16']"));
    private static final CheckBox SELECT_VILLE = new CheckBox(By.xpath(
            "//select[@class='hprt-nos-select js-hprt-nos-select']']"));
    private static final Label NUMBER_VILLE = new Label(By.xpath("//option[@value='1']"));

    public ReservationPage() {
        super(By.xpath(String.format(PAGE_LOCATOR, "Найти")), "'Hotel Reservation' Page");
    }

    @Step("Click on the reservation button")
    public void clickReservationButton() {
        RESERVATION_BUTTON.click();
    }

    @Step("Click on the select ville")
    public void clickSelectVille() {
        SELECT_VILLE.click();
    }

    @Step("Click on the number ville")
    public void clickNumberVille() { NUMBER_VILLE.click();
    }
}