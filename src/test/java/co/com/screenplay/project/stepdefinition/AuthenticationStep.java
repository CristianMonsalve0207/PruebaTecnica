package co.com.screenplay.project.stepdefinition;

import co.com.screenplay.project.questions.TargetIs;
import co.com.screenplay.project.tasks.Login;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import net.thucydides.core.util.EnvironmentVariables;
import org.hamcrest.Matchers;

import static co.com.screenplay.project.ui.LoginOrangeUI.ERROR_LOGIN;
import static co.com.screenplay.project.ui.ScheduleUI.VALIDAR_HIRED;
import static co.com.screenplay.project.utils.Constants.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AuthenticationStep {

    private static EnvironmentVariables environmentVariables;
    private String username;
    private String password;
    private String badUsername;
    private String badPassword;


    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }


    @When("ingresa las credenciales")
    public void enterTheCredentials() {
        username = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty(USER_NAME);
        password = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty(PASSWORD);
        theActorCalled(ACTOR).attemptsTo(
                Login.authentication(username, password)
        );
    }

    @Then("visualizara el home y espera una validacion")
    public void itWillDisplayTheHomeAndWaitForAValidation() {
        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(
                        TheWebPage.title(),
                        Matchers.containsString(ORANGE_TITLE)
                )
        );
    }
    @When("ingresa las credenciales incorrectas")
    public void enterBadCredentials() {
        badUsername = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty(BAD_USER_NAME);
        badPassword = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty(BAD_PASSWORD);
        theActorCalled(ACTOR).attemptsTo(
                Login.authentication(badUsername, badPassword)
        );
    }

    @Then("visualizara el mensaje de error")
    public void itWillDisplayTheErrorMessage() {
        theActorInTheSpotlight().should(seeThat(TargetIs.visible(ERROR_LOGIN), Matchers.is(true)));
    }

}