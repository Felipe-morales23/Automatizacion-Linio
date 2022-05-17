package co.com.tcs.proyectoautomatizacion.questions;

import co.com.tcs.proyectoautomatizacion.userinterfaces.CartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class TheMessage implements Question<String>{
    @Override
    public String answeredBy(Actor actor) {
        return CartPage.MESSAGE_COMPLETE.resolveAllFor(actor).get(0).getText();
    }
    public static TheMessage isVisible(){
        return new TheMessage();
    }

}