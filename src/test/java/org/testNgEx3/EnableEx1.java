package org.testNgEx3;

import org.testng.annotations.Test;

public class EnableEx1 {
	@Test (enabled=true)
	public void createAccountTC () {
		System.out.println(" Create  Account ");
	}
	@Test 
	public void updateAccountTC () {
		System.out.println(" update  Account ");
	}
	@Test (enabled=false)
	public void deleteAccountTC () {
		System.out.println(" delete  Account ");
	}

}
