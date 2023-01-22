package com.fullcreative.Trello;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Login {

	public static WebDriver driver;
		
	@FindBy(id="user")
	private WebElement  L_login_username;
		
	@FindBy(id="login")
	private WebElement L_login_button;
	
	@FindBy(id="login-submit")
	private WebElement L_login_Submitbutton;
	
	@FindBy(id="password")
	private WebElement L_password;
	
	
	@FindBy(id="googleButton")
	private WebElement L_googleButton;
	
	@FindBy(id="msftButton")
	private WebElement L_msftButton;
	
	@FindBy(id="signInWithAppleButton")
	private WebElement L_signInWithAppleButton;
	
	@FindBy(id="slackButton")
	private WebElement L_slackButton;
	
	@FindBy(id="use-sso-button")
	private WebElement L_use_sso_button;

	public Login(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	
	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getL_login_username() {
		return L_login_username;
	}

	public WebElement getL_login_button() {
		return L_login_button;
	}
	public WebElement getL_login_Submitbutton() {
		return L_login_Submitbutton;
	}
	
	public WebElement getL_password() {
		return L_password;
	}
	public WebElement getL_googleButton() {
		return L_googleButton;
	}

	public WebElement getL_msftButton() {
		return L_msftButton;
	}

	public WebElement getL_signInWithAppleButton() {
		return L_signInWithAppleButton;
	}

	public WebElement getL_slackButton() {
		return L_slackButton;
	}

	public WebElement getL_use_sso_button() {
		return L_use_sso_button;
	}

	
}
