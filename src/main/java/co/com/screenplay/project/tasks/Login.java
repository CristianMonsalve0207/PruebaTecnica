package co.com.screenplay.project.tasks;

import co.com.screenplay.project.interaction.ClickSeguro;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.util.EnvironmentVariables;

import static co.com.screenplay.project.ui.LoginOrangeUI.*;
import static co.com.screenplay.project.utils.Constants.TIME_SHORT;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

@Slf4j
@AllArgsConstructor
public class Login implements Task {

    private static EnvironmentVariables environmentVariables;
    private String username;
    private String password;

    @Override
    @Step("{0} se autentica y acepta la alert del mensaje")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(MODAL_LOGIN, isVisible()).forNoMoreThan(TIME_SHORT).seconds());
        actor.attemptsTo(Enter.theValue(username).into(USER_NAME));
        actor.attemptsTo(Enter.theValue(password).into(PASSWORD));
        actor.attemptsTo(ClickSeguro.on(BTN_LOGIN));


    }

    public static Login authentication(String user, String pwd) {
        return Tasks.instrumented(Login.class, user, pwd);
    }
}