package org.dropdownHandeling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.utilities.BaseUtility;

public class MultiSelectEx3 {

	public static void main(String[] args) {
		System.out.println("Program Start");
		BaseUtility Bu = new BaseUtility();
		WebDriver driver = Bu.startUp("ch", "https://demoqa.com/select-menu");
		Bu.ScrollBypageDown(driver, 2);
		WebElement ele = driver.findElement(By.xpath
				("//div[p[b[text()='Multiselect drop down']]]//div[contains(@class,' css-1hwfws3')]"));
//		JavascriptExecutor js = (JavascriptExecutor ) driver;
//		js.executeScript("arguments[0].click();", ele);
		Actions act = new Actions (driver);
		act.click(ele).perform();
//		ele.click();
		driver.findElement(By.xpath("//div[text()='Blue']")).click();
		driver.findElement(By.xpath("//div[text()='Red']")).click();
		
		
		System.out.println("Program Ends");

	}

}
