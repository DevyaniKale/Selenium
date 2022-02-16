package com.ebay.pages;

import org.openqa.selenium.WebDriver;

import com.ebay.elements.SelectingProductElements;

public class SelectingProductPage {
	WebDriver driver;
	SelectingProductElements selectingProductElements;
	
	public SelectingProductPage(WebDriver driver) {
		this.driver=driver;
		selectingProductElements  = new SelectingProductElements(driver);
		
		
	}
	public void clickOnProduct() {
		selectingProductElements.phone1.click();
	}
	
	public void selecColor() {
		selectingProductElements.whiteColor.click();
	}
	
	public void clickOnBuyItNow() {
		selectingProductElements.buyItNowBtn.click();
	}
	
	public void clickOnGuest() {
		selectingProductElements.checkOutAsGuestBtn.click();
	}
	public String getOrderTotal() {
		return selectingProductElements.orderTotal.getText();
	}
}
