package org.assertionsPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertEx1 {
	@Test
	public void testMethod1  () {
		System.out.println("Test Method 1");
		String str = "Pune";
		Assert.assertEquals(str, "Pune");
		 int a=10;
		 Assert.assertTrue(a==10);
//		 Assert.assertEquals(a , 20 , "Variable does not contain 20");
		  
		 int [] ar = {10 , 20 , 30 ,40 };
		 Assert.assertFalse(ar.length==0);
		 System.out.println("Test Method 1 Ends");
		
	}
	@Test
	public void testMethod2  () {
		System.out.println("Test Method 2");
		
	}

}
