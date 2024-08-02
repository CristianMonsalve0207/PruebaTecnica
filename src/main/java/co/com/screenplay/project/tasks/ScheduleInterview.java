package co.com.screenplay.project.tasks;

import co.com.screenplay.project.interaction.ClickSeguro;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.screenplay.project.ui.ScheduleUI.*;
import static co.com.screenplay.project.ui.components.Buttons.Botones.*;
import static co.com.screenplay.project.ui.components.Menu.OpcionesMenu.REClUTAMIENTO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ScheduleInterview implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(ClickSeguro.on(SCHEDULE_BTN.getBoton()));
        actor.attemptsTo(WaitUntil.the(TITULO_ENTREVISTA, isVisible()).forNoMoreThan(30).seconds());
        actor.attemptsTo(Enter.theValue("Prueba QA").into(TITULO_ENTREVISTA));
        actor.attemptsTo(Enter.theValue("a").into(ENTREVISTADOR));
        actor.attemptsTo(ClickSeguro.on(ENTREVISTADOR_SLC));
        actor.attemptsTo(ClickSeguro.on(CALENDARIO));
        actor.attemptsTo(ClickSeguro.on(SELECCIONAR_DIA));
        actor.attemptsTo(ClickSeguro.on(TIEMPO));
        actor.attemptsTo(ClickSeguro.on(GUARDAR_BTN.getBoton()));
        actor.attemptsTo(ClickSeguro.on(PASSED_BTN.getBoton()));
        actor.attemptsTo(ClickSeguro.on(GUARDAR_BTN.getBoton()));
        actor.attemptsTo(ClickSeguro.on(OFFER_BTN.getBoton()));
        actor.attemptsTo(ClickSeguro.on(GUARDAR_BTN.getBoton()));
        actor.attemptsTo(ClickSeguro.on(HIRED_BTN.getBoton()));
        actor.attemptsTo(ClickSeguro.on(GUARDAR_BTN.getBoton()));
        actor.attemptsTo(ClickSeguro.on(REClUTAMIENTO.getOpcion()));
    }


    public static ScheduleInterview schedule() {
        return Tasks.instrumented(ScheduleInterview.class);
    }
}
