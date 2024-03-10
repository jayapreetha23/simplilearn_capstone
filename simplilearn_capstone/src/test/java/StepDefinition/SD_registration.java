package StepDefinition;

import java.sql.SQLException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SD_registration {

	WebDriver driver;
	POM_registration reg = new POM_registration();

	@Given("User launch flyaway application url")
	public void user_launch_flyaway_application_url() {
		reg.OpenBrowser();
	}

	@When("User clicks on Signup link, Registration page opens")
	public void user_clicks_on_signup_link_registration_page_opens() {
		reg.signupLink();
	}

	@When("User enters registration details: {string}, {string}, {string}, {string}, {string} and {string}")
	public void user_enters_registration_details_and(String email, String pwd, String cpwd, String name, String address,
			String city) {
		reg.registrationForm(email, pwd, cpwd, name, address, city);
	}

	@When("User clicks on SignUp button")
	public void user_clicks_on_sign_up_button() {
		reg.signUpBtn();
	}

	@Then("User should be registered successfully")
	public void user_should_be_registered_successfully() {
		String status = reg.registrationStatus();
		Assert.assertEquals(status, "Pass");
	}

	@Then("validate the user details stored in database")
	public void validate_the_user_details_stored_in_database() throws SQLException {
		String dbstatus = reg.dbValidation();
		Assert.assertEquals(dbstatus, "Pass");
	}

}
