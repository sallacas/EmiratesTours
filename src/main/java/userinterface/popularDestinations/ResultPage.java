package userinterface.popularDestinations;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ResultPage {
    public static final Target result = Target.the("Number of activities")
            .located(By.xpath("//div[@data-test-id='search-results-count']"));
}
