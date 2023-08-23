package org.frameHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BaseUtility;

public class Ex2 {

	public static void main(String[] args) {
		System.out.println("Program Start");
		BaseUtility Bu = new BaseUtility ();
		WebDriver driver = Bu.startUp("ch", "https://demoqa.com/frames");
		WebElement frameEle = driver.findElement(By.id("frame2"));
		driver.switchTo().frame(frameEle);
		
		String Text = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println("Text : "+Text);
		System.out.println("Program Ends");
		driver.quit();
	}

}
