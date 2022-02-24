package tasks.popularDestinations;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;
import userinterface.popularDestinations.DestinationPage;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class Destination implements Task {

    private String destination;

    public Destination(String destination) {
        this.destination = destination;
    }

    public static Destination select(String destination) {
        return Tasks.instrumented(Destination.class,destination);
    }

    public String selectPlace(String destination){
        String places[] = {"Amsterdam","Barcelona","Berlin","Dubai","Londres","Nueva York","Paris","Roma"};
        int nm = 0; String Target = "";
        for (int i = 0; i <8 ; i++) {
            if (places[i].equals(destination)){
                nm = i+1;
            }
        }
        Target = "//*[@id=\"main-content\"]/div[4]/div[1]/div/div/button["+nm+"]";
        return Target;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Target btn = Target.the("Button of place").located(By.xpath(selectPlace(destination)));
        actor.attemptsTo(
            Scroll.to(DestinationPage.TITLE),
            Hover.over(btn), Click.on(btn),
            Scroll.to(DestinationPage.ALGO),
            Scroll.to(DestinationPage.SUBTITLE),
            Click.on(DestinationPage.MORE_ACTS)
        );
    }
}
