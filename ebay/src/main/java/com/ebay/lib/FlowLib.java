package com.ebay.lib;

import org.openqa.selenium.WebDriver;

public class FlowLib {
	
	private WebDriver driver;
	 public FlowLib(WebDriver driver) {
		 this.driver = driver;
	 }
	 public void navigateToUrl(String url) {
		 driver.get(url);
	 }

}
//ul.srp-results.srp-list.clearfix li--> phones productlist