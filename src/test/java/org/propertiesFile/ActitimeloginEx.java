package org.propertiesFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.utilities.BaseUtility;

public class ActitimeloginEx {

	public static void main(String[] args) {
		System.out.println("Program Start");
		Properties prop=null;
		try {
			FileInputStream fis = new FileInputStream 
					("./PropertiesFile/Config.properties");
			prop = new Properties ();
			prop.load(fis);		
	
		} catch (IOException e) {
			e.printStackTrace();
		}	
//		String bName =prop.getProperty("browserName");
//		String url =prop.getProperty("URL");
//		String uName =prop.getProperty("UserName");
//		String pwd =prop.getProperty("Password");

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
