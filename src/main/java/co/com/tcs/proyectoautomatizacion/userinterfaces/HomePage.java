package co.com.tcs.proyectoautomatizacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

    public static final Target BUTTON_LISTA = Target.the("button_lista").
            locatedBy("//div[@class='icon icon-hamburger']");
    public static final Target BUTTON_HOGAR = Target.the("button_hogar").
            locatedBy("//span[text()='Hogar']");
    public static final Target BUTTON_CATEGORY = Target.the("button_category").
            locatedBy("//a[text()='Colchones, Base Camas y Almohadas']");
    public static final Target BUTTON_PRODUCT = Target.the("button_product").
            locatedBy("//span[text()='Super Mega Combo Azul Queen 160x190 Reso...']");

}
