package org.frameHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.utilities.BaseUtility;

public class Ex1 {

	public static void main(String[] args) {
		System.out.println("Program Start");
		BaseUtility Bu = new BaseUtility ();
		WebDriver driver = Bu.startUp("ch", "https://demoqa.com/frames");
		driver.switchTo().frame("frame1");
		String Text = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println("Text : "+Text);
		System.out.println("Program Ends");
		driver.quit();

	}

}
