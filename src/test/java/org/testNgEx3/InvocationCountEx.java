package org.testNgEx3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.utilities.BaseUtility;

public class InvocationCountEx {
	@Test (invocationCount=5 , threadPoolSize=2)
	public void verifyDashboardURL () {
		BaseUtility obj = new BaseUtility ();
		WebDriver driver = obj.startUp("ch","http://localhost:93/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("manager");
		driver.findElement(By.cssSelector("#loginButton>div")).click();
		obj.WaitForVisibilityByType(driver, 25,"cssSelector", ".logout");
		driver.findElement(By.cssSelector(".logout"));
		driver.quit();
	
	}

}
