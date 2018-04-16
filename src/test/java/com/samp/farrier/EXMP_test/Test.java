package com.samp.farrier.EXMP_test;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.analyzer.RetryAnalyzer;

public class Test {
	
	SoftAssert softAssert = new SoftAssert();

	@org.testng.annotations.Test
	public void test(){
		
		
		
		System.out.println("url lunched");
		Assert.assertEquals(true, false);
		System.out.println("login page logo");
		System.out.println("login page title");
		softAssert.assertEquals(true, false, "login page title");

		System.out.println("username");
		softAssert.assertEquals(true, false, "user name");

		System.out.println("password");
		System.out.println("login");
		softAssert.assertAll();
	}
	
	@org.testng.annotations.Test
	public void test1(){
		Assert.assertEquals(true, false);

	}
}
