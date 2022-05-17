package co.com.reto.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TheMeetingPage extends PageObject {
    public static final Target MEETING_CREATED = Target.the("check if the name meeting was created").
            located(By.xpath("//div[@class='grid-canvas grid-canvas-top grid-canvas-left']//*[contains(text(),'FirstMeet')]"));
    public static final Target MEETING_CREATED_NUMBER = Target.the("check if the number meeting was created").
            located(By.xpath("//div[@class='grid-canvas grid-canvas-top grid-canvas-left']//*[contains(text(),'20001')]"));



}
