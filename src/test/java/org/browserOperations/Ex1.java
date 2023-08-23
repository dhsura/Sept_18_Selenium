package org.browserOperations;

import org.openqa.selenium.WebDriver;
import org.utilities.BaseUtility;

public class Ex1 {

	public static void main(String[] args) {
		System.out.println("Program start");
		BaseUtility Bu = new BaseUtility ();
		WebDriver driver = Bu.startUp("ch", "http://www.google.com/");
		driver.navigate().to("https://www.facebook.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		System.out.println("Program Ends");
	}

}
