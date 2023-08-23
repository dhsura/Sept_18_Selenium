package org.actiTime;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.utilities.BaseUtility;

public class ActiTimeLogin3 {

	public static void main(String[] args) {
		System.out.println("Program Start");
		BaseUtility Bu = new BaseUtility();
		WebDriver driver = Bu.startUp("ch", "http://localhost:93/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("manager");
		driver.findElement(By.cssSelector("#loginButton>div")).click();

		
//		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(25));
//		wt.until(ExpectedConditions.titleContains("Enter Time-Track"));
		
		Bu.WaitForTitleContains(driver,30, "Enter Time-Track");
		System.out.println("Dashboard Title : "+driver.getTitle());
		
	//	wt.until(ExpectedConditions.urlContains("submit_tt"));
		Bu.WaitForURLContains(driver, 30,"submit_tt");
		System.out.println("Dashboard URL "+driver.getCurrentUrl());
		
		driver.findElement(By.cssSelector(".logout"));
		
		System.out.println("Program Ends");

	}

}
