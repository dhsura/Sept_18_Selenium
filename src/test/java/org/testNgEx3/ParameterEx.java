package org.testNgEx3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.utilities.BaseUtility;

public class ParameterEx {
	@Parameters ({"userName","password"})
	@Test
	public void loginTC (String uName , String pwd) {
		BaseUtility obj = new BaseUtility ();
		WebDriver driver = obj.startUp("ch","http://localhost:93/login.do");
		driver.findElement(By.id("username")).sendKeys(uName);
		driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys(pwd);
		driver.findElement(By.cssSelector("#loginButton>div")).click();
		obj.WaitForVisibilityByType(driver, 10,"cssSelector", ".logout");
		driver.findElement(By.cssSelector(".logout"));
		driver.quit();
	
	}

}
