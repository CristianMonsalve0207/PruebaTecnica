package co.com.screenplay.project.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.hamcrest.Matcher;

public class TargetIs implements Question<Boolean> {

    Matcher matcher;
    Target target;

    public TargetIs(Target target, Matcher matcher) {
        this.target = target;
        this.matcher = matcher;
    }


    @Override
    public Boolean answeredBy(Actor actor) {
      actor.attemptsTo(WaitUntil.the(target, matcher).forNoMoreThan(30).seconds());
        return true;
    }

    public static TargetIs visible(Target target) {
        return new TargetIs(target, WebElementStateMatchers.isVisible());
    }
}
