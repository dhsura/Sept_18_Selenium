package org.basicprogram;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class MaximizeBrowser3 {

	public static void main(String[] args) {
		System.out.println("Program start");
		
		MaximizeBrowser3 obj = new MaximizeBrowser3 ();
		WebDriver driver = obj.startUp("ch","https://www.youtube.com/");
		System.out.println("Program Ends");

	}
	public WebDriver startUp (String bName , String url) {
		WebDriver driver = null;
		if(bName.equalsIgnoreCase("ch") || (bName.equalsIgnoreCase("chrome"))) {
		ChromeOptions options = new ChromeOptions ();
		options.addArguments("start-maximized");
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);            //Upcasting
		
	} else if (bName.equalsIgnoreCase("Edge")) {
		EdgeOptions options = new EdgeOptions ();
		options.addArguments("start-maximized");
		options.addArguments("--disable-notifications");
		driver = new EdgeDriver (options);             //Upcasting
	}else {
		System.out.println("Invalid Browser Name !!!!!!!");
	}
	//	driver.manage().window().minimize();    // onward selenium 4
	//	driver.manage().win.dow().setSize(new Dimension(400,500));
		driver.get(url);
		return driver;
	
		
	}
}
