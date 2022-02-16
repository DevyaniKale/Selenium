package com.ebay.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.ebay.elements.Flipkart_ELements;

public class FlipKartPage {
	WebDriver driver;
	Flipkart_ELements flipkart_ELements;
	Actions action;
	
	public FlipKartPage(WebDriver driver) {
		this.driver= driver;
		flipkart_ELements = new Flipkart_ELements(driver);
		
	}
	public void clickOnCross() {
		flipkart_ELements.flipkartCrossBtn.click();
	}
	
	public void hoverOnFashion() {
		 action = new Actions(driver);
		action.moveToElement(flipkart_ELements.fashionImg).perform();
	}
	
	public void hoverOnWomenWesterLink() {
		action = new Actions(driver);
		action.moveToElement(flipkart_ELements.westernLink).perform();
		
	}
	public void clickOnWesterDressesLink() {
		flipkart_ELements.westernDresses.click();
	}
    public void clickOnGown() {
    	flipkart_ELements.westernGown.click();
    }
    public String getDressTitle() {
    	return flipkart_ELements.dressTitle.getText();
    }
    public String getProductPrice() {
    	return flipkart_ELements.dressPrice.getText();
    }
}
