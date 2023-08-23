package org.actiTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BaseUtility;

public class GetAtributeEx {

	public static void main(String[] args) {
		System.out.println("Program Start");
		BaseUtility Bu = new BaseUtility();
		WebDriver driver = Bu.startUp("ch", "http://localhost:93/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("manager");
		driver.findElement(By.cssSelector("#loginButton>div")).click();
		Bu.WaitForVisibilityByType(driver, 25, "id", "logoutLink");
		WebElement ttlink = driver.findElement(By.xpath("//a[div[text()='TIME-TRACK']]"));
		System.out.println(ttlink.getAttribute("class"));
		
		
		System.out.println("Program Ends");

	}

}
