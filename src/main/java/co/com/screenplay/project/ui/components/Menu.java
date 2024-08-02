package co.com.screenplay.project.ui.components;

import net.serenitybdd.screenplay.targets.Target;

public class Menu {

    public static final Target NAVEGAR_MENU = Target.the("La variedad de opciones del menu").
            locatedBy("//li//a//span[normalize-space()='{0}']");

    public enum OpcionesMenu {
        REClUTAMIENTO("Recruitment");

        private String opcion;

        OpcionesMenu(String opcion) {
            this.opcion = opcion;
        }

        public Target getOpcion() {
            return NAVEGAR_MENU.of(opcion);
        }
    }
}
