package org.dropdownHandeling;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.utilities.BaseUtility;

public class MultiSelectEx4 {

	public static void main(String[] args) {
		System.out.println("Program Start");
		BaseUtility Bu = new BaseUtility();
		WebDriver driver = Bu.startUp("ch", "https://demoqa.com/select-menu");
		WebElement ddlEle = driver.findElement(By.id("oldSelectMenu"));
		Select sel = new Select(ddlEle);
//		WebElement defaultoption = sel.getFirstSelectedOption();
		String defaultcolor = sel.getFirstSelectedOption().getText();
		if(defaultcolor.equals("Red")) {
			System.out.println("default color is  Red");
		}else {
			System.out.println("default color is Not Red");
		}
		List<WebElement> alloption = sel.getOptions();
		System.out.println("total color : "+alloption.size());
		for(int i=0;i<alloption.size();i++) {
	//		WebElement ele = alloption.get(i);
			String color =alloption.get(i).getText();
			System.out.println(color);
		}
		
		
		
		System.out.println("Program Ends");

	}

}
