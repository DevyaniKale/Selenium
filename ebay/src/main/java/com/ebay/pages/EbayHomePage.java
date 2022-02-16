package com.ebay.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.ebay.elements.EbayHomeElement;

public class EbayHomePage {
	WebDriver driver;
	EbayHomeElement ebayHomeElements;
	
	public EbayHomePage(WebDriver driver) {
		this.driver = driver;
		ebayHomeElements = new EbayHomeElement(driver);
	}
	public void sendTextInSearchBox(String srchString) {
		ebayHomeElements.searchBox.sendKeys(srchString);
	}
    public void clickOnSearchBtn() {
    	ebayHomeElements.searchBtn.click();
    }
    public List<WebElement> getProductDetails(){
    	return ebayHomeElements.productDetails;
    }
    public WebElement getProductTitle() {
    	return ebayHomeElements.productTitle;
    }
}
