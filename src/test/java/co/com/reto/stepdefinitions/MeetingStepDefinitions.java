package co.com.reto.stepdefinitions;

import co.com.reto.model.Meeting;
import co.com.reto.questions.TheMeeting;
import co.com.reto.questions.TheNameof;
import co.com.reto.tasts.CreateBusinessUnits;
import co.com.reto.tasts.CreateMeeting;
import co.com.reto.tasts.Open;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class MeetingStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^that an user want to login in StartSharp$")
    public void thatAnUserWantToLoginInStartSharp() {
        OnStage.theActorCalled("user").wasAbleTo(Open.startSharp());
    }

    @When("^the user insert the information of the business units$")
    public void anUserInsertTheInformationOfTheBusinessUnits(List<Meeting> meeting) {
        OnStage.theActorInTheSpotlight().attemptsTo(CreateBusinessUnits.with(
                meeting.get(0).getStrNameBUnits()
        ));
    }
    @Then("^it should show Unit name$")
    public void itShouldShowUnitName(List<Meeting> meeting)  {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(TheNameof.theBusinessUnits(
                meeting.get(0).getStrUnit()

               )));
    }

    @When("^the user insert the information of the meeting$")
    public void theUserInsertTheInformationOfTheMeeting(List<Meeting> meeting) {
        OnStage.theActorInTheSpotlight().attemptsTo(CreateMeeting.with(
                meeting.get(0).getStrMeetingName(),
                meeting.get(0).getStrMeetingNumber(),
                meeting.get(0).getStrStartDate(),
                meeting.get(0).getStrEndDate()
        ));

    }

    @Then("^it should show meeting name$")
    public void itShouldShowMeetingName(List<Meeting> meeting) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(TheMeeting.createdWith(
                meeting.get(0).getStrNameMeeting(),
                meeting.get(0).getStrNumberMeeting()

        )));

    }


}
