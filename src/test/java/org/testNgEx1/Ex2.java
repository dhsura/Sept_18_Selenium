package org.testNgEx1;

import org.testng.annotations.Test;

public class Ex2 {

	@Test(priority=2 )
	public void createCustomer () {
		System.out.println("small Create Customer ");
	}
	@Test(priority=7 )
	public void deleteCustomer () {
		System.out.println("small Delete Customer ");
	}
	
	@Test(priority=4 )
	public void UpdateCustomer () {
		System.out.println("Capital update Customer ");
	}
	@Test(priority=3 )
	public void login () {
		System.out.println("Login ");
	}
	@Test(priority=8 )
	public void logout () {
		System.out.println("Logout ");
	}
	@Test (priority=1 )
	public void CreateCustomer () {
		System.out.println("Capital Create Customer ");
	}
	@Test(priority=6 )
	public void DeleteCustomer () {
		System.out.println("Capital Delete Customer ");
	}
	@Test(priority=5 )
	public void updateCustomer () {
		System.out.println("small update Customer ");
	}



}
