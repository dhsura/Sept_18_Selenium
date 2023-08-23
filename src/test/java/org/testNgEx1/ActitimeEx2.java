package org.testNgEx1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.utilities.BaseUtility;

public class ActitimeEx2 {
	private WebDriver driver;
	private BaseUtility obj = new BaseUtility ();
	
	@BeforeMethod  
	public void login () {
		
		driver = obj.startUp("ch","http://localhost:93/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("manager");
		driver.findElement(By.cssSelector("#loginButton>div")).click();
		obj.WaitForVisibilityByType(driver, 25,"cssSelector", ".logout");
	}
	@AfterMethod 
	public void logout () {
		obj.WaitForVisibilityByType(driver, 25,"cssSelector", ".logout");
		driver.findElement(By.cssSelector(".logout"));
		driver.quit();
	}
	
	@Test 
	public void verifyDashboardURL () {
	
		
		String actURL = driver.getCurrentUrl();
		System.out.println("Actual Url = "+actURL );
		if(driver.getCurrentUrl().equals("http://localhost:93/login.do")) {
			System.out.println("Login URL is as Expected");
		}else { 
			System.out.println("Login URL is Not as Expected");
		}
		
		
	}
	
	@Test 
	public void verifyDashboardTitle () {
		obj.WaitForTitleContains(driver, 20, "actiTIME - Login");
		String actiTitle = driver.getTitle();
		System.out.println("Actual Title = "+actiTitle);
		if(driver.getTitle().equals("actiTIME - Login")) {
			System.out.println("Login Title is as Expected");
		}else {
			System.out.println("Login Title is Not as Expected");
		}	
		
	}
	
	

}
