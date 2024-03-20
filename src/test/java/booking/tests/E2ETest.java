package booking.tests;

import booking.pageObject.baseComponents.PopUp;
import booking.pageObject.page.HomePage;
import booking.pageObject.page.HotelsPage;
import booking.pageObject.page.ReservationPage;
import framework.BaseTest;
import jdk.jfr.Description;
import org.testng.annotations.Test;

public class E2ETest extends BaseTest {
    @Test
    @Description("Test description")
    public void e2eTest() {
        PopUp popUp = new PopUp();
        popUp.closeWindowPopUp();

        HomePage homePage = new HomePage();
        homePage.inputCity("Dubai");
        homePage.clickOnDateBox();
        homePage.setDateDeparture();
        homePage.setDateArrival();
        homePage.clickNumberOfPeopleBox();
        homePage.clickAddNumberOfPeopleButton();
        homePage.clickDoneButton();
        homePage.clickSearchButton();

        HotelsPage hotelsPage = new HotelsPage();
        hotelsPage.clickHotelFilterApplied("Hotel");
        hotelsPage.clickParkingFilterApplied("Parking");
        hotelsPage.clickRatingFilterApplied("Wonderful: 9+");
        hotelsPage.clickSeeAvailabilityButton();

        ReservationPage hotelReservationPage = new ReservationPage();
        hotelReservationPage.clickReservationButton();
        hotelReservationPage.clickSelectVille();
        hotelReservationPage.clickNumberVille();
    }
}