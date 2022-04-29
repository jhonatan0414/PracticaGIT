package com.sophossolutions.steps;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

import com.sophossolutions.exceptions.generalDemoException;
import com.sophossolutions.questions.validacionTexto;
import com.sophossolutions.tasks.agregarProductoAlCarrito;
import com.sophossolutions.tasks.buscarProducto;
import com.sophossolutions.tasks.seleccionarProducto;
import com.sophossolutions.userinterfaces.homePageMercadoLibre;
import com.sophossolutions.userinterfaces.pageProductoSeleccionado;


public class demoScreenplayStepDefinitions {
		
@Before
public void setup() {
	setTheStage(new OnlineCast());
}
	
	@Given("^Necesito buscar un producto$")
	public void necesitoBuscarUnProducto() {

        theActorCalled("ACTOR_NAME").wasAbleTo(Open.browserOn(new homePageMercadoLibre()));
        theActorInTheSpotlight().attemptsTo(buscarProducto.metodoBuscarProducto());
		
	}


	@When("^El tipo de producto es tecnologico$")
	public void elTipoDeProductoEsTecnologico()  {
		theActorInTheSpotlight().wasAbleTo(seleccionarProducto.metodoSeleccionarProducto());
		theActorInTheSpotlight().wasAbleTo(agregarProductoAlCarrito.metodoAgregar());
	}

	@Then("^Valido que el producto se agregado al carrito de compras$")
	public void validoQueElProductoSeAgregadoAlCarritoDeCompras() {
	  theActorInTheSpotlight().should(seeThat(validacionTexto.getTexto(pageProductoSeleccionado.PRECIO),equalTo("389.000")).
			  orComplainWith(generalDemoException.class,"El valor optenido difiere del esperado"));
	}



}
