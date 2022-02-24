package tasks.booking;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.*;
import org.openqa.selenium.Keys;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

import org.openqa.selenium.WebDriver;
import userinterface.booking.EmiratesPage;

public class SearchActivity implements Task{

    private String destination;

    public static SearchActivity on(String destination) {
        return Tasks.instrumented(SearchActivity.class,destination);
    }

    public SearchActivity(String destination) {
        this.destination = destination;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Click.on(EmiratesPage.SEARCH_BOX),
            Enter.theValue(destination).into(EmiratesPage.SEARCH_BOX),
            WaitUntil.the(EmiratesPage.PANEL, isVisible())
                    .forNoMoreThan(10).seconds(),
            Hit.the(Keys.ARROW_DOWN).into(EmiratesPage.SEARCH_BOX),
            Hit.the(Keys.ENTER).into(EmiratesPage.SEARCH_BOX)
        );
    }
}
