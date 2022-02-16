package com.ebay.lib;

import org.openqa.selenium.WebDriver;

public class AppLib {
WebDriver driver;
private PageLib pageLib;
private FlowLib flowLib;

 public AppLib(WebDriver driver) {
	 this.driver=driver;
	 pageLib = new PageLib(this.driver);
	 flowLib = new FlowLib(this.driver);
 }
 public PageLib Pages() {
	 return pageLib;
 }
 public FlowLib Flow() {
	 return flowLib;
 }
}
