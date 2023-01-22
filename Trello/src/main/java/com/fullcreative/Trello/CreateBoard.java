package com.fullcreative.Trello;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class CreateBoard {

	public static WebDriver driver;
	
	@FindBy(xpath="//*[@type='button']//child::*[text()='Create']")
	private WebElement  cb_create_button;
	
	public static WebDriver getDriver() {
		return driver;
	}



	public WebElement getCb_create_button() {
		return cb_create_button;
	}



	public WebElement getCb_createANewBoard_button() {
		return cb_createANewBoard_button;
	}



	public WebElement getCb_boardTitle() {
		return cb_boardTitle;
	}



	public WebElement getCb_finalCreate_button() {
		return cb_finalCreate_button;
	}



	@FindBy(xpath="//*[text()='Create board']//parent::button")
	private WebElement  cb_createANewBoard_button;
	
	@FindBy(xpath="//*[text()='Board title']//following-sibling::*[@type='text']")
	private WebElement  cb_boardTitle;
	
	
	@FindBy(xpath="//*[text()='Visibility']//following-sibling::*[text()='Create']")
	private WebElement  cb_finalCreate_button;
	
	
	
	public CreateBoard(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	
}
