package com.rmqa.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/features/hrmlogin.feature",
		glue = {"com.rmqa.steps"}
		)
public class TestRunner {

}
