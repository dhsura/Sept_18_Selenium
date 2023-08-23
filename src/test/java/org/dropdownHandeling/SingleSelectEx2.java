package org.dropdownHandeling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.utilities.BaseUtility;

public class SingleSelectEx2 {

	public static void main(String[] args) {
		System.out.println("Program Start");
		BaseUtility Bu = new BaseUtility();
		WebDriver driver = Bu.startUp("ch", "https://demoqa.com/select-menu");
		WebElement ddlEle = driver.findElement(By.id("oldSelectMenu"));
		Select sel = new Select(ddlEle);
		System.out.println(Bu.getSelectedTextfromDDL(ddlEle));
		sel.selectByVisibleText("Aqua");
		sel.selectByValue("5");
		sel.selectByIndex(8);
		System.out.println(Bu.getSelectedTextfromDDL(ddlEle));
		System.out.println("Program Ends");
	
	}

}
