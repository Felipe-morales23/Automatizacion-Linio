package co.com.tcs.proyectoautomatizacion.tasks;

import co.com.tcs.proyectoautomatizacion.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class EnterProducts implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        Click.on(HomePage.BUTTON_HOGAR);
    }
}
