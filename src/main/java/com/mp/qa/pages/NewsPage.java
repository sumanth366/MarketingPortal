package com.mp.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mp.qa.base.mp_base;

public class NewsPage extends mp_base{
	
	
	@FindBy(xpath = "//li[1]//a[1]//div[3]//span[1]") 
	WebElement ReadMore;
	
	@FindBy(xpath = "//li[2]//a[1]//div[3]//span[1]") 
	WebElement ReadMore1;
	
	@FindBy(xpath = "//li[4]//a[1]//div[3]//span[1]") 
	WebElement ReadMore2;
	
	

	@FindBy(xpath = "//a[contains(text(),'News')]")
	WebElement News;
	
	public NewsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void verifyReadMore() throws InterruptedException
	{
			ReadMore.click();
			driver.navigate().back();
			ReadMore1.click();
			driver.navigate().back();
			ReadMore2.click();
			driver.navigate().back();
	}
	

}
