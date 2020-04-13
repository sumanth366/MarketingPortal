package com.mp.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mp.qa.base.mp_base;

public class ActionAlerts extends mp_base{
	
	
	
	@FindBy(xpath = "//li[1]//a[1]//div[3]//span[1]") 
	WebElement downloadPdf;

	@FindBy(xpath = "//li[2]//a[1]//div[3]//span[1]") 
	WebElement downloadPdf1;
	
	@FindBy(xpath = "//li[4]//a[1]//div[3]//span[1]") 
	WebElement downloadPdf2;
	

	@FindBy(xpath = "//a[contains(text(),'News')]")
	WebElement News;
	
	public ActionAlerts()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void verifyDownload() throws InterruptedException
	{
			downloadPdf.click();
			//driver.navigate().back();
			//downloadPdf1.click();
			//driver.navigate().back();
			//downloadPdf2.click();
			//driver.navigate().back();
	}
	
	public NewsPage ClickNewsPage() throws InterruptedException
	{
		homePage = new HomePage();
		homePage.HamburgerBtn.click();
		Thread.sleep(3000);
		homePage.expand.click();
		News.click();
		//ActionAlerts.click();
		return new NewsPage();
	}

}
