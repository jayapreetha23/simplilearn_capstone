package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SD_searchflight {
	WebDriver driver;
	POM_searchflight search = new POM_searchflight();

	@Given("User clicks on Home")
	public void user_clicks_on_home() {
		search.clicksHome();
	}

	@When("user selects the {string} and {string}")
	public void user_selects_the_and(String source, String destination) {
		search.selectsrcdest(source, destination);
	}

	@And("clicks on Search button")
	public void clicks_on_search_button() {
		search.clksearchbtn();
	}

	@Then("flight details will be displayed")
	public void flight_details_will_be_displayed() {
		String search_statuString = search.bookflitlink();
		Assert.assertEquals("Pass", search_statuString);
	}

}
