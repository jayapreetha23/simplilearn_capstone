package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utils.LibraryDriver;

public class POM_login {

	WebDriver driver;

	public void loginLink() {
		this.driver = LibraryDriver.driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(PageObjRepo.loginlink_reg).click();
	}

	public void enterlogindetails(String email, String pwd) {
		driver.findElement(PageObjRepo.email_lgn).sendKeys(email);
		driver.findElement(PageObjRepo.pwd_lgn).sendKeys(pwd);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}

	public void clicklgnbtn() {
		driver.findElement(PageObjRepo.login_btn).click();
	}

	public String dashboard() {
		String lgn_status;
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
			wait.until(ExpectedConditions.visibilityOfElementLocated(PageObjRepo.dashboard));
			lgn_status = "Pass";

		} catch (Exception e) {
			lgn_status = "Fail";
		}
		return lgn_status;
	}

}
