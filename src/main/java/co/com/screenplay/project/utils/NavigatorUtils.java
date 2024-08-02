package co.com.screenplay.project.utils;

import io.netty.handler.codec.http.multipart.FileUpload;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.pages.components.FileToUpload;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavigatorUtils {

    public static WebDriver getDriver (Actor actor) {
        return BrowseTheWeb.as(actor).getDriver();
    }

    public static WebElement getUploadWebElementByXpath(Actor actor, String xpath) {
        return getDriver(actor).findElement(By.xpath(xpath));
    }

    public static void uploadFile (Actor actor, String absolutePath, String xpath) {
        WebDriver driver = getDriver(actor);
        WebElement uploadElement = getUploadWebElementByXpath(actor, xpath);
        FileToUpload fileToUpload = new FileToUpload(driver, absolutePath);
        fileToUpload.fromLocalMachine().to(uploadElement);
    }
}
