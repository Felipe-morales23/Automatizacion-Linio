package co.com.tcs.proyectoautomatizacion.stepdefinitions;

import co.com.tcs.proyectoautomatizacion.userinterfaces.LinioPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class BuyProductsStepDefinitions {

    LinioPage page;

    @Before
    public void setup(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("felipe");
    }
    @Given("^the user is in the application (.*)$")
    public void theUserIsInTheApplicationHttpsWwwLinioComCo(String url) {
        theActorInTheSpotlight().wasAbleTo(Open.browserOn(page));
    }

    @When("^the user is directed to the category section (.*)(.*)$")
    public void theUserIsDirectedToTheCategorySection(String category, String section) {
    }

    @When("^select the required product and add three quantities to the cart$")
    public void selectTheRequiredProductAndAddThreeQuantitiesToTheCart() {
    }

    @When("^the user will see the total of the purchase and will eliminate the product$")
    public void theUserWillSeeTheTotalOfThePurchaseAndWillEliminateTheProduct() {
    }

    @Then("^the user will see the message (.*)$")
    public void theUserWillSeeTheMessage(String message) {
    }

}
