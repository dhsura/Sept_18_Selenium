package org.basicprogram;


import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Ex2 {

	public static void main(String[] args) {
		System.out.println("Program start");
		String browserName = "ch";
		Ex2 obj = new Ex2 ();
		obj.startUp(browserName);
		System.out.println("Program Ends");

	}
	public void startUp (String bName) {
		if(bName.equalsIgnoreCase("ch") || (bName.equalsIgnoreCase("chrome")));
		WebDriverManager.chromedriver().setup();
		ChromeDriver objCH = new ChromeDriver ();
		objCH.manage().window().maximize();
	} 
}
