package org.angelone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.utilities.BaseUtility;

public class loginpage {

	public static void main(String[] args) {
		BaseUtility  obj =  new BaseUtility ();
		WebDriver driver = obj.startUp("ch", "https://www.angelone.in/");
		driver.findElement(By.cssSelector("a[data-gtm-dl-el='Login']")).click();
		driver.findElement(By.xpath("//div[@class='mt-3']")).click();
		driver.findElement(By.id("clientId")).sendKeys("S963700");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		

	}

}
