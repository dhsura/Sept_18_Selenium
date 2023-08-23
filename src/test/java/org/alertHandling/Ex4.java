package org.alertHandling;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.utilities.BaseUtility;

public class Ex4 {

	public static void main(String[] args) {
		System.out.println("Program Start");
		BaseUtility Bu = new BaseUtility ();
		WebDriver driver = Bu.startUp("ch", "https://demoqa.com/alerts");
		
		driver.findElement(By.id("confirmButton")).click();
		String txt = driver.switchTo().alert().getText();
		System.out.println("Text : "+txt);
//		driver.switchTo().alert().accept();	
		driver.switchTo().alert().dismiss();
		System.out.println("Program ends");
		driver.quit();
		
	

	}

}
