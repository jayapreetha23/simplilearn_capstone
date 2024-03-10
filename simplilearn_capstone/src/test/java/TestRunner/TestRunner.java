package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/java/Features/flyaway.feature" }, glue = {
		"StepDefinition" }, tags = "@flyaway")

public class TestRunner {

}
