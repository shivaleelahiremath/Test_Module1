package com.samp.farrier.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.samp.farrier.base.TestBase;

public class LoginPage extends TestBase{
	
	//Page factory
//	@FindBy(id = "username")
	@FindBy(name = "loginEmail")
	//It's new annotation available in PF.
	//It will improve the performance of the script
	//it will create small cache memory it will store the element in cache. Instead of going through browser, it will take the webelement from CM.
	@CacheLookup
	WebElement username;
	
	@FindBy(name = "password")
	WebElement password;

//	@FindBy(id = "loginbutton")
	@FindBy(xpath = "//button[@type='submit']")
	WebElement loginbutton;
	
//  @FindBy(xpath = "//button[contains(text(), 'Forgot Password')]" )	
	@FindBy(id = "forgotPwd")
	WebElement forgotPwd;
	
	@FindBy(id = "logoImage")
	WebElement logoImage;
	
	@FindBy(id = "btnNetConnect")
	WebElement btnNetConnect;
	
	//page factory initilization..
	public LoginPage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	//Actions - which are available of login page
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	public boolean validateTRENDSImage(){
		return logoImage.isDisplayed();
	}
	
	public HomePage login(String un, String pwd) throws IOException{
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginbutton.click();
		
		return new HomePage();
	}
	
	
	

}
