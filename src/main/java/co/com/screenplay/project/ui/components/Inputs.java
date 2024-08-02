package co.com.screenplay.project.ui.components;

import net.serenitybdd.screenplay.targets.Target;

public class Inputs {


    public static final Target INPUT = Target.the("inputs").
            locatedBy("//label[normalize-space()='{0}']/ancestor::div[@class='oxd-input-group']//input[@placeholder='{1}']");

    public static final Target SEPARATE_INPUT = Target.the("inputs separados").
            locatedBy("//label[normalize-space()='{0}']/ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//input[@placeholder='{1}']");

    public static final Target TEXT_AREA = Target.the("inputs separados").
            locatedBy("//label[normalize-space()='{0}']/ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//textarea[@placeholder='{1}']");

    public static final Target INPUT_LIST = Target.the("Click Select").
            locatedBy("//label[normalize-space()='{0}']/ancestor::div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-select-text-input']");

    public static final Target SELECT = Target.the("select list").
            locatedBy("//label[normalize-space()='{0}']/ancestor::div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@role='listbox']//span[normalize-space()='{1}']");

    public static final Target UPLOAD_FILE = Target.the("La variedad de opciones del menu").
            locatedBy("//input[@type='file']");

    public static final Target CHECK = Target.the("La variedad de opciones del menu").
            locatedBy("//div[@class='oxd-checkbox-wrapper']//span");

}
