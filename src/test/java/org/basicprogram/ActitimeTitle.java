package org.basicprogram;

import org.openqa.selenium.WebDriver;
import org.utilities.BaseUtility;

public class ActitimeTitle {

	public static void main(String[] args) {
		System.out.println("Program Start");
		BaseUtility obj = new BaseUtility ();
		WebDriver driver = obj.startUp("ch","http://localhost:93/login.do");
		
		System.out.println("Actual Title = "+driver.getTitle());
		if(driver.getTitle().equals("actiTIME - Login")) {
			System.out.println("Login Title is as Expected");
		}else {
			System.out.println("Login Title is Not as Expected");
		}
		System.out.println("###########################################");
		
		System.out.println("Actual Url = "+driver.getCurrentUrl() );
		if(driver.getCurrentUrl().equals("http://localhost:93/login.do")) {
			System.out.println("Login URL is as Expected");
		}else { 
			System.out.println("Login URL is Not as Expected");
		}
		
		System.out.println("Program Ends");

	}

}
