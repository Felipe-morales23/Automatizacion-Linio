package co.com.tcs.proyectoautomatizacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class BuyPage {

    public static final Target NUMBER_PRODUCTS = Target.the("number_products").
            locatedBy("//div[@class='select-dropdown select-dropdown-product-quantity']");
    public static final Target NUMBER = Target.the("number").
            locatedBy("//li[@data-value='3']");
    public static final Target ADD_SHOPPING_CART = Target.the("add_shopping_cart").
            locatedBy("//div[@class='col-9']");
    public static final Target MESSAGE_SUCCESSFUL = Target.the("message_successful").
            locatedBy("//h2[@class='added-product  highlight']");
    public static final Target GO_CART = Target.the("go_cart").
            locatedBy("//a[@class='btn btn-sm btn-go-to-cart added-product']");
}
