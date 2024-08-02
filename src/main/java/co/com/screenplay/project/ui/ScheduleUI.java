package co.com.screenplay.project.ui;

import net.serenitybdd.screenplay.targets.Target;

public class ScheduleUI {

    public static final Target TITULO_ENTREVISTA = Target.the("boton Agendar Entrevista").locatedBy("//label[normalize-space()='Interview Title']/ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//input");
    public static final Target ENTREVISTADOR = Target.the("boton Agendar Entrevista").locatedBy("//input[@include-employees='onlyCurrent']");
    public static final Target ENTREVISTADOR_SLC = Target.the("boton Agendar Entrevista").locatedBy("(//div[@role='listbox']//span)[1]");
    public static final Target CALENDARIO = Target.the("icono Calendario").locatedBy("//i[@class='oxd-icon bi-calendar oxd-date-input-icon']");
    public static final Target SELECCIONAR_DIA = Target.the("selecciona dia").locatedBy("//div[@class='oxd-calendar-date --selected --today']");
    public static final Target TIEMPO = Target.the("icono tiempo").locatedBy("//i[@class='oxd-icon bi-clock oxd-time-input--clock']");
    public static final Target VALIDAR_HIRED = Target.the("boton guardar").locatedBy("(//div[@class='orangehrm-container']//div[normalize-space()='{0}']/following-sibling::div[normalize-space()='Hired'])[1]");


}
