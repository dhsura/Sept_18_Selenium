package org.testNgEx3;

import org.testng.annotations.Test;

public class GroupEx {
	@Test(priority=2 , groups= {"Smoke"} )
	public void createCustomer () {
		System.out.println("small Create Customer ");
	}
	@Test(priority=6 , groups= {"Regression","UAT"} )
	public void deleteCustomer () {
		System.out.println("small Delete Customer ");
	}
	
	@Test(priority=5,groups= {"Smoke","Regression"})
	public void UpdateCustomer () {
		System.out.println("Capital update Customer ");
	}
	@Test(priority=1 , groups= {"Smoke","Regression","UAT"} )
	public void login () {
		System.out.println("Login ");
	}
	@Test(priority=100 )
	public void logout () {
		System.out.println("Logout ");
	}
	@Test (priority=3 , groups= {"Regression"})
	public void CreateCustomer () {
		System.out.println("Capital Create Customer ");
	}
	@Test(priority=7,groups= {"Smoke","UAT"} )
	public void DeleteCustomer () {
		System.out.println("Capital Delete Customer ");
	}
	@Test(priority=4 , groups= {"UAT"} )
	public void updateCustomer () {
		System.out.println("small update Customer ");
	}


}
