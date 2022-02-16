package com.ebay.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flipkart_ELements {
    WebDriver driver;
  
	@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']") public WebElement flipkartCrossBtn;
	@FindBy(xpath="//div[contains(text(),'Fashion')]") public WebElement fashionImg;
	@FindBy(xpath="//a[@class='_6WOcW9 _2-k99T']") public WebElement westernLink;
	//Women Dresses Women Gown Black Dress .B_NuCI //div[@class='_30jeq3 _16Jk6d']
	@FindBy(linkText="Women Dresses") public WebElement westernDresses;
	@FindBy(partialLinkText="Women Bodycon Black Dress") public WebElement westernGown;
	@FindBy(className="B_NuCI") public WebElement dressTitle;
	@FindBy(xpath="//div[@class='_30jeq3 _16Jk6d']") public WebElement dressPrice;
	
	public Flipkart_ELements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
		
	}
	
	
}
