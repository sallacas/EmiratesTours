package questions.popularDestinations;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userinterface.popularDestinations.ResultPage;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class popularDestinationsAnswer implements Question<Boolean> {
    public static popularDestinationsAnswer validate() {
        return new popularDestinationsAnswer();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean result;
        WaitUntil.the(ResultPage.result,isVisible()).forNoMoreThan(10).seconds();
        String nmActivities = Text.of(ResultPage.result).viewedBy(actor).asString();
        String[] split = nmActivities.split(" ");
        result = (Integer.parseInt(split[0]) > 0 ) ? true : false;
        return result;
    }
}
