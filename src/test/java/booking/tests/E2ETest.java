package booking.tests;

import booking.pageObject.baseComponents.PopUp;
import booking.pageObject.page.HomePage;
import booking.pageObject.page.HotelsPage;
import booking.pageObject.page.ReservationPage;
import booking.pageObject.page.TravelDetailsPage;
import framework.BaseTest;
import framework.PropertyReader;
import jdk.jfr.Description;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class E2ETest extends BaseTest {
    @Test
    @Description("Test description")
    public void e2eTest() {
        PopUp popUp = new PopUp();
        popUp.closeWindowPopUp();

        HomePage homePage = new HomePage();
        homePage.inputCity("Дубай");
        homePage.clickOnDateBox();
        homePage.setDateDeparture("2024-04-08");
        homePage.setDateArrival("2024-04-16");
        homePage.clickNumberOfPeopleBox();
        homePage.clickAddNumberOfPeopleButton();
        homePage.clickDoneButton();
        homePage.clickSearchButton();

        HotelsPage hotelsPage = new HotelsPage();
        hotelsPage.clickExpandAccommodationTypeButton();
        hotelsPage.clickHotelFilterApplied();
        hotelsPage.checkHotelFilter("Виллы");
        hotelsPage.clickParkingFilterApplied();
        hotelsPage.checkParkingFilter("Парковка");
        hotelsPage.clickRatingFilterApplied();
        hotelsPage.checkRatingFilter("Превосходно: 9+");
        hotelsPage.clickHotelsSortingButton();
        hotelsPage.checkHotelsSorting();
        hotelsPage.selectHotelsSorting("Цена (сначала самая низкая)");
        hotelsPage.clickSeeAvailabilityButton();

        ReservationPage hotelReservationPage = new ReservationPage();
        hotelReservationPage.clickReservationButton();
        hotelReservationPage.clickSelectVille();
        hotelReservationPage.clickNumberVille();

        TravelDetailsPage travelDetailsPage = new TravelDetailsPage();
        travelDetailsPage.inputFirstName(PropertyReader.getProperty("firstName"));
        travelDetailsPage.inputLastName(PropertyReader.getProperty("lastName"));
        travelDetailsPage.inputEmailAddress(PropertyReader.getProperty("emailAddress"));
        travelDetailsPage.clickBoxCountry();
        travelDetailsPage.selectCountry("Россия");
        travelDetailsPage.clickBoxMainGuest();
        travelDetailsPage.inputGuestName(PropertyReader.getProperty("guestName"));
        travelDetailsPage.clickArrivalTime();
        travelDetailsPage.selectArrivalTime("09.00-10.00");
        travelDetailsPage.clickCNextFinalDataButton();
        travelDetailsPage.checkAllFieldsAreFilledOut("Похоже, вы кое-что забыли.");
    }
}