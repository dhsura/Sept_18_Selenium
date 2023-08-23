package org.utilities;

import java.io.FileInputStream;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseUtility {
	
	public int getSheetIndex (String a ,  String str  ) throws Exception {
		FileInputStream fis = new FileInputStream (str);
		Workbook wb = WorkbookFactory.create(fis);
		int sheetIndex = wb.getSheetIndex(a);
		return sheetIndex;
	}
	
	public String getNameOfSheets (  String str  ) throws Exception {
		FileInputStream fis = new FileInputStream (str);
		Workbook wb = WorkbookFactory.create(fis);
		String sheetName = wb.getSheetName(0);
		return sheetName;
	}
	
	public int getNumberOfSheets ( int a ,String str  ) throws Exception {
		FileInputStream fis = new FileInputStream (str);
		Workbook wb = WorkbookFactory.create(fis);
		int sheetName = wb.getNumberOfSheets();
		return sheetName;
	}
	
	public void scrollByJS (WebElement ele , WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments(0).scrollIntoView(true)", ele);
	}
	
	
	public void scrollByElementByActions (WebDriver driver , WebElement ele) {
		Actions act = new Actions (driver);
		act.scrollToElement(ele).perform();
	}
	public void sendKeysByActions (WebDriver driver , WebElement ele , String text) {
		Actions act = new Actions (driver);
		act.click(ele).perform();
		act.click().perform();
		act.sendKeys(ele ,text).perform();
	}
	
	public void clickByActions (WebDriver driver , WebElement ele) {
		Actions act = new Actions (driver);
		act.click(ele).perform();
	}
	
	
	public boolean isAlertPresent (WebDriver driver , long time) {
		try {
		WebDriverWait wait = new WebDriverWait (driver,Duration.ofSeconds(time));
		wait.until(ExpectedConditions.alertIsPresent());
		return true;
		}catch (TimeoutException e ) {
			return false;
		}
	}
	
	public void waitAndSwitchToFrameByObj (WebDriver driver , long time , By frameBy) {
		WebDriverWait wait = new WebDriverWait (driver,Duration.ofSeconds(time));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameBy));
	}
	public void waitAndSwitchToFrameByWebElement (WebElement frameEle , WebDriver driver , long time) {
		WebDriverWait wait = new WebDriverWait (driver,Duration.ofSeconds(time));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameEle));
	}
	public void waitAndSwitchToFrameByIdName (WebDriver driver , long time , String IdName ) {
		WebDriverWait wait = new WebDriverWait (driver,Duration.ofSeconds(time));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(IdName));
	}
	public void waitAndSwitchToFrameByIndex (WebElement frameEle , long time , WebDriver driver) {
		WebDriverWait wait = new WebDriverWait (driver,Duration.ofSeconds(time));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameEle));
	}
	 
	public int  getSelectedCountFromDDL (WebElement ele) {
		
		Select sel = new Select(ele);
		return sel.getAllSelectedOptions().size();
	}
	
	public ArrayList<String> getAllTextfromDDL (WebElement ddlEle) {
		Select sel = new Select(ddlEle);
		ArrayList<String> ar = new ArrayList<String>();
		List<WebElement> alloptions = sel.getOptions();
		for(int i=0;i<alloptions.size();i++) {
			ar.add(alloptions.get(i).getText());
		}
		return ar;
		
	}
	
	public int getCountfromDDL (WebElement ddlEle) {
		Select sel = new Select(ddlEle);
		return  sel.getOptions().size();
	}
	
	
	public String getSelectedTextfromDDL (WebElement ddlEle) {
		Select sel = new Select(ddlEle);
//		WebElement defaultoption = sel.getFirstSelectedOption(); 
//		String Text = defaultoption.getText();
		return  sel.getFirstSelectedOption().getText();
	}
	
	public void ScrollBypageDown (WebDriver driver , int numOfScroll ) {
		WebElement ele = driver.findElement(By.tagName("body"));
		for(int i=1;i<numOfScroll;i++) {
			ele.sendKeys(Keys.PAGE_DOWN);
		}
	}
	public void ScrollBypageUP (WebDriver driver , int numOfScroll ) {
		WebElement ele = driver.findElement(By.tagName("body"));
		for(int i=1;i<numOfScroll;i++) {
			ele.sendKeys(Keys.PAGE_UP);
		}
	}
 
	public  WebDriver startUp (String bName , String url) {
		WebDriver driver = null;
		if(bName.equalsIgnoreCase("ch") || (bName.equalsIgnoreCase("chrome"))) {
		ChromeOptions options = new ChromeOptions ();
		options.addArguments("start-maximized");
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);            //Upcasting
		
	} else if (bName.equalsIgnoreCase("Edge")) {
		EdgeOptions options = new EdgeOptions ();
		options.addArguments("start-maximized");
		options.addArguments("--disable-notifications");
		driver = new EdgeDriver (options);             //Upcasting
	}else {
		System.out.println("Invalid Browser Name !!!!!!!");
	  }
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.get(url);
		return driver;
	}
	
	public void WaitForVisibilityByType (WebDriver driver,long time,String type ,String expression) {
		WebDriverWait wt = new WebDriverWait(driver,Duration.ofSeconds(time));
		if(type.equalsIgnoreCase("id")) {
		wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.id(expression))));
	}else if(type.equalsIgnoreCase("cssSelector")) {
		wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(expression))));
		
	}else if(type.equalsIgnoreCase("xpath")) {
		wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(expression))));
		
	}else if(type.equalsIgnoreCase("class")) {
		wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.className(expression))));
		
	}else if(type.equalsIgnoreCase("linktext")) {
		wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.linkText(expression))));
		
	}else if(type.equalsIgnoreCase("partiallinktext")) {
		wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.partialLinkText(expression))));
		
	}else if(type.equalsIgnoreCase("tagName")) {
		wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.tagName(expression))));
		
	}else if(type.equalsIgnoreCase("Name")) {
		wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.name(expression))));
		
	}else {
		System.out.println("Invalid Locator type");
	  }
				
	}
	public void WaitForTitleContains (WebDriver driver,long time,String partialtitle) {
		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(time));
		wt.until(ExpectedConditions.titleContains(partialtitle));
	}
	public void WaitForURLContains (WebDriver driver,long time,String partialurl) {
		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(time));
		wt.until(ExpectedConditions.urlContains(partialurl));
	}
	
	public void WaitForVisibilityByFluentByType (WebDriver driver,long Maxtime,long pollingEvery , String type ,String expression) {
		FluentWait<WebDriver> wt = new FluentWait<WebDriver>(driver);
		wt.withTimeout(Duration.ofSeconds(Maxtime))
		.pollingEvery(Duration.ofMillis(pollingEvery))
		.ignoring(Exception.class);
		wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(expression))));
     
		if(type.equalsIgnoreCase("id")) {
		wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.id(expression))));
	}else if(type.equalsIgnoreCase("cssSelector")) {
		wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(expression))));
		
	}else if(type.equalsIgnoreCase("xpath")) {
		wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(expression))));
		
	}else if(type.equalsIgnoreCase("class")) {
		wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.className(expression))));
		
	}else if(type.equalsIgnoreCase("linktext")) {
		wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.linkText(expression))));
		
	}else if(type.equalsIgnoreCase("partiallinktext")) {
		wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.partialLinkText(expression))));
		
	}else if(type.equalsIgnoreCase("tagName")) {
		wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.tagName(expression))));
		
	}else if(type.equalsIgnoreCase("Name")) {
		wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.name(expression))));
		
	}else {
		System.out.println("Invalid Locator type");
	  }
	
	

}
}
