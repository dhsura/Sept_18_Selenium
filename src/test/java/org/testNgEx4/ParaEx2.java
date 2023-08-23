package org.testNgEx4;

import org.testng.annotations.Test;
import org.utilities.BaseUtility;

public class ParaEx2 {
	@Test
	
	public void demoqaEx () {
		System.out.println("DEMO QA Start");
		BaseUtility Bu = new BaseUtility ();
		Bu.startUp("ch", "https://demoqa.com/");
		System.out.println("DEMO QA ENds");
		
		
		}


@Test
public void flipkartEx () {
	System.out.println("Flipkart Start");
	BaseUtility Bu = new BaseUtility ();
	Bu.startUp("ch", "https://www.flipkart.com/");
	System.out.println("Flipkart ENds");
	
	}
}
