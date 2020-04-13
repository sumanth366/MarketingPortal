package com.mp.qa.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mp.qa.base.mp_base;
import com.mp.qa.pages.ActionAlerts;
import com.mp.qa.pages.HomePage;
import com.mp.qa.pages.LoginPage;

public class HomePageTest extends mp_base{
	/*
	LoginPage loginpage;
	HomePage homePage;
	ActionAlerts actionalerts; */

	public HomePageTest() {
		super();
	}

	//test cases should be separated -- independent with each other
	//before each test case -- launch the browser and login
	//@test -- execute test case
	//after each test case -- close the browser
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginpage = new LoginPage();
		homePage = new HomePage();
		homePage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	@Test
	public void HamburgerBtnTest(){
		homePage.verifyHamButton();
	}
	
	@Test
	public void SearchTest(){
		homePage.verifySearch("test");
	}
	
	@Test
	public void ProfileIconTest(){
		homePage.verifyProfileIcon();
	} 
	
	@Test
	public void GoToActionALerts() throws InterruptedException{
		//homePage = new HomePage();
		actionalerts = homePage.ClickActionPage();
	}
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	} 
	

}
