package org.POM_pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.utilities.BaseUtility;

public class LoginTC {
	private WebDriver driver;
	private BaseUtility Bu = new BaseUtility ();
	@BeforeMethod
	public void beforeMethod () {
		System.out.println("Before Method");
		driver = Bu.startUp("ch", "http://localhost:93/login.do");
	}
	
	@Test 
	public void verifyLoginPage () {
		LoginPage lp_obj = new LoginPage (driver);
		SoftAssert sa = new SoftAssert () ;
		sa.assertTrue(lp_obj.isUserNameFieldDisplayed() , "UserName Field Is Not Displayed");
		sa.assertTrue(lp_obj.isPasswordFieldDisplayed());
		sa.assertTrue(lp_obj.iskeepLoggedInCheckBoxDisplayed());
		sa.assertTrue(lp_obj.isloginButtonDisplayed());
		sa.assertTrue(lp_obj.isloginLogosDisplayed());
		sa.assertAll();
		Reporter.log("Login Page Is Verify Successfully");
		System.out.println("Login Page Is Verify Successfully");
		
		//Verify user name  field  is displayed
		// Verify password field is displayed.
		// verify keep me login page check box is displayed
		// verify login button is displayed
		// login logo is displayed
		
	}
	@Test 
	public void verifyloginfunction () {
		
		LoginPage lp_obj = new LoginPage (driver);
		lp_obj.enterUserName();
		lp_obj.enterPassword();
		lp_obj.clickonloginBtn();
		Assert.assertTrue(lp_obj.VerifyLogoutLink());
		Reporter.log("Login  Successfully");
		System.out.println("Login Page Is Verify Successfully");
		
		
		//Enter Username
		// Enter password
		//Click on  login
		//Click on  logout
		
		
	}
	@AfterMethod 
	public void tearDown () {
		driver.close();
	}

}
