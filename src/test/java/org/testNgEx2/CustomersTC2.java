package org.testNgEx2;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CustomersTC2 {
	@BeforeTest
	public void getDevDetails () {
		System.out.println("get Dev Enviroment Details");
	}
	@AfterTest 
	public void claerDevEnviromentDetails () {
		System.out.println(" clear Dev Enviroment Details");
	}
	@Test 
	public void createCustomersTC () {
		System.out.println(" Create  Customers ");
	}
	@Test 
	public void updateCustomersTC () {
		System.out.println(" update  Customers ");
	}
	@Test 
	public void deleteCustomersTC () {
		System.out.println(" delete Customers ");
	}

}
