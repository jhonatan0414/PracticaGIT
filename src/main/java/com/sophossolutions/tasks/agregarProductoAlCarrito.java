package com.sophossolutions.tasks;

import com.sophossolutions.userinterfaces.pageProductoSeleccionado;
import com.sophossolutions.userinterfaces.pageTecnologia;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class agregarProductoAlCarrito implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(Click.on(pageProductoSeleccionado.BUTTON_CANTIDAD),Click.on(pageProductoSeleccionado.CANTIDAD)
				//,Click.on(pageProductoSeleccionado.BUTTON_AGREGAR_CARRITO)
				);
	}

	public static agregarProductoAlCarrito metodoAgregar() {
		return Tasks.instrumented(agregarProductoAlCarrito.class);
	}
	
}
