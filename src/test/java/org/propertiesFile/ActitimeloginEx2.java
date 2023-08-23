package org.propertiesFile;


import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.utilities.BaseUtility;

public class ActitimeloginEx2 {

	public static void main(String[] args) {
		System.out.println("Program Start");
		ConfigReader cr = new ConfigReader ();
		Properties prop =cr.init_prop();
	
		BaseUtility Bu = new BaseUtility();
		WebDriver driver = Bu.startUp(prop.getProperty("browserName"), prop.getProperty("URL"));	
		driver.findElement(By.id("username")).sendKeys(prop.getProperty("UserName"));
		driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys(prop.getProperty("Password"));
		driver.findElement(By.cssSelector("#loginButton>div")).click();
		Bu.WaitForVisibilityByType(driver, 25,"cssSelector", ".logout");	
		driver.findElement(By.cssSelector(".logout"));	
		System.out.println("Program Ends");


	}

}
