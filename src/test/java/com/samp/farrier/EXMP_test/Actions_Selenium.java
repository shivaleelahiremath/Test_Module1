package com.samp.farrier.EXMP_test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Selenium {

	
	WebDriver driver;
	
	@org.testng.annotations.Test
	public void setup() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "/Users/shivaleelah/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		//
		driver.get("http://trends.tangosoftware.com/");
		driver.findElement(By.name("loginEmail")).sendKeys("shivaleela@TX_RiograndeCityCISD");
		driver.findElement(By.name("password")).sendKeys("Shivu123");

		driver.findElement(By.id("loginbutton")).click();
		
		Alert alrt = driver.switchTo().alert();
		alrt.accept();
		
		//total link count and link text on page.. 
		driver.get("http://facebook.com");
		List<WebElement> linkCount = driver.findElements(By.tagName("a"));
		System.out.println(linkCount.size());
		for(int i =0 ; i<linkCount.size(); i++){
			String linkText = linkCount.get(0).getText();
			System.out.println(linkText.trim());
		}
		
		//Mouse over
		driver.get("http://spicejet.com");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.partialLinkText("ADD-ONS"))).build().perform();
		Thread.sleep(1000);//*[@id="highlight-addons"]
		driver.findElement(By.linkText("SpiceMax")).click();
		Thread.sleep(1000);
		
		//drag and drop..
		driver.get("http://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		WebElement source = driver.findElement( By.id("draggable"));
		WebElement dest = driver.findElement(By.id("droppable"));
		action.clickAndHold(source).moveToElement(dest).release().build().perform();

	}
	

	
			
			
}
