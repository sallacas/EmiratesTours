package tasks.booking;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.questions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import userinterface.booking.ActivitiesPage;


public class Activities implements Task {

    public static Activities select() {
        return Tasks.instrumented(Activities.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if (Visibility.of(ActivitiesPage.DATE_PICKER1).viewedBy(actor).resolve()){
            System.out.println("Está visible");
            actor.attemptsTo(
                    Click.on(ActivitiesPage.INPUT_DATE1),
                    Hover.over(ActivitiesPage.DAY2),
                    Click.on(ActivitiesPage.DAY2),
                    Click.on(ActivitiesPage.TODAYDAY),
                    Click.on(ActivitiesPage.GO_BUTTON)
            );
        }
        String url = Attribute.of(ActivitiesPage.Activity).named("href").viewedBy(actor).asString();
        actor.attemptsTo(
                Hover.over(ActivitiesPage.Activity),
                Open.url(url),
                Scroll.to(ActivitiesPage.SECTION_BOOKING),
                Hover.over(ActivitiesPage.DATE),
                Click.on(ActivitiesPage.DATE),
                Hover.over(ActivitiesPage.DAY),
                Click.on(ActivitiesPage.DAY),
                Click.on(ActivitiesPage.PROBE_BUTTON),
                WaitUntil.the(ActivitiesPage.Overlay, isVisible()).forNoMoreThan(30).seconds(),
                WaitUntil.the(ActivitiesPage.SHOPPING_CART, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(ActivitiesPage.SHOPPING_CART)
        );

    }
}
