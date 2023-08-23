package org.actionsEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.utilities.BaseUtility;

public class TooltipEx {

	public static void main(String[] args) {
		System.out.println("Program Start");
		BaseUtility Bu = new BaseUtility ();
		WebDriver driver = Bu.startUp("ch", "https://demoqa.com/tool-tips");
		WebElement btn = driver.findElement(By.id("toolTipButton"));
		Actions act = new Actions (driver);
		act.moveToElement(btn).perform();
		
		String tooltip = driver.findElement(By.cssSelector(".tooltip-inner")).getText();
		
		System.out.println("Tooltip : "+tooltip);
		System.out.println("Program Ends ");

	}

}
