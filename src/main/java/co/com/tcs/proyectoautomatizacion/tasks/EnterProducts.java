package co.com.tcs.proyectoautomatizacion.tasks;

import co.com.tcs.proyectoautomatizacion.userinterfaces.BuyPage;
import co.com.tcs.proyectoautomatizacion.userinterfaces.CartPage;
import co.com.tcs.proyectoautomatizacion.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class EnterProducts implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
        // Iteramos hasta llegar a la compra del producto
        Click.on(HomePage.BUTTON_LISTA),
        Click.on(HomePage.BUTTON_HOGAR),
        Click.on(HomePage.BUTTON_CATEGORY),
        Click.on(HomePage.BUTTON_PRODUCT),
        Click.on(BuyPage.NUMBER_PRODUCTS),
        Click.on(BuyPage.NUMBER),
        Click.on(BuyPage.ADD_SHOPPING_CART),
        Click.on(BuyPage.GO_CART),
        // Eliminamos el producto
        Click.on(CartPage.DELATE));
    }

    public static EnterProducts enterProducts(){
        return Tasks.instrumented(EnterProducts.class);
    }
}
