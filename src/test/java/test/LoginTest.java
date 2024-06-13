package test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import pages.LoginPage;
import testBase.TestBase;

public class LoginTest extends TestBase {
	
	LoginPage LP;

	public LoginTest() {
		super();
		
	}
	
	@BeforeSuite
	public void setup() throws IOException
	{
		initialize();
		LP= new LoginPage(driver);
	}
	
	@Test(priority=1)
	public void login_TestCase_without_entering_credentials() {

		LP.click_login_button();
		LP.popup_handling();
		AssertJUnit.assertEquals(true, LP.check_username_textbox());
	}
	
	@Test(priority=2)
	public void login_TestCase_invalidUsername_withoutPassword() {
		LP.enterData_usersameTextbox(prop.getProperty("user2"));
		LP.click_login_button();
		LP.popup_handling();
		AssertJUnit.assertEquals(true, LP.check_username_textbox());
	}
	
	@Test(priority=3)
	 public void login_TestCase_validUsername_withoutPassword(){
		LP.cleardata_usernameTextbox();
		LP.enterData_usersameTextbox(prop.getProperty("user1"));
		LP.click_login_button();
		LP.popup_handling();
		AssertJUnit.assertEquals(true, LP.check_username_textbox());
	}
	
	@Test(priority=4)
	 public void login_TestCase_withoutUsername_invalidPassword(){
		 LP.cleardata_usernameTextbox();
		 LP.enterData_passworTextbox(prop.getProperty("pass2"));
		 LP.click_login_button();
		 LP.popup_handling();
		 AssertJUnit.assertEquals(true, LP.check_username_textbox());
	}
	
	@Test(priority=5)
	 public void login_TestCase_withoutUsername_validPassword(){
		 LP.clearData_passwordTextbox();
		 LP.enterData_passworTextbox(prop.getProperty("pass1"));
		 LP.click_login_button();
		 LP.popup_handling();
		 AssertJUnit.assertEquals(true, LP.check_username_textbox());	  
	}
	
	@Test(priority=6)
	 public void login_TestCase_invalidUsername_invalidPassword(){
		 LP.clearData_passwordTextbox();
		 LP.enterData_usersameTextbox(prop.getProperty("user2"));
		 LP.enterData_passworTextbox(prop.getProperty("pass2"));
		 LP.click_login_button();
		 AssertJUnit.assertEquals(true, LP.check_username_textbox());
	}
	
	@Test(priority=7)
	 public void login_TestCase_validUsername_invalidPassword(){
		 LP.cleardata_usernameTextbox();
		 LP.clearData_passwordTextbox();
		 LP.enterData_usersameTextbox(prop.getProperty("user1"));
		 LP.enterData_passworTextbox(prop.getProperty("pass2"));
		 LP.click_login_button();
		 AssertJUnit.assertEquals(true, LP.check_username_textbox());
		 
	}
	
	@Test(priority=8)
	 public void login_TestCase_invalidUsername_validPassword(){
		 LP.cleardata_usernameTextbox();
		 LP.clearData_passwordTextbox();
		 LP.enterData_usersameTextbox(prop.getProperty("user2"));
		 LP.enterData_passworTextbox(prop.getProperty("pass1"));
		 LP.click_login_button();
		 AssertJUnit.assertEquals(true, LP.check_username_textbox());
	}
	
	@Test(priority=9)
	 public void login_TestCase_validUsername_validPassword(){
		 LP.cleardata_usernameTextbox();
		 LP.clearData_passwordTextbox();
		 LP.login(prop.getProperty("user1"), prop.getProperty("pass1"));
		 AssertJUnit.assertEquals(LP.check_welcomeText_afterLogin(),true);
	
	}
	
   @AfterSuite
	public void teardown()
	{
		closure();
	}

}
