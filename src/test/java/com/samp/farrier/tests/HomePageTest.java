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

public class HomePageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	StaffPage staffpage;
	
	public HomePageTest() throws IOException {
		super();
	}
	
	//test cases should be separated - independent with each other
	@BeforeMethod
	public void setUp() throws IOException{
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));	
	}
	
	@Test(priority =1)
	public void verifyHomePageTitleTest(){
		String homePageTitle = homePage.verifyHomePageTitle();
		System.out.println(homePageTitle);
		Assert.assertEquals(homePageTitle, "Assessments", "Home page title not matching");
	}

	@Test(priority =3)
	public void verifyLoggedUserNameTest(){
		Boolean flag = homePage.verifyLoggedUserName();
		Assert.assertTrue(flag);
	}
	
	@Test(priority =2)
	public void clickOnStaffLinkTest() throws IOException{
		staffpage= homePage.clickOnStaffLink();
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
