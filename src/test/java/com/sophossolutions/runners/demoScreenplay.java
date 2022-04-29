package com.sophossolutions.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import cucumber.api.SnippetType;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features="src/test/resources/com/sophossolutions/resources/demoScreenplay.feature",
		glue="com.sophossolutions.steps",
		snippets=SnippetType.CAMELCASE
)
public class demoScreenplay {
	
}
