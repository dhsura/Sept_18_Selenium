package org.actiTime;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.utilities.BaseUtility;

import com.google.common.base.Function;

public class isSelected {

	public static void main(String[] args) {
		System.out.println("Program Start");
		BaseUtility Bu = new BaseUtility();
		WebDriver driver = Bu.startUp("ch", "https://demoqa.com/radio-button");
	    driver.findElement(By.cssSelector("label[for='yesRadio']")).click();
	    WebElement yesradioBtn = driver.findElement(By.cssSelector("label[for='yesRadio']"));
	    System.out.println("Is Selected :"+yesradioBtn.isSelected());
	    
	    
		System.out.println("Program Ends");

	}


}
