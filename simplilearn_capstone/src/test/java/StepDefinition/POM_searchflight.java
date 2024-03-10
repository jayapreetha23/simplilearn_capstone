package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utils.LibraryDriver;

public class POM_searchflight extends LibraryDriver {

	WebDriver driver;

	public void clicksHome() {
		this.driver = LibraryDriver.driver;
		driver.findElement(PageObjRepo.home_link).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}

	public void selectsrcdest(String source, String destination) {
		Select drpsource = new Select(driver.findElement(PageObjRepo.source));
		drpsource.selectByVisibleText(source);

		Select drpdestination = new Select(driver.findElement(PageObjRepo.destination));
		drpdestination.selectByVisibleText(destination);
	}

	public void clksearchbtn() {
		driver.findElement(PageObjRepo.submit_Search_btn).click();
	}

	public String bookflitlink() {
		String searchstatus;
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
			wait.until(ExpectedConditions.visibilityOfElementLocated(PageObjRepo.bookflightlink3));
			searchstatus = "Pass";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			searchstatus = "Fail";
		}
		return searchstatus;
	}

}
