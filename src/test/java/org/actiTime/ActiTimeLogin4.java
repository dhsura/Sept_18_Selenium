package org.actiTime;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.utilities.BaseUtility;

import com.google.common.base.Function;

public class ActiTimeLogin4 {

	public static void main(String[] args) {
		System.out.println("Program Start");
		BaseUtility Bu = new BaseUtility();
		WebDriver driver = Bu.startUp("ch", "http://localhost:93/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("manager");
		driver.findElement(By.cssSelector("#loginButton>div")).click();
		//Way -1 
//		FluentWait<WebDriver> wt = new FluentWait<WebDriver>(driver);
//		wt.withTimeout(Duration.ofSeconds(30))
//		.pollingEvery(Duration.ofMillis(200))
//		.ignoring(Exception.class);
//		wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(".logout"))));
//     
		// Way-2 
		FluentWait<WebDriver> wt = new FluentWait<WebDriver>(driver);
		wt.withTimeout(Duration.ofSeconds(30))
		.pollingEvery(Duration.ofMillis(200))
		.ignoring(Exception.class);
		wt.until(new Function<WebDriver,WebElement>() {
			public WebElement apply (WebDriver driver) {
				return driver.findElement(By.cssSelector(".logout")); 
			}
		});
     
		driver.findElement(By.cssSelector(".logout"));
		
	
		System.out.println("Program Ends");

	}


}
