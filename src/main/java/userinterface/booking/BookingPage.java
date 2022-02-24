package userinterface.booking;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BookingPage {
    public static final Target BUTTON_CHECKOUT = Target.the("Button for go to checkout").
            located(By.xpath("//*[@id=\"main-content\"]/div/section[2]/div[1]/div[2]/div[1]/a/button"));
    public static final Target INPUTNAME = Target.the("Input where we place the names")
            .located(By.name("fullname"));
    public static final Target INPUTEMAIL = Target.the("Input where we place the email")
            .located(By.name("email"));
    public static final Target INPUTPHONE = Target.the("Input where we place the phone")
            .located(By.name("phone"));
    public static final Target CREDITCARD = Target.the("Option credit card")
            .located(By.id("creditcard"));
    public static final Target GO_PAYMENT = Target.the("Input to search for destinations")
            .located(By.xpath("//button[@data-test-id='checkout-submit-btn']"));
    public static final Target Overlay = Target.the("Button for pay")
            .located(By.xpath("//div[@class='overlay']"));
    public static final Target BTN_PAY = Target.the("Button for pay")
            .located(By.xpath("//span[@class='adyen-checkout__button__text']"));
}
