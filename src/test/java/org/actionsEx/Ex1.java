package org.actionsEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.utilities.BaseUtility;

public class Ex1 {

	public static void main(String[] args) {
		System.out.println("Program Start");
		BaseUtility Bu = new BaseUtility ();
		WebDriver driver = Bu.startUp("ch", "https://demoqa.com/webtables");
		WebElement CierraEditBtn = driver.findElement(By.xpath("//div[text()='Cierra']/following-sibling::div//span[@class='mr-2']"));
		Actions act = new Actions (driver);
		act.click(CierraEditBtn).perform();
		WebElement FirstName = driver.findElement(By.id("firstName"));
		FirstName.clear();
		act.click(FirstName).click();
		act.sendKeys(FirstName , "Kiran").perform();
		driver.findElement(By.id("submit")).click();
		System.out.println("Program Ends ");
		

	}

}
