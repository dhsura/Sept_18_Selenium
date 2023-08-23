package org.testNgEx1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.utilities.BaseUtility;

public class ActitimeEx1 {
	@Test 
	public void verifyDashboardURL () {
		BaseUtility obj = new BaseUtility ();
		WebDriver driver = obj.startUp("ch","http://localhost:93/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("manager");
		driver.findElement(By.cssSelector("#loginButton>div")).click();
		obj.WaitForVisibilityByType(driver, 25,"cssSelector", ".logout");
		obj.WaitForTitleContains(driver, 20, "Enter Time-Track");
		String actURL = driver.getCurrentUrl();
		System.out.println("Actual Url = "+actURL );
		if(driver.getCurrentUrl().equals("http://localhost:93/login.do")) {
			System.out.println("Login URL is as Expected");
		}else { 
			System.out.println("Login URL is Not as Expected");
		}
		driver.findElement(By.cssSelector(".logout"));
		driver.quit();
		
	}
	
	@Test 
	public void verifyDashboardTitle () {
		BaseUtility obj = new BaseUtility ();
		WebDriver driver = obj.startUp("ch","http://localhost:93/login.do");
//		driver.findElement(By.id("username")).sendKeys("admin");
//		driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("manager");
//		driver.findElement(By.cssSelector("#loginButton>div")).click();
//		obj.WaitForVisibilityByType(driver, 25,"cssSelector", ".logout");
//		obj.WaitForTitleContains(driver, 20, "submit_tt");
//		
		String actiTitle = driver.getTitle();
		System.out.println("Actual Title = "+actiTitle);
		if(driver.getTitle().equals("actiTIME - Login")) {
			System.out.println("Login Title is as Expected");
		}else {
			System.out.println("Login Title is Not as Expected");
		}
		
		driver.quit();
		
	}
	
	

}
