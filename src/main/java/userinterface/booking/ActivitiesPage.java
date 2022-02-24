package userinterface.booking;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ActivitiesPage {
    public static final Target Activity = Target.the("selected activity to be booked")
            .located(By.xpath("//*[@id=\"main-content\"]/div[1]/section/div[2]/div[2]/div/div/ul/li[2]/article/a"));
    public static final Target SECTION_BOOKING = Target.the("first button for booking")
            .located(By.xpath("//*[@id=\"booking-assistant\"]/div[1]"));
    public static final Target DATE = Target.the("Date for booking")
            .located(By.xpath("//*[@id=\"booking-assistant\"]/div[1]/section[2]/input"));
    public static final Target DAY = Target.the("Day for booking")
            .located(By.xpath("//span[@data-date-value='2022-02-28']"));
    public static final Target PROBE_BUTTON = Target.the("Button")
            .located(By.xpath("//*[@id=\"booking-assistant\"]/div[1]/button"));
    public static final Target Overlay = Target.the("Overlay")
            .located(By.xpath("//*[@id=\"booking-assistant\"]/div[2]"));
    public static final Target SHOPPING_CART = Target.the("Add to shopping cart")
            .located(By.xpath("//*[@id=\"booking-assistant\"]/div[2]/details/section[2]/section/div/div[2]/button"));

    //Interfaz 2
    public static final Target DATE_PICKER1 = Target.the("Date picker 1")
            .located(By.xpath("//div[@data-test-id='datepicker']"));
    public static final Target INPUT_DATE1 = Target.the("Input date1")
            .located(By.xpath("//div[@data-test-id='datepicker-date-from']"));
    public static final Target DAY2 = Target.the("Day 2")
            .located(By.xpath("//span[@aria-label='February 28, 2022']"));
    public static final Target GO_BUTTON = Target.the("Go button")
            .located(By.xpath("//*[@id=\"datepicker-check-availability\"]"));
    public static final Target TODAYDAY = Target.the("Day selectec")
            .located(By.xpath("/html/body/div[7]/div[2]/div/div[2]/div/span[@class='flatpickr-day selected']"));
}
