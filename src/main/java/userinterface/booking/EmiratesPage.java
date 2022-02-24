package userinterface.booking;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://www.getyourguide.es/")
public class EmiratesPage extends PageObject {
    public static final Target SEARCH_BOX = Target.the("Input to search for destinations")
            .located(By.xpath("//input[@data-test-id='search-box-field']"));

    public static final Target PANEL = Target.the("Input to search for destinations")
            .located(By.className("panel-results"));

}
