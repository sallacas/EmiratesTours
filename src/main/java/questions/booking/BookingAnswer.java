package questions.booking;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import userinterface.booking.BookingPage;

public class BookingAnswer implements Question<Boolean> {

    public static BookingAnswer to() {
        return new BookingAnswer();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean result;
        WaitUntil.the(BookingPage.Overlay, isVisible()).forNoMoreThan(30).seconds();
        String pay = Text.of(BookingPage.BTN_PAY).viewedBy(actor).asString();
        result = (!pay.equals("")) ? true : false;
        return result;
    }
}
