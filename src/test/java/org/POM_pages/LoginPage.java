package org.POM_pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.BaseUtility;

public class LoginPage {
	private WebDriver driver;
	//1. WebElements
	@FindBy(id="username")
	private WebElement userNameField;
	
	@FindBy(css=".textField.pwdfield")
	private WebElement password;
	
	@FindBy(css="[id='loginButton']>div")
	private WebElement loginBtn;
	
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement keeplogincheckbox;
	
	@FindBy(css="#logoContainer img")
	private List<WebElement> loginLogos;
	private WebElement logoutLink;
	

	//2.Constructor
	public  LoginPage (WebDriver driver) {
		this.driver = driver;
	 	PageFactory.initElements(driver , this);
		//OR
	//    PageFactory.initElements( driver , loginpage.class);
	}
	


	//3. Page Action Method
	public boolean isUserNameFieldDisplayed () {
		return userNameField.isDisplayed();
	}
	public boolean isPasswordFieldDisplayed () {
		return password.isDisplayed();
	}
	public boolean isloginButtonDisplayed () {
		return loginBtn.isDisplayed();
	}
	public boolean iskeepLoggedInCheckBoxDisplayed () {
		return keeplogincheckbox.isDisplayed();
	}
	public boolean isloginLogosDisplayed () {
		for (int i=0 ; i<loginLogos.size(); i++) {
			if(!loginLogos.get(i).isDisplayed()) {
				return false;
				}
		}
		return true;
	}

public void enterUserName () {
	userNameField.sendKeys("admin");
}
public void enterPassword  () {
	password.sendKeys("manager");
}
public boolean isloginButtonisDisplayed () {
	return loginBtn.isDisplayed();
}
public void clickonloginBtn () {
	loginBtn.click();
}
public boolean VerifyLogoutLink () {
	BaseUtility Bu = new BaseUtility ();
	Bu.WaitForVisibilityByType(driver, 10 , "id", "logoutLink");
	
	
	return logoutLink.isDisplayed();
 }
}