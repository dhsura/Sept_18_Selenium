package org.dropdownHandeling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.utilities.BaseUtility;

public class MultiSelectEx5 {

	public static void main(String[] args) {
		System.out.println("Program Start");
		BaseUtility Bu = new BaseUtility();
		WebDriver driver = Bu.startUp("ch", "https://demoqa.com/select-menu");
		Bu.ScrollBypageDown(driver, 2);
		WebElement ddlEle = driver.findElement(By.id("cars"));

		Select sel = new Select(ddlEle);
		for(int i=1;i<sel.getOptions().size();i++) {
			sel.selectByIndex(i);
		}
		List<WebElement> selectedOptions = sel.getAllSelectedOptions();
		System.out.println("Number Selected of Cars : "+selectedOptions.size());
		for(int i=0;i<selectedOptions.size();i++) {
			System.out.println(selectedOptions.get(i).getText());
		}
		sel.deselectAll();
//		sel.deselectByIndex(1);
//		sel.deselectByValue("Saab");
//		sel.deselectByVisibleText("Saab");
		System.out.println("Program Ends");

	}

}
