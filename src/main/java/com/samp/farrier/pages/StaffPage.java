package com.samp.farrier.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.samp.farrier.base.TestBase;

public class StaffPage extends TestBase {

	@FindBy(xpath = "//breadcrumbs[contains(text(), 'District Staff')]")
	WebElement moduleMenu;
	
	@FindBy(xpath = "//span[contains(text(), 'Print')]")
	WebElement staffModulePrintButton;
	
	@FindBy(xpath = "//span[contains(text(), 'Export')]")
	WebElement staffModuleExportButton;
	
	public StaffPage() throws IOException {
		PageFactory.initElements(driver, this);
	}

	public String verifyStaffModuleTitle(){
		return driver.getTitle();
	}
	
	public boolean verifyStaffModuleMenu(){
		return moduleMenu.isDisplayed();
	}
	
	public boolean verifyStaffModulePrintButton(){
		return moduleMenu.isDisplayed();
	}

	public boolean verifyStaffModuleExportButton(){
		return moduleMenu.isDisplayed();
	}

}
