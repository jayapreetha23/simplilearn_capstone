package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SD_bookflight {

	WebDriver driver;
	POM_bookflight book = new POM_bookflight();

	@When("User click on Bookflight link")
	public void user_click_on_bookflight_link() {
		String paym_gateway_checkString = book.bookFlight();
		Assert.assertEquals(paym_gateway_checkString, "Pass");
	}

	@And("User confirms the payment gateway")
	public void user_confirms_the_payment_gateway() {
		book.confirmpayment();
	}

	@Then("Booking should be successfull.")
	public void booking_should_be_successfull() {
		String booking_status = book.yourbookings();
		Assert.assertEquals("Pass", booking_status);
	}

}
