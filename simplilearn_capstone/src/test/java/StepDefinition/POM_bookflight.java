
package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utils.LibraryDriver;

public class POM_bookflight {

	WebDriver driver;

	public String bookFlight() {
		this.driver = LibraryDriver.driver;
		driver.findElement(PageObjRepo.bookflightlink3).click();
		String payment_gateway_check;
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
			wait.until(ExpectedConditions.visibilityOfElementLocated(PageObjRepo.paym_gateway_h3));
			payment_gateway_check = "Pass";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			payment_gateway_check = "Fail";
		}
		return payment_gateway_check;
	}

	public void confirmpayment() {
		driver.findElement(PageObjRepo.booking_conf_lnk).click();

	}

	public String yourbookings() {
		driver.findElement(PageObjRepo.see_bookings).click();
		String booking_status;
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
			wait.until(ExpectedConditions.visibilityOfElementLocated(PageObjRepo.your_bookings_h3));
			booking_status = "Pass";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			booking_status = "Fail";
		}
		return booking_status;
	}

}
