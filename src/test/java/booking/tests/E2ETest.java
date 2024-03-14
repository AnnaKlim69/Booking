package booking.tests;

import booking.pageObject.baseComponents.BoxPaddingGeniusPage;
import booking.pageObject.page.CheckHotelPage;
import booking.pageObject.page.HotelReservationPage;
import booking.pageObject.page.SelectCityDateNumberOfPeoplePage;
import framework.BaseTest;
import framework.PropertyReader;
import jdk.jfr.Description;
import org.testng.annotations.Test;

public class E2ETest extends BaseTest {
    @Test
    @Description("Test description")
    public void e2eTest() {
        BoxPaddingGeniusPage boxPaddingGeniusPage = new BoxPaddingGeniusPage("CloseWindowPopUp");
        boxPaddingGeniusPage.closeWindowPopUp();

        SelectCityDateNumberOfPeoplePage selectCityDateNumberOfPeoplePage = new SelectCityDateNumberOfPeoplePage("");
        selectCityDateNumberOfPeoplePage.inputCity(PropertyReader.getProperty("city"));
        selectCityDateNumberOfPeoplePage.clickOnDateBox();
        selectCityDateNumberOfPeoplePage.setDateDeparture();
        selectCityDateNumberOfPeoplePage.setDateArrival();
        selectCityDateNumberOfPeoplePage.clickNumberOfPeopleBox();
        selectCityDateNumberOfPeoplePage.clickAddNumberOfPeopleButton();
        selectCityDateNumberOfPeoplePage.clickDoneButton();
        selectCityDateNumberOfPeoplePage.clickSearchButton();

        CheckHotelPage checkHotelPage = new CheckHotelPage("");
        checkHotelPage.checkHotelFilterApplied("Hotel");
        checkHotelPage.checkParkingFilterApplied("Parking");
        checkHotelPage.checkRatingFilterApplied("Wonderful: 9+");
        checkHotelPage.clickSeeAvailabilityButton();

        HotelReservationPage hotelReservationPage = new HotelReservationPage("");
        hotelReservationPage.clickReservationButton();
    }
}