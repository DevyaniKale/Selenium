package com.ebay.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectingProductElements {
	WebDriver driver;

	////img[@class='s-item__image-img'][@alt='Smartphone 4GB+64GB Android 10 Dual SIM 10-Core 5.8" 4G Mobile Cell Phone US GSM]
	@FindBy(xpath="//*[@id='srp-river-results']/ul/li[1]/div/div[1]/div/a/div/img") public WebElement phone1;
	
	@FindBy(xpath="//select[@name='Color']/option[4]") public WebElement whiteColor;
	@FindBy(xpath="//*[@id='binBtn_btn']") public WebElement buyItNowBtn;
	
	@FindBy(id="sbin-gxo-btn") public WebElement checkOutAsGuestBtn;
	@FindBy(xpath="//tr[@data-test-id='TOTAL']/td[2]") public WebElement orderTotal;
	
	//US $137.84
     public SelectingProductElements(WebDriver driver) {
    	 this.driver=driver;
    	 PageFactory.initElements(driver,this);
     }
	
	
	
}
