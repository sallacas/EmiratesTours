package userinterface.popularDestinations;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SelectPage {
    public static final Target btnFrom = Target.the("Button select date from")
            .located(By.xpath("//div[@data-test-id='datepicker-date-from']"));
    public static final Target today = Target.the("Date Today")
            .located(By.xpath("//span[@class='flatpickr-day today']"));
    public static final Target btnGo = Target.the("Date Picker")
            .located(By.xpath("//*[@id=\"datepicker-check-availability\"]"));
    public static final Target todaySelected = Target.the("Date today selected")
            .located(By.xpath("/html/body/div[7]/div[2]/div/div[2]/div/span[@class='flatpickr-day today selected']"));
}
