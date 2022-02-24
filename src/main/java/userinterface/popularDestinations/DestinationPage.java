package userinterface.popularDestinations;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class DestinationPage {

    public static final Target TITLE = Target.the("Title of Most Popular Destinations")
            .located(By.xpath("//*[@id=\"main-content\"]/div[4]/div[1]/div/h3"));
    public static final Target SUBTITLE = Target.the("Subtitle of place")
            .located(By.xpath("//*[@data-test-id='image-links']"));
    public static final Target ALGO = Target.the("Div with images of the place")
            .located(By.xpath("/html/body/div[4]/div/main/div[4]/div[4]/div/div/h2"));
    public static final Target MORE_ACTS = Target.the("Button for search activites in place")
            .located(By.xpath("//*[@class='c-button c-button--medium c-button--outlined-standard']"));


}
