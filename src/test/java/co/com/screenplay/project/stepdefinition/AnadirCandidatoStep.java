package co.com.screenplay.project.stepdefinition;

import co.com.screenplay.project.hook.OpenWeb;
import co.com.screenplay.project.models.Candidate;
import co.com.screenplay.project.questions.TargetIs;
import co.com.screenplay.project.tasks.Login;
import co.com.screenplay.project.tasks.Recruitment;
import co.com.screenplay.project.tasks.ScheduleInterview;
import io.cucumber.java.ast.Cuando;
import io.cucumber.java.en.Given;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import net.thucydides.core.util.EnvironmentVariables;
import org.hamcrest.Matchers;

import static co.com.screenplay.project.ui.ScheduleUI.VALIDAR_HIRED;
import static co.com.screenplay.project.utils.Constants.*;
import static co.com.screenplay.project.utils.Time.waiting;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AnadirCandidatoStep {

    private static EnvironmentVariables environmentVariables;
    private String username;
    private String password;

    @Given("{string} abre ingresa el sitio de orange")
    public void openTheTestWebsiteOrange(String actor) {
        username = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty(USER_NAME);
        password = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty(PASSWORD);
        OnStage.theActorCalled(actor).attemptsTo(OpenWeb.browserURL(WEB_URL_MAP));
        waiting(TIME_SHORT);theActorInTheSpotlight().should(
                seeThat(
                        TheWebPage.title(),
                        Matchers.containsString(TITLE_WEBSITE)));

        OnStage.theActorInTheSpotlight().wasAbleTo(Login.authentication(username, password));
    }

    @Cuando("^ingresa los datos del candidato$")
    public void ingresaLosDatosDelCandidatoCristianStivenMonsalvePruebaAComAutomatizadorConConicimientosNotas() {
        theActorInTheSpotlight().attemptsTo(Recruitment.anadir( new Candidate()));

    }

    @Y("este pasa los filtros de contratacion")
    public void estePasaLosFiltrosDeContratacion() {
        theActorInTheSpotlight().attemptsTo(ScheduleInterview.schedule());
    }


    @Entonces("el canditadto es contratado")
    public void elCanditadtoEsContratado() {
    }

}
