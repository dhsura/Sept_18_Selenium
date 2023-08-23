package org.actiTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BaseUtility;

public class ActiTimeLogin {

	public static void main(String[] args) {
		System.out.println("Program Start");
		BaseUtility obj = new BaseUtility();
		WebDriver driver = obj.startUp("ch", "http://localhost:93/login.do");
		
		WebElement userNameTextField = driver.findElement(By.id("username"));
		WebElement passwordTextField = driver.findElement(By.cssSelector(".textField.pwdfield"));
		WebElement LoginButton = driver.findElement(By.cssSelector("#loginButton>div"));
		userNameTextField.sendKeys("admin");
		passwordTextField.sendKeys("manager");
		LoginButton.click();
		
		
		System.out.println("Program Ends");

	}

}
