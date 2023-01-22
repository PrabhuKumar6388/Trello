package com.fullcreative.Trello;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
	
	public static WebDriver driver;
	
	@FindBy(xpath="//*[@class='suETmwkWYk2Tcl js-open-header-member-menu KZsiSK-MutDEN7 Ts+YceGnvTbKoG JIXQq8gDYY04N6']")
	private WebElement  Lout_profileselect_button;
	
	@FindBy(xpath="//*[@data-testid='account-menu-logout']")
	private WebElement  Lout_logout_button;
	
	@FindBy(id="logout-submit")
	private WebElement  Lout_logoutAll_button;
	
	public WebElement getLout_logoutAll_button() {
		return Lout_logoutAll_button;
	}

	public Logout(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getLout_profileselect_button() {
		return Lout_profileselect_button;
	}

	public WebElement getLout_logout_button() {
		return Lout_logout_button;
	}
	

}
