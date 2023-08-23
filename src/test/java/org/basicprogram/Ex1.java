package org.basicprogram;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Ex1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver objCH = new ChromeDriver ();
		
		
		System.setProperty("webdriver.Edge.driver", "./drivers/msedgedriver.exe");
		EdgeDriver objEdge = new EdgeDriver ();	
		
		System.out.println("Program Ends");

	}

}
