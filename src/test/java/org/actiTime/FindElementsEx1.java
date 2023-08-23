package org.actiTime;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BaseUtility;

public class FindElementsEx1 {

	public static void main(String[] args) {
		System.out.println("Program Start");
		BaseUtility Bu = new BaseUtility();
		WebDriver driver = Bu.startUp("ch", "http://localhost:93/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("manager");
		driver.findElement(By.cssSelector("#loginButton>div")).click();
		Bu.WaitForVisibilityByType(driver, 25, "id", "logoutLink");
		List<WebElement> TabLink = driver.findElements(By.cssSelector("a[class*='content']"));
		List<WebElement> TabName = driver.findElements(By.cssSelector("a[class*='content']>div[class='label']"));
		for(int i=1;i<TabLink.size();i++) {
//			WebElement ele =  TabLink.get(i);
//			String value = ele.getAttribute("class");
//			WebElement name = TabName.get(i);
			if(TabLink.get(i).getAttribute("class").contains("selected")) {
//				System.out.println("Tab is Selected "+i);
				System.out.println("TabName is Selected :"+TabName.get(i).getText());
			}else {
//				System.out.println("Tab is Not Selected "+i);
				System.out.println("TabName is Not Selected :"+TabName.get(i).getText());
			}
			
		}
		TabName.get(1).click();
		System.out.println("Selected Tab : "+driver.findElements(By.cssSelector("a[class*='content']>div[class='label']")).get(1).getText());
		System.out.println("Program Ends");

	}

}
