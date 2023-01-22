package com.fullcreative.Trello;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class CreateList {

	public static WebDriver driver;
	
	@FindBy(xpath="//*[@class='list-name-input']")
	private WebElement  cl_createListTitle;
	
	@FindBy(xpath="//*[@type='submit']")
	private WebElement  cl_addlist_Button;
	
	@FindBy(xpath="//*[@class='placeholder']//child::*")
	private WebElement  cl_anotherList_Button;
	
	
	public static WebDriver getDriver() {
		return driver;
	}



	public WebElement getCl_createListTitle() {
		return cl_createListTitle;
	}



	public WebElement getCl_addlist_Button() {
		return cl_addlist_Button;
	}



	public CreateList(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	
}
