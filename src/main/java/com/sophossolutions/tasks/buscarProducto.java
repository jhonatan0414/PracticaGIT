package com.sophossolutions.tasks;

import com.sophossolutions.userinterfaces.homePageMercadoLibre;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;

public class buscarProducto implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(Click.on(homePageMercadoLibre.CATEGORIA), Click.on(homePageMercadoLibre.TECNOLOGIA)
				,Click.on(homePageMercadoLibre.CELULAR));
	}

	public static buscarProducto metodoBuscarProducto() {
		// TODO Auto-generated method stub
		return Tasks.instrumented(buscarProducto.class);
	}
}
