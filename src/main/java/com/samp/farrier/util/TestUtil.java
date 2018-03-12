package com.samp.farrier.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class TestUtil{
 public static long PAGE_LOAD_TIMEOUT = 40;
 public static long IMLICIT_WAIT = 30;
 
 public static String TESTDATA_SHEET_PATH = "/Users/shivaleelah/Documents/workspace/Luna"
		 									+"/module1/src/main/java/com/samp/farrier/testdata/LoginTestData.xls";
 static Workbook wBook;
 static Sheet sheet;
 
public Object[][] getTestdata(String sheetName){
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
	 	sheet = wBook.getSheet(sheetName);
	 	Object[][] data = null;
	 	
	 	for(int i =0; i<=sheet.getRows(); i++){
	 		for(int j=0; j<=sheet.getColumns();j++){
	 				data[i][j] = sheet.getCell(j, i).getContents();
	 		 		System.out.println(data[i][j]);

	 		}	
			System.out.println("-------------------");

	 	}
	 	return data;
 }

	public static void takeScreenShot(WebDriver driver){
		System.out.println("entered into takescreenshot method.");
        File scrFile = ((TakesScreenshot)(driver)).getScreenshotAs(OutputType.FILE);
		System.out.println("1");
		try {
			System.out.println("2");
			FileUtils.copyFile(scrFile, new File("/Users/shivaleelah/Documents/workspace/Luna/module1/screenshots/" + System.currentTimeMillis() + ".png"));
			System.out.println(3);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end of take kescreenshot method.");

	}
 
}
