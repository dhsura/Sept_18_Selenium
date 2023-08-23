package org.actionsEx;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.utilities.BaseUtility;

public class DragAndDropEx1 {

	public static void main(String[] args) {
		System.out.println("Program Start");
		BaseUtility Bu = new BaseUtility ();
		WebDriver driver = Bu.startUp("ch", "https://demoqa.com/droppable");
		WebElement src = driver.findElement(By.id("draggable"));		
		WebElement des = driver.findElement(By.id("droppable"));
		Actions act = new Actions (driver);
//		act.moveToElement(src).pause(Duration.ofMillis(500)).clickAndHold();
		//OR
//      act.moveToElement(src).clickAndHold();
		//OR
		act.moveToElement(src).clickAndHold(src).moveToElement(des).release().build().perform();
		System.out.println("Program Ends ");

	}

}
