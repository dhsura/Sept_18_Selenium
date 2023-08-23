package org.propertiesFile;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.utilities.BaseUtility;

public class ActitimeloginEx3 {

	public static void main(String[] args) {
		System.out.println("Program Start");
		ConfigReader cr = new ConfigReader ();
		BaseUtility Bu = new BaseUtility();
		WebDriver driver = Bu.startUp(cr.getPropData("browserName"), cr.getPropData("URL"));	
		driver.findElement(By.id("username")).sendKeys(cr.getPropData("UserName"));
		driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys(cr.getPropData("Password"));
		driver.findElement(By.cssSelector("#loginButton>div")).click();
		Bu.WaitForVisibilityByType(driver, 25,"cssSelector", ".logout");	
		driver.findElement(By.cssSelector(".logout"));	
		System.out.println("Program Ends");


	}

}
