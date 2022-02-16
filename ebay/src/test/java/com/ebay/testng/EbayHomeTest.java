package com.ebay.testng;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.*;

import junit.framework.Assert;

public class EbayHomeTest extends EbayBase {
  @Test
  public void SearchProduct() {
	  App().Flow().navigateToUrl("https://www.ebay.com/");
	  App().Pages().EbayHomePage().sendTextInSearchBox("Phones");
	  App().Pages().EbayHomePage().clickOnSearchBtn();
  }


@Test
public void ProductTitle() {
	
	App().Flow().navigateToUrl("https://www.ebay.com/");
	App().Pages().EbayHomePage().sendTextInSearchBox("Phones");
	App().Pages().EbayHomePage().clickOnSearchBtn();
	
	//List<WebElement> productDetails = driver.findElements(By.cssSelector("li.s-item.s-item__pl-on-bottom"));
	List<WebElement> productDetails = App().Pages().EbayHomePage().getProductDetails();
	
	for(WebElement product : productDetails) {
		
		String productT= product.findElement(By.cssSelector("h3.s-item__title")).getText();
		System.out.println(productT);
	}
	
}
@Test
public void SelectingProduct() throws Exception {
	String expOrderTotal = "US $137.84";
	App().Flow().navigateToUrl("https://www.ebay.com/");
   String parentWindow=driver.getWindowHandle();
   
	
	App().Pages().EbayHomePage().sendTextInSearchBox("Phones");
	App().Pages().EbayHomePage().clickOnSearchBtn();
	String windowHandle2 = driver.getWindowHandle();
	driver.switchTo().window(windowHandle2);
	System.out.println(driver.getCurrentUrl());
	App().Pages().SelectingProductPage().clickOnProduct();
	Thread.sleep(5000);	
	String windowHandle3 = driver.getWindowHandle();
	driver.switchTo().window(windowHandle3);
	System.out.println(driver.getCurrentUrl());
		
	driver.findElement(By.xpath("//*[@id='binBtn_btn']")).click();
	 App().Pages().SelectingProductPage().clickOnGuest();
	 String windowHandle4 = driver.getWindowHandle();
	 driver.switchTo().window(windowHandle4);
	 String x=driver.findElement(By.xpath("//tr[@data-test-id='TOTAL']/td[2]")).getText();
		System.out.println(x);
	//Set<String> windowHandles = driver.getWindowHandles();
	/*for(String window:windowHandles) {
			
			 * String currentUrl = driver.getCurrentUrl(); System.out.println(currentUrl);
			 
		if(!window.equals(windowHandle2)) {
			driver.switchTo().window(window);
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id='binBtn_btn']")).click();
			 App().Pages().SelectingProductPage().clickOnGuest();
			
			break;
				
				 * App().Pages().SelectingProductPage().selecColor();
				 * //App().Pages().SelectingProductPage().clickOnBuyItNow();
				 *
				 
			
		}
		driver.switchTo().window(window);
		String x=driver.findElement(By.xpath("//tr[@data-test-id='TOTAL']/td[2]")).getText();
		System.out.println(x);*/
		
			/*
			 * if(driver.getCurrentUrl().contains("https://pay.ebay.com/rgxo")) {
			 * driver.switchTo().window(window); String actOrderTotal
			 * =App().Pages().SelectingProductPage().getOrderTotal();
			 * System.out.println(actOrderTotal); Assert.assertEquals(expOrderTotal,
			 * actOrderTotal); break; }
			 */
	}
	
	
}

