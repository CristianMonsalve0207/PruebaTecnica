package co.com.screenplay.project.tasks;

import co.com.screenplay.project.interaction.ClickSeguro;
import co.com.screenplay.project.models.Candidate;
import co.com.screenplay.project.utils.Files;
import co.com.screenplay.project.utils.NavigatorUtils;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.screenplay.project.ui.components.Buttons.Botones.*;
import static co.com.screenplay.project.ui.components.Inputs.*;
import static co.com.screenplay.project.ui.components.Menu.OpcionesMenu.REClUTAMIENTO;

public class Recruitment implements Task {
    private Candidate candidate;


    public Recruitment(Candidate candidate) {
        this.candidate = candidate;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(ClickSeguro.on(REClUTAMIENTO.getOpcion()));
        actor.attemptsTo(ClickSeguro.on(ANADIR_BTN.getBoton()));
        actor.attemptsTo(Enter.theValue(candidate.getPrimerNombre()).into(INPUT.of("Full Name", "First Name")));
        actor.attemptsTo(Enter.theValue(candidate.getSegundoNombre()).into(INPUT.of("Full Name", "Middle Name")));
        actor.attemptsTo(Enter.theValue(candidate.getApellido()).into(INPUT.of("Full Name", "Last Name")));
        actor.attemptsTo(ClickSeguro.on(INPUT_LIST.of("Vacancy")));
        actor.attemptsTo(ClickSeguro.on(SELECT.of("Vacancy", "Payroll Administrator")));
        actor.attemptsTo(Enter.theValue(candidate.getEmail()).into(SEPARATE_INPUT.of("Email", "Type here")));
        actor.attemptsTo(Enter.theValue(candidate.getNumeroTelefono()).into(SEPARATE_INPUT.of("Contact Number", "Type here")));
        NavigatorUtils.uploadFile(
                actor, Files.getRouteUpload("Reto.pdf"),String.valueOf(UPLOAD_FILE.getCssOrXPathSelector()));
        actor.attemptsTo(Enter.theValue(candidate.getPalabrasClave()).into(SEPARATE_INPUT.of("Keywords", "Enter comma seperated words...")));
        actor.attemptsTo(Enter.theValue(candidate.getNotas()).into(TEXT_AREA.of("Notes", "Type here")));
        actor.attemptsTo(ClickSeguro.on(CHECK));
        actor.attemptsTo(ClickSeguro.on(GUARDAR_BTN.getBoton()));
        actor.attemptsTo(ClickSeguro.on(SHORTLIST_BTN.getBoton()));
        actor.attemptsTo(Enter.theValue(candidate.getNotas()).into(TEXT_AREA.of("Notes", "Type here")));
        actor.attemptsTo(ClickSeguro.on(GUARDAR_BTN.getBoton()));

    }


    public static Recruitment anadir(Candidate candidate) {
        return Tasks.instrumented(Recruitment.class, candidate);
    }
}
