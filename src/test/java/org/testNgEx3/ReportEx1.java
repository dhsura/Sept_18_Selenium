package org.testNgEx3;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReportEx1 {
	@Test 
	public void login () {
//		System.out.println("Login");
		Reporter.log("Login Test Case Sucessfully");
	}
	@Test 
	public void logout () {
//		System.out.println("Logout");
		Reporter.log("Logout Test Case sycessfully");
		
	}

}
