package org.actiTime;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.utilities.BaseUtility;

import com.google.common.base.Function;

public class GetText {

	public static void main(String[] args) {
		System.out.println("Program Start");
		BaseUtility Bu = new BaseUtility();
		WebDriver driver = Bu.startUp("ch", "http://localhost:93/login.do");
		WebElement ele = driver.findElement(By.id("headerContainer"));
		System.out.println(ele.getText());
		
	
		System.out.println("Program Ends");

	}


}
