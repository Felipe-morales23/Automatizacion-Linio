package co.com.tcs.proyectoautomatizacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CartPage {

    public static final Target DELATE = Target.the("delate").
            locatedBy("//a[@ng-click='cart.removeItem(item.sku)']");
    public static final Target MESSAGE_COMPLETE = Target.the("message_complete").
            locatedBy(" //h2[@class='highlight col-md-6 offset-md-3']");
}
