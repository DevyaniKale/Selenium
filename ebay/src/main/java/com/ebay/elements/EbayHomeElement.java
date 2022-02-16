package com.ebay.elements;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EbayHomeElement {
    WebDriver driver;
	@FindBy(id="gh-ac") public WebElement searchBox;
	@FindBy(id="gh-btn") public WebElement searchBtn;
	//td.gh-td option
	@FindBy(css="td.gh-td option") public List<WebElement> categoryOptions;
	
	@FindBy(id="gh-la") WebElement ebayLogo;
	
	//@FindBy(css="li.s-item.s-item__pl-on-bottom")
	@FindBy(css="li.s-item.s-item__pl-on-bottom") public List<WebElement> productDetails;
	
	@FindBy(css="h3.s-item__title") public WebElement productTitle;
	public EbayHomeElement(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
}
