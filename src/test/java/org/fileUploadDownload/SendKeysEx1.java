package org.fileUploadDownload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BaseUtility;

public class SendKeysEx1 {

	public static void main(String[] args) {
		System.out.println("Program Start");
		BaseUtility Bu = new BaseUtility ();
		WebDriver driver = Bu.startUp("ch", "https://demoqa.com/automation-practice-form");
		WebElement Uploadbtn = driver.findElement(By.id("uploadPicture"));
		Bu.ScrollBypageDown(driver, 2);
		Uploadbtn.sendKeys(System.getProperty("user.dir")+"\\FileUploads\\Data.txt");
		System.out.println("Program Ends");

	}

}
