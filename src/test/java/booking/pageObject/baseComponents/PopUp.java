package booking.pageObject.baseComponents;

import framework.elements.Button;
import framework.elements.CheckBox;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PopUp {
    private static final CheckBox POPUP_LOCATOR = new CheckBox(By.xpath("//div[@style='--bui_box_padding--s: 6;']"));
    private static final Button CLOSE_WINDOW_POPUP = new Button(By.xpath(
            "//div[@class='abcc616ec7 cc1b961f14 c180176d40 f11eccb5e8 ff74db973c']"));

    @Step("Close window PopUp")
    public void closeWindowPopUp() {
        CLOSE_WINDOW_POPUP.click();
    }
}