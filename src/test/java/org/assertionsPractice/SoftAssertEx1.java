package org.assertionsPractice;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertEx1 {
	@Test
	public void testMethod1  () {
		SoftAssert sa = new SoftAssert () ;
		
		System.out.println("Test Method 1");
		String str = "Pune";
		sa.assertEquals(str, "Pune");
		 int a=10;
		 sa.assertTrue(a==10);
		 sa.assertEquals(a , 20 , "Variable does not contain 20");
		  
		 int [] ar = {10 , 20 , 30 ,40 };
		 sa.assertFalse(ar.length==4 , "Array length is 4");
		 System.out.println("Test Method 1 Ends");
		 sa.assertAll();
		
	}
	@Test
	public void testMethod2  () {
		System.out.println("Test Method 2");
		
	}

}
