package co.com.screenplay.project.interaction;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class ClickSeguro implements Interaction {

    private Target target;
    public ClickSeguro(Target target) {
        this.target = target;
    }

    public static ClickSeguro on(Target target) {
        return new ClickSeguro(target);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(target, isClickable()).forNoMoreThan(120).seconds(),
                Click.on(target)
        );
    }
}
