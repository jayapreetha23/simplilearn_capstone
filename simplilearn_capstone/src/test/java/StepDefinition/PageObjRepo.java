package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageObjRepo {

	WebDriver driver;

	// Registration Page objects
	public static final By login_signuplink = By.xpath("//a[@href='login'][text()='Login/Signup']");
	public static final By signup_link = By.xpath("//a[@href='signup'][contains(text(), 'Not a member?')]");

	public static final By email_reg = By.xpath("//input[@name='email_id']");
	public static final By pwd_reg = By.xpath("//input[@name='pwd']");
	public static final By cpwd_reg = By.xpath("//input[@name='pwd2']");
	public static final By name_reg = By.xpath("//input[@name='name']");
	public static final By address_reg = By.xpath("//input[@name='address']");
	public static final By city_reg = By.xpath("//input[@name='city']");
	public static final By signup_btn = By.xpath("//button[text()='Signup']");
	public static final By loginlink_reg = By.xpath("//a[@href='login'][text()='Login to continue checking flights']");

	// Login page objects
	public static final By email_lgn = By.xpath("//input[@name='email_id']");
	public static final By pwd_lgn = By.xpath("//input[@name='pwd']");
	public static final By login_btn = By.xpath("//button[text()='Login']");

	public static final By dashboard = By.xpath("//h3[text()=' FLYAWAY - DASHBOARD ']");
	public static final By home_link = By.xpath("//a[@href='home'][text()='Home']");

	// search flight page objects
	public static final By source = By.xpath("//select[@name='source']");
	public static final By destination = By.xpath("//select[@name='destination']");
	public static final By submit_Search_btn = By.xpath("//button[text()='Submit']");
	public static final By bookflightlink3 = By.xpath("//a[@href='bookflight?id=3']");

	// Book flight page objects
	public static final By bookflight_lnk = By.xpath("//a[@href='bookflight?id=7'][text()='Book Flight']");
	public static final By paym_gateway_h3 = By.xpath("//h3[text()=' FLYAWAY - PAYMENT GATEWAY ']");
	public static final By booking_conf_lnk = By
			.xpath("//a[@href=\"completepurchase\"][text()='Click to complete booking']");
	public static final By booking_conf_h3 = By.xpath("//h3[text()=' FLYAWAY - BOOKING CONFIRMATION ']");
	public static final By see_bookings = By.xpath("//a[@href='memberbookings'][text()='See Your Bookings']");
	public static final By your_bookings_h3 = By.xpath("//h3[text()=' FLYAWAY - YOUR BOOKINGS ']");

}
