package com.userinyerface.userregister.test.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith (CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/com/userinyerface/userregister/test/feature",
		glue = "com.userinyerface.userregister.test.stepdefinitions",
		snippets = SnippetType.CAMELCASE
		)
public class UserRegistrationRunner {

}

