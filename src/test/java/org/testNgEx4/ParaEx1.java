package org.testNgEx4;

import org.testng.annotations.Test;
import org.utilities.BaseUtility;

public class ParaEx1 {
	@Test
	
	public void googleEx () {
		System.out.println("Google Start");
		BaseUtility Bu = new BaseUtility ();
		Bu.startUp("ch", "https://www.google.co.in/");
		System.out.println("Google ENds");
		
		}


@Test
public void facebookEx () {
	System.out.println("Facebook Start");
	BaseUtility Bu = new BaseUtility ();
	Bu.startUp("ch", "https://www.facebook.com/");
	System.out.println("Facebook ENds");
	
	}
}
