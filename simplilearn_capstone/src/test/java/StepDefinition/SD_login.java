package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SD_login {

	WebDriver driver;
	POM_login login = new POM_login();

	@Given("User clicks on login link, login page opens")
	public void user_clicks_on_login_link_login_page_opens() {
		login.loginLink();
	}

	@When("User enters login details: {string} and {string}")
	public void user_enters_login_details_and(String email, String pwd) {
		login.enterlogindetails(email, pwd);
	}

	@And("User clicks on login button")
	public void user_clicks_on_login_button() {
		login.clicklgnbtn();
	}

	@Then("User should be logged in successfully")
	public void user_should_be_logged_in_successfully() {
		String login_status = login.dashboard();
		Assert.assertEquals("Pass", login_status);
	}

}
