package tasks.popularDestinations;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import userinterface.popularDestinations.SelectPage;


public class Select implements Task {
    public static Select dates() {
        return Tasks.instrumented(Select.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Click.on(SelectPage.btnFrom),
            Click.on(SelectPage.today),
            WaitUntil.the(SelectPage.todaySelected, isVisible()).forNoMoreThan(10).seconds(),
            Click.on(SelectPage.todaySelected),
            Hover.over(SelectPage.btnGo),
            Click.on(SelectPage.btnGo)
        );
    }
}
