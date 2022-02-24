package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.popularDestinations.popularDestinationsData;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.*;
import questions.popularDestinations.popularDestinationsAnswer;
import tasks.popularDestinations.Destination;
import tasks.popularDestinations.Select;

import java.util.List;

public class popularDestinationsStepDefinitions {

    @Before
    public void setStage (){ OnStage.setTheStage(new OnlineCast()); }

    @When("^he selects a destination, it validates that the interface corresponds to the destination and searches for activities$")
    public void heSelectsADestinationItValidatesThatTheInterfaceCorrespondsToTheDestinationAndSearchesForActivities(List<popularDestinationsData> data) throws Exception {
        OnStage.theActorCalled("Juan").attemptsTo(
            Destination.select(data.get(0).getStrDestination()),
            Select.dates()
        );
    }

    @Then("^he will be able to find the activities available at the selected destination$")
    public void heWillBeAbleToFindTheActivitiesAvailableAtTheSelectedDestination(){
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(popularDestinationsAnswer.validate()));
    }

}
