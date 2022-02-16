package com.ebay.lib;

import org.openqa.selenium.WebDriver;

import com.ebay.pages.EbayHomePage;
import com.ebay.pages.FlipKartPage;
import com.ebay.pages.SelectingProductPage;

public class PageLib {
 WebDriver driver;
 private EbayHomePage ebayHomePage;
 private SelectingProductPage selectingProductPage;
 private FlipKartPage flipKartPage;
 
 
 public PageLib(WebDriver driver) {
	 this.driver=driver;
  ebayHomePage = new EbayHomePage(this.driver);
  selectingProductPage = new SelectingProductPage(this.driver);
  flipKartPage = new FlipKartPage(this.driver);
 }
 public EbayHomePage EbayHomePage() {
	 return ebayHomePage;
 }
 public SelectingProductPage SelectingProductPage() {
	 return selectingProductPage;
 }
 public FlipKartPage FlipKartPage() {
	 return flipKartPage;
 }
}
