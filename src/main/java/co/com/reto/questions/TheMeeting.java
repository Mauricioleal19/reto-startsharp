package co.com.reto.questions;


import co.com.reto.userinterface.TheMeetingPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TheMeeting implements Question<Boolean> {
    private String strNameMeeting;
    private String strNumberMeeting;


    public TheMeeting(String strNameMeeting, String strNumberMeeting) {
        this.strNameMeeting = strNameMeeting;
        this.strNumberMeeting = strNumberMeeting;
    }
    public static TheMeeting createdWith(String strNameMeeting, String strNumberMeeting) {
        return new TheMeeting(strNameMeeting, strNumberMeeting);
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;

        String nameMeeting = Text.of(TheMeetingPage.MEETING_CREATED).viewedBy(actor).asString();
        String numberMeeting = Text.of(TheMeetingPage.MEETING_CREATED_NUMBER).viewedBy(actor).asString();

        return strNameMeeting.equals(nameMeeting) && strNumberMeeting.equals(numberMeeting);
    }
}
