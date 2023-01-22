package com.fullcreative.Trello;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Addcard {

	public static WebDriver driver;
	
	@FindBy(xpath="")
	private WebElement  ad_addcard;
	
	
	@FindBy(xpath="//*[text()='k']//parent::*//parent::*//child::*[@class='list-card-composer-textarea js-card-title']")
	private WebElement  ad_addcard_cardtitle;
	
	
	@FindBy(xpath="//*[text()='k']//parent::*//parent::*//child::*[@class='list-cards u-fancy-scrollbar u-clearfix js-list-cards js-sortable ui-sortable']//child::*//div[@class='cc-controls u-clearfix']//child::div//*[@type='submit']")
	private WebElement  ad_addcard_SubmitButton;
	
	
	@FindBy(xpath="//*[@class='icon-lg icon-close dark-hover js-cancel']")
	private WebElement  ad_addcard_cancelButton;

	@FindBy(xpath="//h2[text()='k']//parent::*//parent::*//*[contains(@class,'list-cards u-fancy-scrollbar ')]//child::*//child::*[@class='list-card-details js-card-details']//span[text()='hi']")
	private WebElement  ad_addcard_elementValue;
	
	

	public void setAd_addcard_cancelButton(WebElement ad_addcard_cancelButton) {
		this.ad_addcard_cancelButton = ad_addcard_cancelButton;
	}


	public void setAd_addcard_elementValue(WebElement ad_addcard_elementValue) {
		this.ad_addcard_elementValue = ad_addcard_elementValue;
	}


	public WebElement getAd_addcard_elementValue() {
		return ad_addcard_elementValue;
	}


	public void setAd_addcard(WebElement ad_addcard) {
		this.ad_addcard = ad_addcard;
	}


	public WebElement getAd_addcard_cancelButton() {
		return ad_addcard_cancelButton;
	}


	public void setAd_addcard_cardtitle(WebElement ad_addcard_cardtitle) {
		this.ad_addcard_cardtitle = ad_addcard_cardtitle;
	}


	public void setAd_addcard_SubmitButton(WebElement ad_addcard_SubmitButton) {
		this.ad_addcard_SubmitButton = ad_addcard_SubmitButton;
	}


	public static WebDriver getDriver() {
		return driver;
	}


	public WebElement getAd_addcard() {
		return ad_addcard;
	}


	public WebElement getAd_addcard_cardtitle() {
		return ad_addcard_cardtitle;
	}


	public WebElement getAd_addcard_SubmitButton() {
		return ad_addcard_SubmitButton;
	}


	public Addcard(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	
}
