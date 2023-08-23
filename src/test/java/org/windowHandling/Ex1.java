package org.windowHandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.utilities.BaseUtility;

public class Ex1 {

	public static void main(String[] args) {
		System.out.println("Program start");
		BaseUtility Bu = new BaseUtility ();
		WebDriver driver = Bu.startUp("ch", "https://demoqa.com/browser-windows");
		String parentid1 = driver.getWindowHandle();
		System.out.println("ParentID1 : "+parentid1);
		driver.findElement(By.id("tabButton")).click();
		String parentid2 = driver.getWindowHandle();
		System.out.println("ParentID2 : "+parentid2);
	    Set<String> allwindids = driver.getWindowHandles();
//	    System.out.println(allwindids);
	    Iterator <String> itr = allwindids.iterator();
	    String id = itr.next();
	    if(id.equals(parentid1)) {
	    	id =itr.next();
	    	System.out.println("Another Switch");
	    }
	    driver.switchTo().window(id);
	    String Text = driver.findElement(By.tagName("h1")).getText();
	    System.out.println("Text : "+Text);
	    
	    
//	    driver.close();
//	    driver.switchTo().window(parentid1);
//	    driver.close();
	    driver.quit();
		
		
		
		System.out.println("Program Ends");
	}

}
