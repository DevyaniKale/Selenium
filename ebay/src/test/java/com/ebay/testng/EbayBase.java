package com.ebay.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ebay.lib.AppLib;

public class EbayBase {
	WebDriver driver;
	private AppLib aap;
  @BeforeMethod
  public void BaseTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Devyani Kale\\Drivers\\chromedriver.exe");
	  driver =  new ChromeDriver();
	  aap = new AppLib(this.driver);
	  
	  
  }
  public AppLib App() {
	  return aap;
  }
	/*
	 * @AfterMethod public void tearDown() { driver.close();
	 * 
	 * 
	 * }
	 */
}
