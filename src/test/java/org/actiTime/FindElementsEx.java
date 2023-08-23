package org.actiTime;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BaseUtility;

public class FindElementsEx {

	public static void main(String[] args) {
		System.out.println("Program Start");
		BaseUtility Bu = new BaseUtility();
		WebDriver driver = Bu.startUp("ch", "http://localhost:93/login.do");
		WebElement UserName = driver.findElement(By.id("username"));
		System.out.println("IS Displayed = "+UserName.isDisplayed());
		
		
		
		List<WebElement> alluserName = driver.findElements(By.id("username"));
		System.out.println("Size ="+alluserName.size());
		System.out.println("IS Displayed = "+alluserName.get(0).isDisplayed());
		
		
		List<WebElement> credField = driver.findElements(By.cssSelector("#loginFormContainer td>input"));
		System.out.println("Size ="+credField.size());
		System.out.println("IS Displayed = "+credField.get(0).isDisplayed());
		System.out.println("IS Displayed = "+credField.get(1).isDisplayed());
		
		
		System.out.println("Program Ends");

	}

}
