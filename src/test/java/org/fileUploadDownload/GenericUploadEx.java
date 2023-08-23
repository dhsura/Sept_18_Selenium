package org.fileUploadDownload;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BaseUtility;

public class GenericUploadEx {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Program Start");
		BaseUtility Bu = new BaseUtility ();
		WebDriver driver = Bu.startUp("ch", "https://demoqa.com/automation-practice-form");
		WebElement Uploadbtn = driver.findElement(By.id("uploadPicture"));
		Bu.ScrollBypageDown(driver, 2);
		Thread.sleep(2000);
		Bu.clickByActions(driver, Uploadbtn);
		Thread.sleep(2000);
		String path = System.getProperty("user.dir");
		try {
			String FileName = path + "\\FileUploads\\Data.txt";
			Runtime.getRuntime().exec(path+"\\FileUploads\\GenericUploadEx.exe"+" "+FileName);
			System.out.println("Try Pass");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Exception");
		}
		
		System.out.println("Program Ends");

	}

}
		
