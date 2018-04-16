package com.samp.farrier.EXMP_test;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "/Users/shivaleelah/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("http://popuptest.com/goodpopups.html");
		System.out.println("Parent window title : "+driver.getTitle());

		driver.findElement(By.linkText("Good PopUp #2")).click();
		driver.findElement(By.linkText("Good PopUp #3")).click();
		driver.findElement(By.linkText("Good PopUp #4")).click();
	
		Thread.sleep(2000);
		
		Set<String> handle = driver.getWindowHandles();
		
		Iterator<String> it= handle.iterator();
		
		String parentWindow = it.next();
//		System.out.println("parent window : "+parentWindow);
//		
		String childWindow = it.next();
//		System.out.println("Child Window : "+childWindow);
//		
//		driver.switchTo().window(childWindow);
//		Thread.sleep(2000);
//		System.out.println(" child window title: "+driver.getTitle());
//		driver.close();
//		
//		driver.switchTo().window(parentWindow);
//		System.out.println("Parent window title : "+driver.getTitle());
//			
		
		//Closing multiple window
		for(String CurrentWindow : handle){
			if(!CurrentWindow.equals(parentWindow)){
				driver.switchTo().window(CurrentWindow);
				System.out.println(" child window title: "+driver.getTitle());
				driver.close();
			}
		}
		driver.switchTo().window(parentWindow);
		System.out.println("Parent window title : "+driver.getTitle());
	}

}
