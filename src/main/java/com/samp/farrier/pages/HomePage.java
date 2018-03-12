package com.samp.farrier.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.samp.farrier.base.TestBase;

public class HomePage extends TestBase{

	@FindBy(xpath = "//logininfo/text()")
	WebElement username;
	
	@FindBy(xpath = "//tab[contains(text(), 'Campus')]")
	WebElement campusLink;
	
	@FindBy(xpath = "//tab[contains(text(), 'Staff')]")
	WebElement staffLink;
	
	@FindBy(xpath = "//span[contains(text(), 'STAAR')]")
	WebElement STAARLink;
	
	@FindBy(xpath = "//span[contains(text(), 'KENTRO')]")
	WebElement KentroLink;
	
	public HomePage() throws IOException{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle(){
		return driver.getTitle();
	}
	
	public boolean verifyLoggedUserName(){
		return username.isDisplayed();
	}
	
	public CampusPages clickOnCampusLink(){
		campusLink.click();
		return new CampusPages();
	}
	
	public StaffPage clickOnStaffLink() throws IOException{
		staffLink.click();
		return new StaffPage();
	}
	
	public STAARPage clickOnSTAARLink(){
		STAARLink.click();
		return new STAARPage();
	}
	
	public KentroPage clickOnKentroLink(){
		KentroLink.click();
		return new KentroPage();
	}

}
