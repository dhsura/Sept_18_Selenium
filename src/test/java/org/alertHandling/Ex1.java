package org.alertHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.utilities.BaseUtility;

public class Ex1 {

	public static void main(String[] args) {
		System.out.println("Program Start");
		BaseUtility Bu = new BaseUtility ();
		WebDriver driver = Bu.startUp("ch", "https://demoqa.com/alerts");
		
		Bu.ScrollBypageDown(driver, 1);
		
		Actions act = new Actions (driver);
		WebElement ele = driver.findElement(By.id("promtButton"));
		act.click(ele).perform();
		Alert alt = driver.switchTo().alert();
		System.out.println("Text : "+alt.getText());
		alt.sendKeys("Suraj Dhanvij");
		alt.accept();	
		System.out.println("Program Ends");
		driver.quit();
	}

	}


