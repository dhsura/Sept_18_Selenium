package org.actionsEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.utilities.BaseUtility;

public class DragAndDropEx2 {

	public static void main(String[] args) {
		System.out.println("Program Start");
		BaseUtility Bu = new BaseUtility ();
		WebDriver driver = Bu.startUp("ch", "https://demoqa.com/droppable");
		WebElement src = driver.findElement(By.id("draggable"));		
		WebElement des = driver.findElement(By.id("droppable"));
		Actions act = new Actions (driver);
//		act.dragAndDrop(src, des).perform();
		act.dragAndDropBy(src, 280, 60).perform();
		System.out.println("Program Ends ");

	}

}
