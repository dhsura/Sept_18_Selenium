package org.fileUploadDownload;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BaseUtility;

public class RobotEx {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.out.println("Program Start");
		BaseUtility Bu = new BaseUtility ();
		WebDriver driver = Bu.startUp("ch", "https://demoqa.com/automation-practice-form");
		WebElement Uploadbtn = driver.findElement(By.id("uploadPicture"));
		Bu.ScrollBypageDown(driver, 2);
		Thread.sleep(2000);
		Bu.clickByActions(driver, Uploadbtn);
		Thread.sleep(2000);
		String path = System.getProperty("user.dir");
		String FileName = path + "\\FileUploads\\Data.txt";
		StringSelection ss = new StringSelection (FileName);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		Robot r = new Robot ();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		System.out.println("Program Ends");


	}

}
