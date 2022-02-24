package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.*;
import java.util.List;

import questions.booking.BookingAnswer;
import tasks.booking.Activities;
import tasks.booking.Booking;
import tasks.booking.Go;
import tasks.booking.SearchActivity;
import model.booking.BookingData;


public class BookingStepDefinitions {

    @Before
    public void setStage (){ OnStage.setTheStage(new OnlineCast()); }

    @Given("^Juan want to access the Emirates Tours & Activities page$")
    public void juanWantToAccessTheEmiratesToursActivitiesPage(){
        OnStage.theActorCalled("Juan").attemptsTo(Go.toEmiratesToursPage());
    }


    @When("^he finds an activity he is interested in booking$")
    public void heFindsAnActivityHeIsInterestedInBooking(List<BookingData> data) throws Exception{

        OnStage.theActorInTheSpotlight().attemptsTo(
            SearchActivity.on(data.get(0).getDestination()),
            Activities.select(),
            Booking.doIt(data.get(0).getFullname(), data.get(0).getEmail(), data.get(0).getPhone())
        );
    }

    @Then("^he will be able to validate the booking process \\(without payment\\)$")
    public void heWillBeAbleToValidateTheBookingProcessWithoutPayment(){
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(BookingAnswer.to()));
    }

}
