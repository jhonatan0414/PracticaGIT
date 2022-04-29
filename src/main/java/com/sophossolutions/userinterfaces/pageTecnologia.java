package com.sophossolutions.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class pageTecnologia {

	public static final Target PRODUCTO = Target.the("Seleccion del producto").located(By.xpath("//h2[contains(text(),'Xiaomi Redmi 9A Dual SIM 32 GB gris granito 2 GB RAM')]"));
	public static final Target COOKIES = Target.the("Aceptar los cookies").located(By.id("newCookieDisclaimerButton"));
}
