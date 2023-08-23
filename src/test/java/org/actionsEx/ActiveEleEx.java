package org.actionsEx;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.utilities.BaseUtility;

public class ActiveEleEx {

	public static void main(String[] args) {
		System.out.println("Program Start");
		BaseUtility Bu = new BaseUtility ();
		WebDriver driver = Bu.startUp("ch", "http://localhost:93/login.do");
		//Way-1
//		WebElement ele = driver.switchTo().activeElement();
//		ele.sendKeys("admin"); 
		//Way -2
		driver.switchTo().activeElement().sendKeys("admin");
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys("manager");
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		
		System.out.println("Program Ends");

	}

}
