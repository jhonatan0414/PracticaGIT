package com.sophossolutions.tasks;

import com.sophossolutions.userinterfaces.pageTecnologia;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class seleccionarProducto implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(Click.on(pageTecnologia.COOKIES),Click.on(pageTecnologia.PRODUCTO));
	}

	public static seleccionarProducto metodoSeleccionarProducto() {
		return Tasks.instrumented(seleccionarProducto.class);
	}
}
