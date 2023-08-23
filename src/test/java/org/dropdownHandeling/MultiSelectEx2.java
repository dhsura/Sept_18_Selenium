package org.dropdownHandeling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.utilities.BaseUtility;

public class MultiSelectEx2 {

	public static void main(String[] args) {
		System.out.println("Program Start");
		BaseUtility Bu = new BaseUtility();
		WebDriver driver = Bu.startUp("ch", "https://demoqa.com/select-menu");
		Bu.ScrollBypageDown(driver, 2);
		WebElement ddlEle = driver.findElement(By.id("cars"));
//		System.out.println(Bu.getAllTextfromDDL(ddlEle));
		Select sel = new Select(ddlEle);
		sel.selectByVisibleText("Volvo");
		sel.selectByValue("opel");
		sel.selectByIndex(3);
		List<WebElement> selectedOptions = sel.getAllSelectedOptions();
		System.out.println("Number Selected of Cars : "+selectedOptions.size());
		for(int i=0;i<selectedOptions.size();i++) {
			System.out.println(selectedOptions.get(i).getText());
		}
		
		System.out.println("Program Ends");

	}

}
