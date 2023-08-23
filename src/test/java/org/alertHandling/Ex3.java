package org.alertHandling;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.utilities.BaseUtility;

public class Ex3 {

	public static void main(String[] args) {
		System.out.println("Program Start");
		BaseUtility Bu = new BaseUtility ();
		WebDriver driver = Bu.startUp("ch", "https://demoqa.com/alerts");
		
		driver.findElement(By.id("alertButton")).click();
	    String txt = driver.switchTo().alert().getText();
		System.out.println("Text : "+txt);
		driver.switchTo().alert().accept();		
		System.out.println("Program ends");
		driver.quit();
	}

}
