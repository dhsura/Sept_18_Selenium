package org.actiTime;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.utilities.BaseUtility;

public class ActiTimeLogin2 {

	public static void main(String[] args) {
		System.out.println("Program Start");
		BaseUtility Bu = new BaseUtility();
		WebDriver driver = Bu.startUp("ch", "http://localhost:93/login.do");
		
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("manager");
		driver.findElement(By.cssSelector("#loginButton>div")).click();
//
//		WebDriverWait wt = new WebDriverWait(driver,Duration.ofSeconds(50));
//		wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(".logout"))));
		
		Bu.WaitForVisibilityByType(driver, 25,"cssSelector", ".logout");
		
		driver.findElement(By.cssSelector(".logout"));
		
		System.out.println("Program Ends");

	}

}
