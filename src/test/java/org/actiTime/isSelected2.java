package org.actiTime;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.utilities.BaseUtility;

import com.google.common.base.Function;

public class isSelected2 {

	public static void main(String[] args) {
		System.out.println("Program Start");
		BaseUtility Bu = new BaseUtility();
		WebDriver driver = Bu.startUp("ch", "https://demoqa.com/radio-button");
		
	   WebElement yesRdo = driver.findElement(By.cssSelector("label[for='yesRadio']"));
	   yesRdo.click();
	    WebElement yesradioBtn = driver.findElement(By.cssSelector("label[for='yesRadio']"));
	    System.out.println("Is Selected :"+yesradioBtn.isSelected());
	    
	   WebElement noRdo = driver.findElement(By.id("noRadio"));
	   System.out.println("Is Enable :"+noRdo.isEnabled());
	   
	   WebElement yeslabel = driver.findElement(By.cssSelector("label[for='yesRadio']"));
	   System.out.println("Is Displayed "+yeslabel.isDisplayed());
	   yeslabel.click();
	   
	    
	    
		System.out.println("Program Ends");

	}


}
