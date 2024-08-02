package co.com.screenplay.project.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginOrangeUI extends PageObject {

    /**
     * Mapeo de localozadores vista LOGIN
     */

    public static final Target MODAL_LOGIN = Target.the("selecciona en el modal la opcion login")
            .located(By.xpath("//div[@class='orangehrm-login-slot']"));
    public static final Target USER_NAME = Target.the("User name").locatedBy("//input[@name='username']");
    public static final Target PASSWORD = Target.the("Password").locatedBy("//input[@name='password']");
    public static final Target BTN_LOGIN = Target.the("Button login").locatedBy("//button[@type='submit']");
    public static final Target ERROR_LOGIN = Target.the("Button login").locatedBy("//div[@class='oxd-alert-content oxd-alert-content--error']");

}