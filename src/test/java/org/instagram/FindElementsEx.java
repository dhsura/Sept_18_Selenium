package org.instagram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BaseUtility;

public class FindElementsEx {

	public static void main(String[] args) {
		System.out.println("Program Start");
		BaseUtility Bu = new BaseUtility ();
		WebDriver driver = Bu.startUp("ch", "https://www.instagram.com/");
		driver.findElement(By.cssSelector("label[class='_aa48']")).sendKeys("mr_dhanvij");
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[2]/div/label/input")).sendKeys("Kiran@123");
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]/button")).click();
		driver.findElement(By.cssSelector("._ac8f")).click();	

		List<WebElement> TabLink = driver.findElements(By.xpath
				("//div[@class='x1iyjqo2 xh8yej3']//div/following-sibling::div"));
		List<WebElement> TabName = driver.findElements(By.cssSelector("svg[aria-label='Home']"));
		
		for(int i=1;i<TabLink.size();i++) {
			WebElement ele = TabLink.get(i);
			String value = ele.getAttribute("class");
			if(value.contains("selected")) {
				System.out.println("Tab is Selected : "+i);
			}else {
				System.out.println("Tab is Not Selected "+i);
			}
		}
		
//		for(int i=0;i<TabLink.size();i++) {    //TabLink.get(i).getAttribute("class")
////			WebElement ele =  TabLink.get(i);
////			String value = ele.getAttribute("a"); //			WebElement name = TabName.get(i);
//			if(TabLink.get(i).getAttribute("class").contains("selected")) {
////				System.out.println("Tab is Selected ");
//				System.out.println("TabName is Selected :"+TabName.get(i).getText());
//			}else {
////				System.out.println("Tab is Not Selected ");
//				System.out.println("TabName is Not Selected :"+TabName.get(i).getText());
//			}
//			
//		}
//		TabLink.get(1).click();
//		System.out.println("Selected Tab : "+driver.findElements(By.cssSelector("svg[aria-label='Home']")).get(1).getText());
				
		System.out.println("Program Ends");

	}

}
