package org.testNgEx2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AccountTC1 {
	@BeforeClass 
	public void getAccountsTestData () {
		System.out.println(" Create obj for Account sheet");
	}
	@AfterClass 
	public void claerAccountsTestData () {
		System.out.println(" clear obj for Account sheet");
	}
	@Test 
	public void createAccountTC () {
		System.out.println(" Create  Account ");
	}
	@Test 
	public void updateAccountTC () {
		System.out.println(" update  Account ");
	}
	@Test 
	public void deleteAccountTC () {
		System.out.println(" delete  Account ");
	}

}
