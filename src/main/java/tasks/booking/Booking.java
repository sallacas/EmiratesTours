package tasks.booking;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userinterface.booking.BookingPage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class Booking implements Task {

    private String fullname;
    private String email;
    private String phone;

    public Booking(String fullname, String email, String phone) {
        this.fullname = fullname;
        this.email = email;
        this.phone = phone;
    }

    public static Booking doIt(String fullname, String email, String phone) {
        return Tasks.instrumented(Booking.class, fullname, email, phone);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            WaitUntil.the(BookingPage.BUTTON_CHECKOUT, isVisible()).forNoMoreThan(30).seconds(),
            Click.on(BookingPage.BUTTON_CHECKOUT),
            WaitUntil.the(BookingPage.INPUTNAME, isVisible()).forNoMoreThan(30).seconds(),
            Enter.theValue(fullname).into(BookingPage.INPUTNAME),
            Enter.theValue(email).into(BookingPage.INPUTEMAIL),
            Enter.theValue(phone).into(BookingPage.INPUTPHONE),
            Click.on(BookingPage.CREDITCARD),
            Scroll.to(BookingPage.GO_PAYMENT),
            Click.on(BookingPage.GO_PAYMENT)
        );
    }
}
