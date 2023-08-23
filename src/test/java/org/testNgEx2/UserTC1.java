package org.testNgEx2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UserTC1 {
	@BeforeClass 
	public void getUserTestData () {
		System.out.println("Create Obj for User Test data");
	}
	@AfterClass 
	public void clearUserTestData () {
		System.out.println("Create Obj for User Test data");
	}
	@Test
	public void createUserTC () {
		System.out.println(" create  Account ");
	}
	@Test
	public void updateUserTC () {
		System.out.println(" update  Account ");
	}
	@Test
	public void deleteUserTC () {
		
		System.out.println(" delete  Account ");
	}

}
