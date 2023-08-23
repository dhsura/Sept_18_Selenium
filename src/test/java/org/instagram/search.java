package org.instagram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BaseUtility;
 class search {

	public static void main(String[] args) {
		System.out.println("Program Start");
		BaseUtility obj = new BaseUtility ();
		WebDriver driver = obj.startUp("ch", "https://www.instagram.com/");
		driver.findElement(By.cssSelector("label[class='_aa48']")).sendKeys("mr_dhanvij");
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[2]/div/label/input")).sendKeys("Kiran@123");
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]/button")).click();
		driver.findElement(By.cssSelector("._ac8f")).click();	
//		Login obj1 = new Login ();
//		obj1.main(args);
//		WebDriver driver = 
		
		driver.findElement(By.xpath("//div[@class='x1iyjqo2 xh8yej3']/div[2]")).click();
		
		driver.findElement(By.cssSelector("input[aria-label='Search input']")).sendKeys("kiran moon");
	
		driver.findElement(By.xpath("//div[@role='none']/a[@href='/kiranmoon_24/']")).click();
		
		
		
		
		System.out.println("Program Ends");

	}

}
