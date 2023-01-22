package com.Trello.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.fullcreative.Trello.Addcard;
import com.fullcreative.Trello.CreateBoard;
import com.fullcreative.Trello.CreateList;
import com.fullcreative.Trello.Login;
import com.fullcreative.Trello.Logout;

public class PageObjectManager {
	public static WebDriver driver;
	
	public static Login lin;
	public static CreateBoard cb;
	public static CreateList cl;
	public static Addcard ac;
	public static Logout lout;
	
	
	
	public PageObjectManager(WebDriver driver2) {
	
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public Login getInstanceLogin() {

		lin=new Login(driver);
		return lin;
	}
	
	public CreateBoard getInstanceCreateBoard() {
		cb=new CreateBoard(driver);
		return cb;
		
	}
	
	public CreateList getInstanceCreateList() {
		
		cl=new CreateList(driver);
		return cl;
	}
	
	public Addcard getInstanceAddcard() {
		ac=new Addcard(driver);
		return ac;
		
	}
	
	public Logout getInstanceLogout() {
		lout=new Logout(driver);
		return lout;
		
	}
	
	

}
