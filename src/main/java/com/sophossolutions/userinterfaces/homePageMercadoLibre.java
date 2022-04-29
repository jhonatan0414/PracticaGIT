package com.sophossolutions.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.mercadolibre.com.co")
public class homePageMercadoLibre extends PageObject{

	public static final Target CATEGORIA = Target.the("Seccion Categorias").located(By.xpath("//a[@data-js='nav-menu-categories-trigger']"));
	public static final Target TECNOLOGIA = Target.the("Seccion Tecnologia").located(By.xpath("//a[contains(text(),'Tecnología')]"));
	public static final Target CELULAR = Target.the("Celulares y Smartphones").located(By.xpath("//a[contains(text(),'Celulares y Smartphones')]"));
}
