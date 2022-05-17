package co.com.tcs.proyectoautomatizacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

    public static final Target BUTTON_HOGAR = Target.the("button_hogar").
            locatedBy("/html/body/div[3]/main/div[1]/div[1]/div[5]/div/div[3]/div[2]");
    public static final Target BUTTON_CONFORT = Target.the("button_confort").
            locatedBy("/html/body/div[3]/main/div/div[1]/div[2]");
    public static final Target BUTTON_ITEM = Target.the("button_item").
            locatedBy("//*[@id=\"catalogue-product-container\"]/div[16]/a[1]/div[2]");

}
