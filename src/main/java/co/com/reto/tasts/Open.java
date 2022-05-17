package co.com.reto.tasts;

import co.com.reto.userinterface.OpenPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class Open implements Task {
    private OpenPage openPage;

    public static Open startSharp(){
        return Tasks.instrumented(Open.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(net.serenitybdd.screenplay.actions.Open.browserOn(openPage));

    }
}
