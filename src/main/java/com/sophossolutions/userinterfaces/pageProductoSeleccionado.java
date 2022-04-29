package com.sophossolutions.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class pageProductoSeleccionado {

	public static final Target BUTTON_CANTIDAD = Target.the("Button Cantidad").located(By.xpath("//button[@aria-describedby='quantity-selector']"));
	public static final Target CANTIDAD = Target.the("Seleccionar cantidad").located(By.xpath("//span[@class='andes-list__item-primary' and contains(text(),'3')]"));
	public static final Target BUTTON_AGREGAR_CARRITO = Target.the("Agregar producto al carrito").located(By.xpath("//button[@class='andes-button andes-button--quiet']"));
	public static final Target PRECIO=Target.the("Precio del producto").located(By.xpath("//div[@class='ui-pdp-container__col col-2 mr-32']//div[@class='ui-pdp-price__second-line']//span[@class='price-tag-fraction']"));
}
