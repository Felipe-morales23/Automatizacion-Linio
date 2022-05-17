package co.com.tcs.proyectoautomatizacion.stepdefinitions;

import co.com.tcs.proyectoautomatizacion.questions.TheAdditionMessage;
import co.com.tcs.proyectoautomatizacion.questions.TheMessage;
import co.com.tcs.proyectoautomatizacion.tasks.EnterProducts;
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

    @When("^the user goes to the home category and searches for the required product$")
    public void theUserGoesToTheHomeCategoryAndSearchesForTheRequiredProduct() {
        theActorInTheSpotlight().attemptsTo(EnterProducts.enterProducts());
    }

    @Then("^the system will display a message which will show that the product was added correctly (.*)$")
    public void theSystemWillDisplayAMessageWhichWillShowThatTheProductWasAddedCorrectly(String message) {
        theActorInTheSpotlight().should(seeThat(TheAdditionMessage.isVisible(), Matchers.equalTo(message)));
    }

    @Then("^the user will remove the products from the cart and will see an empty cart message (.*)$")
    public void theUserWillRemoveTheProductsFromTheCartAndWillSeeAnEmptyCartMessage(String noproducts){
        theActorInTheSpotlight().should(seeThat(TheMessage.isVisible(), Matchers.equalTo(noproducts)));
    }

}
