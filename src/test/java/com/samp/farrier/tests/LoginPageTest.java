package com.samp.farrier.tests;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.samp.farrier.base.TestBase;
import com.samp.farrier.pages.HomePage;
import com.samp.farrier.pages.LoginPage;
import com.samp.farrier.util.TestUtil;

/*
 * Login page for trends application..
 */
public class LoginPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	String sName = "loginValue";
	
	public LoginPageTest() throws IOException {
		super(); // Super is use to call the super calls constuctor
		// TODO Auto-generated constructor stub
	}

	@BeforeMethod
	public void setUp() throws IOException{
		initialization();
		loginPage = new LoginPage();
	}
	
	@Test(priority=2)
	public void validateLoginPageTitleTest(){
		String title = loginPage.validateLoginPageTitle();
		System.out.println("--->"+title);
		Assert.assertEquals(title, "trends.tangosoftware.com");
	}
	
	@Test(priority=3)
	public void validateLogImageTest(){
		Boolean flag = loginPage.validateTRENDSImage();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=1)
	public void loginTest() throws IOException{
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
//	@DataProvider
//	public Object[][] getTrendsData(){
//		Object[][] data = testUtil.getTestdata(sName);
//		return data;
//	}
	
	 public static String TESTDATA_SHEET_PATH = "/Users/shivaleelah/Documents/workspace/Luna"
				+"/module1/src/main/java/com/samp/farrier/testdata/LoginTestData.xls";
static Workbook wBook;
static Sheet sheet;
@DataProvider
	public Object[][] getTestdata(){
		 FileInputStream file = null;
		 
		    try {
			    file = new FileInputStream(TESTDATA_SHEET_PATH);
		    } catch (FileNotFoundException e) {
		    	// TODO Auto-generated catch block
		    	e.printStackTrace();
		    }
		 	try {
				wBook = Workbook.getWorkbook(file);
			} catch (BiffException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 	sheet = wBook.getSheet("loginValue");
		 	Object[][] value = new Object[sheet.getRows()][sheet.getColumns()];
		 	int row = sheet.getRows();
		 	int col = sheet.getColumns();
		 	System.out.println("row and colms: "+row+ " " +col);
		 	for(int i=0; i<=row-1; i++){
		 		for(int j=0; j<=sheet.getColumns(); j++) {
					value[i][j] = sheet.getCell(j,i+1).getContents();
		 		 		System.out.println("----"+value[i][j]);
		 		}	
				System.out.println("-------------------");
		 	}
		 	return value;
	 }
	
	@Test(priority= 4, dataProvider = "getTestdata")
	public void login(String un, String pwd) throws IOException{
		homePage = loginPage.login(un, pwd);
	}	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
