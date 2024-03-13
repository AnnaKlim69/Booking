package booking.tests;

import booking.pageObject.page.CheckHotelPage;
import booking.pageObject.page.HotelReservationPage;
import booking.pageObject.page.SelectCityDateNumberOfPeoplePage;
import framework.BaseTest;
import jdk.jfr.Description;
import org.testng.annotations.Test;

public class E2ETest extends BaseTest {
    @Test
    @Description("Test description")
    public void e2eTest() {
        SelectCityDateNumberOfPeoplePage selectCityDateNumberOfPeoplePage = new SelectCityDateNumberOfPeoplePage("");
        selectCityDateNumberOfPeoplePage.closeWindowPopUp();
        selectCityDateNumberOfPeoplePage.inputCity("city");
        selectCityDateNumberOfPeoplePage.clickOnDateBox();
        selectCityDateNumberOfPeoplePage.setDateDeparture();
        selectCityDateNumberOfPeoplePage.setDateArrival();
        selectCityDateNumberOfPeoplePage.clickNumberOfPeopleBox();
        selectCityDateNumberOfPeoplePage.clickAddNumberOfPeopleButton();
        selectCityDateNumberOfPeoplePage.clickDoneButton();
        selectCityDateNumberOfPeoplePage.clickSearchButton();

        CheckHotelPage checkHotelPage = new CheckHotelPage("");
        checkHotelPage.checkHotelFilterApplied("Villas");
        checkHotelPage.checkParkingFilterApplied("Parking");
        checkHotelPage.checkRatingFilterApplied("Wonderful: 9+");
        checkHotelPage.clickSeeAvailabilityButton();

        HotelReservationPage hotelReservationPage = new HotelReservationPage("");
        hotelReservationPage.clickReservationButton();
    }
}