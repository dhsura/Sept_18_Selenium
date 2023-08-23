package org.basicprogram;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MaximizeBrowser {

	public static void main(String[] args) {
		System.out.println("Program start");
		String browserName = "ch";
		MaximizeBrowser obj = new MaximizeBrowser ();
		obj.startUp(browserName);
		System.out.println("Program Ends");

	}
	public void startUp (String bName) {
		WebDriver driver = null;
		if(bName.equalsIgnoreCase("ch") || (bName.equalsIgnoreCase("chrome"))) {
		driver = new ChromeDriver();            //Upcasting
		
	} else if (bName.equalsIgnoreCase("Edge")) {
		driver = new EdgeDriver ();             //Upcasting
	}else {
		System.out.println("Invalid Browser Name !!!!!!!");
	}
		driver.manage().window().maximize();
		
	}
}
