package org.dropdownHandeling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.utilities.BaseUtility;

public class WOSingleSelectEx2 {

	public static void main(String[] args) {
		System.out.println("Program Start");
		BaseUtility Bu = new BaseUtility();
		WebDriver driver = Bu.startUp("ch", "https://demoqa.com/select-menu");
		WebElement ele = driver.findElement(By.cssSelector("#withOptGroup>div>div:first-child"));
//		ele.click();
//		ele.sendKeys("Group 2, option 2");   //send keys won't work
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", ele);		
//		Actions act = new Actions (driver);
//		act.click(ele).perform();		
		WebElement data = driver.findElement(By.xpath("//div[text()='Group 2, option 2']"));
		Actions act = new Actions (driver);
		act.click(data).perform();	
		System.out.println("Program Ends");

	}

}
