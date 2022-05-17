package co.com.tcs.proyectoautomatizacion.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src\\test\\resources\\features\\buy_products.feature",
        glue = "co.com.tcs.proyectoautomatizacion.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)

public class BuyProducts {
}
