package co.com.reto.userinterface;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SingInPage extends PageObject {

    public static final Target SING_IN = Target.the("Button for login").
            located(By.id("StartSharp_Membership_LoginPanel0_LoginButton"));
}
