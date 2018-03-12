package com.samp.farrier.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.samp.farrier.base.TestBase;
import com.samp.farrier.pages.HomePage;
import com.samp.farrier.pages.LoginPage;
import com.samp.farrier.pages.StaffPage;

public class StaffPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	StaffPage staffPage;
	
	public StaffPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeMethod
	public void setUp() throws IOException{
		initialization();
		staffPage = new StaffPage();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		staffPage = homePage.clickOnStaffLink();
	}
	
	@Test(priority =1)
	public void verifyStaffModuleTitleTest(){
		String title = staffPage.verifyStaffModuleTitle();
		Assert.assertEquals(title, "District Staff", "Staff page title not matching.");
	}
	
	@Test(priority=2)
	public void verifyStaffModuleMenuTest(){
		Boolean flag = staffPage.verifyStaffModuleMenu();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void verifyStaffModulePrintButtonTest(){
		Boolean flag = staffPage.verifyStaffModulePrintButton();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=4)
	public void verifyStaffModuleExportButtonTest(){
		Boolean flag = staffPage.verifyStaffModuleExportButton();
		Assert.assertTrue(flag);
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
}
