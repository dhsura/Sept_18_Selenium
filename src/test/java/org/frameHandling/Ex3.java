package org.frameHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.utilities.BaseUtility;

public class Ex3 {

	public static void main(String[] args) {
		System.out.println("Program Start");
		BaseUtility Bu = new BaseUtility ();
		WebDriver driver = Bu.startUp("ch", "https://demoqa.com/frames");
//		WebElement frameEle = driver.findElement(By.id("frame2"));
//		driver.switchTo().frame(frameEle);
		WebDriverWait wait = new WebDriverWait (driver,Duration.ofSeconds(10));
		//Way-1
		By frameBy = By.id("frame2");
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameBy));
		//Way-2
//		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(int  index));
		//Way-3
//		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(String Id Name));
		//Way-4
		WebElement frameEle = driver.findElement(By.id("frame2"));
//		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameEle));
		Bu.waitAndSwitchToFrameByWebElement(frameEle, driver, 20);
		
		String Text = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println("Text : "+Text);
		driver.switchTo().defaultContent();
		System.out.println("Program Ends");
		driver.quit();
	}

}
