package org.fileUploadDownload;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BaseUtility;

public class ChromeUploadEx1 {

	public static void main(String[] args) {
		System.out.println("Program Start");
		BaseUtility Bu = new BaseUtility ();
		WebDriver driver = Bu.startUp("ch", "https://demoqa.com/automation-practice-form");
		WebElement Uploadbtn = driver.findElement(By.id("uploadPicture"));
		Bu.ScrollBypageDown(driver, 2);
		Bu.clickByActions(driver, Uploadbtn);
		try {
			Runtime.getRuntime().exec(System.getProperty("user.dir")+"\\FileUploads\\ChromeUploadEx");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Exception");
		}
		
		System.out.println("Program Ends");

	}

}
		
