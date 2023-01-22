 package com.Trello.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Trello.helper.File_Reader_Manager;
import com.base.io.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\Trello\\feature",
glue="com.Trello.stepdefinition",
dryRun = false,
monochrome = true,
strict = true,
plugin= {"html:Report/Html_Report",
		"pretty",
		"json:JsonReport/Cucmber.json",
		"com.cucumber.listener.ExtentCucumberFormatter:Report/ExtentReport.html"}
)

public class Test_Runner {
	public static WebDriver driver;
	
	@BeforeClass
	public static void set_Up() throws Exception {
		String broswer = File_Reader_Manager.getInstance().getInstanceCR().getBroswer();

		driver=BaseClass.browserLaunch(broswer);
		
	}
	
	

	@AfterClass
	public static void tear_Down() {

		driver.close();
	}
}
