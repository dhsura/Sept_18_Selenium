package org.testNgEx3;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReportEx2 {
	@Test 
	public void createCustomersTC () {
		System.out.println("small Create  Customers ");
		Reporter.log("small Create  Customers");
		int div=10/0 ;
		System.out.println("Div : "+div);
	}
	@Test 
	public void updateCustomersTC () {
		System.out.println("small update Customers ");
		Reporter.log("small update Customers");
	}
		
	
	@Test 
	public void CreateCustomersTC () {
		System.out.println("Capital Create  Customers ");
		Reporter.log("Capital Create  Customers");
	}
	@Test 
	public void UpdateCustomersTC () {
	System.out.println("Capital Update Customers ");
	Reporter.log("Capital Update Customers");
	String str = "Pune";
	System.out.println("chatAt : "+str.charAt(5));
	
	}
}
