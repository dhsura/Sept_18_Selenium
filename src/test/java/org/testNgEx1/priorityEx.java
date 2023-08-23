package org.testNgEx1;

import org.testng.annotations.Test;

public class priorityEx {

	@Test(priority=2 )
	public void createCustomer () {
		System.out.println("small Create Customer ");
	}
	@Test(priority=13 )
	public void deleteCustomer () {
		System.out.println("small Delete Customer ");
	}
	
	@Test(priority=9)
	public void UpdateCustomer () {
		System.out.println("Capital update Customer ");
	}
	@Test(priority=-10 )
	public void login () {
		System.out.println("Login ");
	}
	@Test(priority=80 )
	public void logout () {
		System.out.println("Logout ");
	}
	@Test (priority=4)
	public void CreateCustomer () {
		System.out.println("Capital Create Customer ");
	}
	@Test(priority=19 )
	public void DeleteCustomer () {
		System.out.println("Capital Delete Customer ");
	}
	@Test(priority=6 )
	public void updateCustomer () {
		System.out.println("small update Customer ");
	}



}
