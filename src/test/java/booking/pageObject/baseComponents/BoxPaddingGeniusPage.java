package booking.pageObject.baseComponents;

import booking.pageObject.page.BaseBookingPage;
import framework.elements.Button;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class BoxPaddingGeniusPage extends BaseBookingPage {
    private static final String PAGE_LOCATOR = "//div[@style='--bui_box_padding--s: 6;']";
    private static final Button CLOSE_WINDOW_POPUP = new Button(By.xpath(
            "//div[@class='abcc616ec7 cc1b961f14 c180176d40 f11eccb5e8 ff74db973c']"));
    public BoxPaddingGeniusPage(String title) {
        super(By.xpath(String.format(PAGE_LOCATOR, title)), "'Box Padding' Genius Page");
    }
    @Step("Close window PopUp")
    public void closeWindowPopUp() {
        CLOSE_WINDOW_POPUP.click();
    }
}