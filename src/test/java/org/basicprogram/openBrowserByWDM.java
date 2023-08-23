package org.basicprogram;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class openBrowserByWDM {

	public static void main(String[] args) {
		System.out.println("Program Start");
		openBrowserByWDM.ChromeBrowserOpen();
		openBrowserByWDM.OpenEdgeBrowser ();
		System.out.println("Program Ends");

	}
	public static void ChromeBrowserOpen () {
		WebDriverManager.chromedriver().setup();
		ChromeDriver objCH = new ChromeDriver ();
	}
	public static void OpenEdgeBrowser () {
		WebDriverManager.edgedriver().setup();
		EdgeDriver objEdge = new EdgeDriver ();
	}

}
