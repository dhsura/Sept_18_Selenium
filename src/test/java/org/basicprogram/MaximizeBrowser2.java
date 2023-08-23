package org.basicprogram;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class MaximizeBrowser2 {

	public static void main(String[] args) {
		System.out.println("Program start");
		
		MaximizeBrowser2 obj = new MaximizeBrowser2 ();
		obj.startUp("ch");
		System.out.println("Program Ends");

	}
	public void startUp (String bName) {
		WebDriver driver = null;
		if(bName.equalsIgnoreCase("ch") || (bName.equalsIgnoreCase("chrome"))) {
		ChromeOptions options = new ChromeOptions ();
		options.addArguments("start-maximized");
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);            //Upcasting
		
	} else if (bName.equalsIgnoreCase("Edge")) {
	//	driver = new EdgeDriver ();             //Upcasting
	}else {
		System.out.println("Invalid Browser Name !!!!!!!");
	}
	//	driver.manage().window().maximize();
		
	}
}
