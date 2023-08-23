package org.testNgEx3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.utilities.BaseUtility;

public class DataProviderEx2 {
	
	@Test (dataProvider="logcred")
	public void loginTC (String userName , String password) {
		BaseUtility obj = new BaseUtility ();
		WebDriver driver = obj.startUp("ch","http://localhost:93/login.do");
		driver.findElement(By.id("username")).sendKeys(userName);
		driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys(password);
		driver.findElement(By.cssSelector("#loginButton>div")).click();
		obj.WaitForVisibilityByType(driver, 10,"cssSelector", ".logout");
		driver.findElement(By.cssSelector(".logout"));
		driver.quit();
	
	}
	@DataProvider(name="logcred")
	 
	public Object [][] loginCredential () {
		
		Object [][] ar = new Object [4] [2];
		
		ar[0][0] ="admin";
		ar[0][1] ="manager";
		
		ar[0][0] ="admin2";
		ar[0][1] ="manager";
		
		ar[0][0] ="admin";
		ar[0][1] ="manager1";
		
		ar[0][0] ="adminr";
		ar[0][1] ="managersd";
		

		return ar;
	}
}
