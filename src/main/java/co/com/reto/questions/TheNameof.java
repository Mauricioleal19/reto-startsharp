package co.com.reto.questions;

import co.com.reto.userinterface.CreateBusinessUnitsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TheNameof implements Question<Boolean> {
    private String strUnit;

    public TheNameof(String strUnit) {
        this.strUnit = strUnit;
    }
    public static TheNameof theBusinessUnits(String strUnit) {
        return new TheNameof(strUnit);
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        String nameUnit = Text.of(CreateBusinessUnitsPage.LOCATED_BUSINESS_UNITS).viewedBy(actor).asString();

        return strUnit.equals(nameUnit);


    }
}
