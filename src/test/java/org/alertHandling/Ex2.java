package org.alertHandling;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.utilities.BaseUtility;

public class Ex2 {

	public static void main(String[] args) {
		System.out.println("Program Start");
		BaseUtility Bu = new BaseUtility ();
		WebDriver driver = Bu.startUp("ch", "https://demoqa.com/alerts");
		
		driver.findElement(By.id("timerAlertButton")).click();
//		WebDriverWait wait = new WebDriverWait (driver,Duration.ofSeconds(20));
//		wait.until(ExpectedConditions.alertIsPresent());
		if(Bu.isAlertPresent(driver, 20)) {
		String txt = driver.switchTo().alert().getText();
		System.out.println("Text : "+txt);
		driver.switchTo().alert().accept();
		System.out.println("Alert is Displayed");
		}else {
			System.out.println("Alert is Not Displayed");
		}
		System.out.println("Program ends");
		driver.quit();
		
	

	}

}
