package com.ebay.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FlipKartTest extends EbayBase {
  @Test
  public void flipkartDressDetails() throws Exception  {
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  App().Flow().navigateToUrl("https://www.flipkart.com/");
	 // Alert a = driver.switchTo().alert();
	  //a.dismiss();
	  
	  App().Pages().FlipKartPage().clickOnCross();
	  App().Pages().FlipKartPage().hoverOnFashion();
	  //App().Pages().FlipKartPage().hoverOnWomenWesterLink();
	  WebElement d =driver.findElement(By.xpath("//a[@class='_6WOcW9 _2-k99T']"));
	  Actions action = new Actions(driver);
	  action.moveToElement(d).perform();
	  Thread.sleep(1000);
	  App().Pages().FlipKartPage().clickOnWesterDressesLink();
	  App().Pages().FlipKartPage().clickOnGown();
	  
	  String window = driver.getWindowHandle();
	  System.out.println(driver.getCurrentUrl());
	  driver.switchTo().window(window);
	  String title = App().Pages().FlipKartPage().getDressTitle();
	  System.out.println(title);
	  String price = App().Pages().FlipKartPage().getProductPrice();
	  System.out.println(price);
	 System.out.println("hiii");
	  
  }
}
