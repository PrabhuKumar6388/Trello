package com.Trello.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Trello.helper.PageObjectManager;
import com.Trello.runner.Test_Runner;
import com.Trello.helper.File_Reader_Manager;
import com.base.io.BaseClass;
import com.fullcreative.Trello.Addcard;
import com.fullcreative.Trello.CreateBoard;
import com.fullcreative.Trello.CreateList;
import com.fullcreative.Trello.Login;
import com.fullcreative.Trello.Logout;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;


import cucumber.api.java.en.Given;

public class Step_Definitions extends BaseClass {
	
public static WebDriver driver=Test_Runner.driver;
	
	public static PageObjectManager pom =new PageObjectManager(driver);
	
	
	@Given("^User Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
		
		String url = File_Reader_Manager.getInstance().getInstanceCR().getUrl();
	  
		get(url);
	}
	
	
	@When("^a user login into application$")
	public void userEnterUsername() throws Throwable {
		String username= File_Reader_Manager.getInstance().getInstanceCR().getUsername();
		String password =File_Reader_Manager.getInstance().getInstanceCR().getPassword();
		inputValue(pom.getInstanceLogin().getL_login_username(), username);
		Thread.sleep(2000);
		clickOfElement(pom.getInstanceLogin().getL_login_button());
		Thread.sleep(2000);
		inputValue(pom.getInstanceLogin().getL_password(), password);
		takeSnap("E:\\java\\Trello\\Screenshots\\evidence1.png");
		Thread.sleep(2000);
		clickOfElement(pom.getInstanceLogin().getL_login_Submitbutton());
		Thread.sleep(4000);
	}
	
	@And("^user create a new Board$")
	public void userCreateANewBoard() throws Throwable{
		Thread.sleep(5000);
		clickOfElement(pom.getInstanceCreateBoard().getCb_create_button());
		Thread.sleep(2000);
		clickOfElement(pom.getInstanceCreateBoard().getCb_createANewBoard_button());
		Thread.sleep(2000);
		String boardtitle =File_Reader_Manager.getInstance().getInstanceCR().getBoardTitle();
		inputValue(pom.getInstanceCreateBoard().getCb_boardTitle(), boardtitle);
		Thread.sleep(2000);
		takeSnap("E:\\java\\Trello\\Screenshots\\evidence2.png");
		clickOfElement(pom.getInstanceCreateBoard().getCb_finalCreate_button());
		Thread.sleep(4000);
	}
	@And("^user create a \"([^\"]*)\"$")
	public void userCreateList(String Listname) throws Throwable{
		Thread.sleep(4000);
		inputValue(pom.getInstanceCreateList().getCl_createListTitle(), Listname);
		Thread.sleep(2000);		
		clickOfElement(pom.getInstanceCreateList().getCl_addlist_Button());
	}
	@And("^user add a card in \"([^\"]*)\" parameter as \"([^\"]*)\"$")	
	public void userAddCardInList(String Listname,String value) throws Throwable{
		Thread.sleep(4000);
		 WebElement selectcard= driver.findElement(By.xpath("//*[text()='"+Listname+"']//parent::*//parent::*//child::*[@class='card-composer-container js-card-composer-container']//child::*//*[text()='Add a card']"));
		
		clickOfElement(selectcard);
		Thread.sleep(2000);
		WebElement title= driver.findElement(By.xpath("//*[text()='"+Listname+"']//parent::*//parent::*//child::*[@class='list-card-composer-textarea js-card-title']"));

		inputValue(title, value);
		Thread.sleep(2000);
		WebElement submit= driver.findElement(By.xpath("//*[text()='"+Listname+"']//parent::*//parent::*//child::*[@class='list-cards u-fancy-scrollbar u-clearfix js-list-cards js-sortable ui-sortable']//child::*//div[@class='cc-controls u-clearfix']//child::div//*[@type='submit']"));

		clickOfElement(submit);
		Thread.sleep(2000);
		clickOfElement(pom.getInstanceAddcard().getAd_addcard_cancelButton());
	}
	@And("^user drag and drop the \"([^\"]*)\" card to \"([^\"]*)\" card$")	
	public void userDragAndDropCard(String Listname1,String Listname2) throws Throwable{
		Thread.sleep(4000);
		String value= File_Reader_Manager.getInstance().getInstanceCR().getCardTitles();
		WebElement dragCard=driver.findElement(By.xpath("//h2[text()='"+Listname1+"']//parent::*//parent::*//*[contains(@class,'list-cards u-fancy-scrollbar ')]//child::*//child::*[@class='list-card-details js-card-details']//span[text()='"+value+"']"));

		Thread.sleep(2000);
		WebElement dropCard=driver.findElement(By.xpath("//*[text()='"+Listname2+"']//parent::*//parent::*//child::*[@class='card-composer-container js-card-composer-container']//child::*//*[text()='Add a card']"));
		Thread.sleep(2000);
		actionsDragAndDrop(dragCard, dropCard);
	}
	@Then("^user logout the application$")
	public void userLogoutTheApplication() throws Throwable{
		Thread.sleep(4000);
		clickOfElement(pom.getInstanceLogout().getLout_profileselect_button());
		Thread.sleep(2000);
		clickOfElement(pom.getInstanceLogout().getLout_logout_button());
		Thread.sleep(4000);
		takeSnap("E:\\java\\Trello\\Screenshots\\evidence3.png");
		clickOfElement(pom.getInstanceLogout().getLout_logoutAll_button());
		Thread.sleep(2000);
	}
}