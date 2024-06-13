package pages;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testBase.TestBase;
public class LoginPage extends TestBase {	
	//POM using Page Factory Implementation
	//@FindBy(locator= "locatorvalue")
	// WebElement element;
	WebDriver driver;
	
	@FindBy(xpath="//*[@name='txtUserName']")
	WebElement username_txtbox;
	
	@FindBy(xpath="//*[@name='txtPassword']")
	WebElement password_txtbox;
	
	@FindBy(xpath="//input[@name=\"Submit\"]")
	WebElement login_button;
	
	@FindBy(xpath="//input[@name=\"clear\"]")
	WebElement clear_button;
	
	@FindBy(xpath="//li[text()='Welcome Himanib']")
	WebElement welcome_txt;
	
	//constructor call
	public LoginPage(WebDriver driver)
	{ 	
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//methods
	public void enterData_usersameTextbox(String uname)
	{
		username_txtbox.sendKeys(uname);
	}
	
	public void cleardata_usernameTextbox()
	{
		username_txtbox.clear();
	}
	
	public void enterData_passworTextbox(String password)
	{
		password_txtbox.sendKeys(password);
	}
	public void clearData_passwordTextbox()
	{
		password_txtbox.clear();
	}
	
	public void click_login_button()
	{
		login_button.submit();
	}
	
	public void click_clear_button()
	{
		clear_button.click();
	}
	
	//popup handling method
	public void popup_handling() {
		Alert alt= driver.switchTo().alert();
		alt.accept();
	}
	
	public void login(String uname, String password)
	{
		username_txtbox.sendKeys(uname);
		password_txtbox.sendKeys(password);
		login_button.submit();
	}
	//for assertion
	public boolean check_username_textbox()
	{
		return username_txtbox.isDisplayed();
		
	}
	
	public boolean check_welcomeText_afterLogin() {
		return welcome_txt.isDisplayed();
	}
}
