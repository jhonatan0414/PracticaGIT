package com.sophossolutions.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class validacionTexto implements Question<String> {

	private Target target;
	
	public validacionTexto(Target target) {
		this.target=target;
	}

	@Override
	public String answeredBy(Actor actor) {
		// TODO Auto-generated method stub
		return Text.of(target).viewedBy(actor).asString();
	}
	
	public static validacionTexto getTexto(Target target) {
		return new validacionTexto(target);
	}
	
}
