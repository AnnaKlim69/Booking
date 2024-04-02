package booking.pageObject.baseComponents;

import framework.elements.Button;
import framework.elements.CheckBox;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class PopUp {
    SoftAssert softAssert = new SoftAssert();
    private static final CheckBox POPUP_LOCATOR = new CheckBox(By.xpath("//div[@style='--bui_box_padding--s: 6;']"));
    private static final Button CLOSE_WINDOW_POPUP = new Button(By.xpath(
            "//div[@class='abcc616ec7 cc1b961f14 c180176d40 f11eccb5e8 ff74db973c']"));

    @Step("Close window PopUp")
    public void closeWindowPopUp() {
        CLOSE_WINDOW_POPUP.click();
    }

    @Step("Assertion: popUp is equal to parameter")
    public void checkPopUp(String popUp) {
        softAssert.assertEquals(POPUP_LOCATOR.getText(), popUp,
                "Expected result: " + popUp + ". Actual result: "
                        + POPUP_LOCATOR.getText());
        softAssert.assertAll();
    }
}