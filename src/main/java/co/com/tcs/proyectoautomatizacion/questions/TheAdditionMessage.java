package co.com.tcs.proyectoautomatizacion.questions;

import co.com.tcs.proyectoautomatizacion.userinterfaces.BuyPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class TheAdditionMessage implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return BuyPage.MESSAGE_SUCCESSFUL.resolveAllFor(actor).get(0).getText();
    }
    public static TheAdditionMessage isVisible(){
        return new TheAdditionMessage();
    }

}