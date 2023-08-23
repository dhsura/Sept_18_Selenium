package org.actiTime;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BaseUtility;

public class ClearAndKeysEx {

	public static void main(String[] args) {
		System.out.println("Program Start");
		BaseUtility Bu = new BaseUtility ();
		WebDriver driver =Bu.startUp("ch", "https://demoqa.com/webtables"); 
		WebElement CieraEditBtn = driver.findElement(By.xpath("//div[text()='Cierra']/following-sibling::div//span[@title='Edit']"));
		CieraEditBtn.click();
		WebElement FirstName = driver.findElement(By.cssSelector("#firstName"));
//		FirstName.clear();
		FirstName.sendKeys(Keys.chord(Keys.CONTROL ,"a"));
		FirstName.sendKeys("Kiran");
		driver.findElement(By.cssSelector("#submit")).click();
		
		System.out.println("Program Ends");

	}

}
