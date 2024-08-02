package co.com.screenplay.project.ui.components;

import net.serenitybdd.screenplay.targets.Target;

public class Buttons {

    public static final Target BOTON = Target.the("botones").
            locatedBy("//button[normalize-space()='{0}']");

    public enum Botones {
        ANADIR_BTN("Add"),

        GUARDAR_BTN("Save"),

        SHORTLIST_BTN("Shortlist"),

        SCHEDULE_BTN("Schedule Interview"),

        PASSED_BTN("Mark Interview Passed"),

        OFFER_BTN("Offer Job"),

        HIRED_BTN("Hire");

        private String botonTexto;

        Botones(String botonTexto) {
            this.botonTexto = botonTexto;
        }

        public Target getBoton() {
            return BOTON.of(botonTexto);
        }
    }
}
