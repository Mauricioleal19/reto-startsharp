package co.com.reto.tasts;

import co.com.reto.userinterface.CreateMeetingPage;
import co.com.reto.userinterface.SingInPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class CreateMeeting implements Task {

    private String strMeetingName;
    private String strMeetingNumber;
    private String strStartDate;
    private String strEndDate;

    public CreateMeeting(String strMeetingName, String strMeetingNumber, String strStartDate, String strEndDate) {
        this.strMeetingName = strMeetingName;
        this.strMeetingNumber = strMeetingNumber;
        this.strStartDate = strStartDate;
        this.strEndDate = strEndDate;

    }

    public static CreateMeeting with(String strMeetingName, String strMeetingNumber, String strStartDate, String strEndDate) {
        return Tasks.instrumented(CreateMeeting.class, strMeetingName,strMeetingNumber, strStartDate, strEndDate);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SingInPage.SING_IN),
                Click.on(CreateMeetingPage.SELECT_MEETING),
                Click.on(CreateMeetingPage.SELECT_MEETINGS),
                Click.on(CreateMeetingPage.SELECT_NEW_MEETING),
                Enter.theValue(strMeetingName).into(CreateMeetingPage.INPUT_NAME_MEETING),
                Click.on(CreateMeetingPage.SELECT_MEETING_TYPE),
                Click.on(CreateMeetingPage.SELECT_TYPE),
                Enter.theValue(strMeetingNumber).into(CreateMeetingPage.INPUT_MEETING_NUMBER),
                Enter.theValue(strStartDate).into(CreateMeetingPage.INPUT_START_DATE),
                Click.on(CreateMeetingPage.START_TIME),
                Enter.theValue(strEndDate).into(CreateMeetingPage.INPUT_END_DATE),
                Click.on(CreateMeetingPage.END_TIME),
                Click.on(CreateMeetingPage.LOCATION),
                Click.on(CreateMeetingPage.LOCATION_OPTION),

                Click.on(CreateMeetingPage.SELECT_UNIT),
                Click.on(CreateMeetingPage.SELECT_UNIT_OPTION),
                Click.on(CreateMeetingPage.SELECT_ORGANIZED),
                Click.on(CreateMeetingPage.SELECT_ORGANIZED_OPTION),
                Click.on(CreateMeetingPage.SELECT_REPORTER),
                Click.on(CreateMeetingPage.SELECT_REPORTER_OPTION),
                Click.on(CreateMeetingPage.SELECT_ATTENDEE),
                Click.on(CreateMeetingPage.SELECT_ATTENDEE_OPTION),
                Click.on(CreateMeetingPage.SAVE_MEETING)

                );

    }
}