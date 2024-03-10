
package StepDefinition;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utils.LibraryDriver;

public class POM_registration extends LibraryDriver {

	WebDriver driver;

	public void OpenBrowser() {
		this.driver = LibraryDriver.driver;
		driver.get("http://localhost:8080/FlyAway");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}

	public void signupLink() {
		driver.findElement(PageObjRepo.login_signuplink).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.visibilityOfElementLocated(PageObjRepo.signup_link)).click();
	}

	public void registrationForm(String email, String pwd, String cpwd, String name, String address, String city) {
		driver.findElement(PageObjRepo.email_reg).sendKeys(email);
		driver.findElement(PageObjRepo.pwd_reg).sendKeys(pwd);
		driver.findElement(PageObjRepo.cpwd_reg).sendKeys(cpwd);
		driver.findElement(PageObjRepo.name_reg).sendKeys(name);
		driver.findElement(PageObjRepo.address_reg).sendKeys(address);
		driver.findElement(PageObjRepo.city_reg).sendKeys(city);
	}

	public void signUpBtn() {
		driver.findElement(PageObjRepo.signup_btn).click();
	}

	public String registrationStatus() {
		String status;
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
			wait.until(ExpectedConditions.visibilityOfElementLocated(PageObjRepo.loginlink_reg));
			status = "Pass";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			status = "Fail";
		}
		return status;

	}

	public String dbValidation() throws SQLException {
		String dbStatus;
		String conn_String = "jdbc:mysql://localhost:3306/flyaway";
		String qry = "Select * from f_user where name='user030@admin.com'";

		try {
			Connection connection = DriverManager.getConnection(conn_String, "root", "");
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery(qry);
			System.out.println("Connected to DB");

			while (rs.next()) {
				System.out.println("User name: " + rs.getString("name"));
				System.out.println("Email: " + rs.getString("email"));
				System.out.println("City: " + rs.getString("city"));
			}
			dbStatus = "Pass";

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Not connected");
			dbStatus = "Fail";
		}

//		finally {
//			if (rs != null) {
//				try {
//					rs.close();
//					System.out.println("rs closed");
//				} catch (SQLException e) {
//					/* Ignored */}
//			}
//			if (statement != null) {
//				try {
//					statement.close();
//					System.out.println("stmt closed");
//				} catch (SQLException e) {
//					/* Ignored */}
//			}
//			if (connection != null) {
//				try {
//					connection.close();
//					System.out.println("conn closed");
//				} catch (SQLException e) {
//					/* Ignored */}
//			}
//		}
		return dbStatus;

	}
}