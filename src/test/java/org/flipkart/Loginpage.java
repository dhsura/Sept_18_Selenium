package org.flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.utilities.BaseUtility;

public class Loginpage {

	public static void main(String[] args) {
		System.out.println("Program Start");
		BaseUtility obj = new BaseUtility ();
		WebDriver driver = obj.startUp("ch", "https://www.flipkart.com/");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		driver.findElement(By.cssSelector("._3704LK ")).sendKeys("Samsung galaxy");
		driver.findElement(By.cssSelector(".L0Z3Pu")).click();
		String str = driver.findElement(By.cssSelector("._10Ermr")).getText();
		System.out.println(str);
		String [] ar= str.split(" of ");
		String [] ar1 = str.split(" ");
//		System.out.println(ar1);
		System.out.println(ar);
		
		
	// 	System.out.println("Number Of Result = "+str.substring(18,28));
//		String str1 =driver.findElement(By.xpath("//div[@data-id='MOBGENJWWRYSFC5P']//a[@class='_8VNy32']")).getText();
//		System.out.println(str1.substring(0,7));
//		driver.findElement(By.cssSelector("[data-id='MOBGENJWWRYSFC5P']")).click();
//		driver.findElement(By.cssSelector("button[class='_2KpZ6l _2U9uOA ihZ75k _3AWRsL']")).click();
//		driver.findElement(By.cssSelector("._2KpZ6l._2ObVJD._3AWRsL")).click();
//	
	
		
		System.out.println("Program ENds");

	}

}
