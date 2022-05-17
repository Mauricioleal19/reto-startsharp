package co.com.reto.tasts;

import co.com.reto.userinterface.CreateBusinessUnitsPage;
import co.com.reto.userinterface.SingInPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class CreateBusinessUnits implements Task {
    private String strNameBUnits;

    public CreateBusinessUnits(String strNameBUnits) {
        this.strNameBUnits = strNameBUnits;

    }

    public static CreateBusinessUnits with(String strNameBUnits ) {
        return Tasks.instrumented(CreateBusinessUnits.class, strNameBUnits);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SingInPage.SING_IN),
                Click.on(CreateBusinessUnitsPage.SELECT_ORGANIZATION),
                Click.on(CreateBusinessUnitsPage.SELECT_BUSINESS_UNITS),
                Click.on(CreateBusinessUnitsPage.NEW_BUSINESS_UNITS),
                Enter.theValue(strNameBUnits).into(CreateBusinessUnitsPage.INPUT_NAME_UNIT),
                Click.on(CreateBusinessUnitsPage.PARENT_UNIT),
                Click.on(CreateBusinessUnitsPage.SELECT_PARENT),
                Click.on(CreateBusinessUnitsPage.SAVE_BUSINESS_UNITS),
                Enter.theValue(strNameBUnits).into(CreateBusinessUnitsPage.SEARCH_BUSINESS_UNITS)

        );

    }
}
