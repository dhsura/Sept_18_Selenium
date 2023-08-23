package org.dropdownHandeling;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BaseUtility;

public class SingleSelectEx3 {

	public static void main(String[] args) {
		System.out.println("Program Start");
		BaseUtility Bu = new BaseUtility();
		WebDriver driver = Bu.startUp("ch", "https://demoqa.com/select-menu");
		WebElement ddlEle = driver.findElement(By.id("oldSelectMenu"));
		String defaultcolor = Bu.getSelectedTextfromDDL(ddlEle);
		System.out.println("Default Color :"+defaultcolor);
		System.out.println("Total Count : "+Bu.getCountfromDDL(ddlEle));
		String [] expArr = {"Red","Blue","Green","Yellow",
				            "Purple","Black","White","Voilet",
				            "Indigo","Magenta","Aqua" };
		ArrayList <String> actlist = Bu.getAllTextfromDDL(ddlEle);
		List<String> explist = Arrays.asList(expArr);
		if(actlist.containsAll(explist)) {
			System.out.println("All Expected color are Present");
		}else {
			System.out.println("All Expected color are Not Present");
		}

	}

}
