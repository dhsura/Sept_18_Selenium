package org.angelone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.utilities.BaseUtility;

public class portfolio {

	public static void main(String[] args) {
		BaseUtility obj  = new BaseUtility ();
		WebDriver driver = obj.startUp("ch", "https://www.angelone.in/trade/watchlist/chart");
		driver.findElement(By.xpath("//span[@class='icon-portfolio']")).click();

	}

}
