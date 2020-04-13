package com.mp.qa.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mp.qa.base.mp_base; 
import com.mp.qa.pages.ActionAlerts;
import com.mp.qa.pages.HomePage;
import com.mp.qa.pages.LoginPage;
import com.mp.qa.pages.NewsPage;

public class NewsPageTest extends mp_base{

	
	
	@BeforeMethod
	public void SetUp() throws InterruptedException
	{
		initialization();
		loginpage = new LoginPage();
		actionalerts = new ActionAlerts();
		newspage = new NewsPage();
		homePage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		newspage = actionalerts.ClickNewsPage();
	}
	
	@Test
	public void ReadMoreTest() throws InterruptedException
	{
		newspage.verifyReadMore();
	}

	@AfterMethod
	public void tearDown(){
		driver.quit();
	} 
	
	
}
