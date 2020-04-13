package com.mp.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mp.qa.base.mp_base;
import com.mp.qa.util.TestUtil;

public class HomePage extends mp_base{
	
	TestUtil use = new TestUtil();

	@FindBy(id = "hamburger")
	WebElement HamburgerBtn;
	
	@FindBy(xpath = "//li[@class='top-bar-search-btn']//img")
	WebElement SearchBtn;
	
	@FindBy(xpath = "//input[@id='txtSearch']")
	WebElement SearchBar;
	
	@FindBy(id = "profile-tray-btn")
	WebElement ProfileIcon;
	
	@FindBy(xpath = "//ul[@id='hamburgerAccord']//a[contains(text(),'Our Community')]")
	WebElement OurCommunity;
	
	@FindBy(xpath = "//div[@id='hamburger-menu-hldr']//li[3]//span[1]")
	WebElement expand;
	
	@FindBy(xpath = "//a[contains(text(),'Action Alerts')]") //(cssSelector = "a[href = "/action-alerts"]")    //(xpath = "//li[2]//a[1]//img[1]") //  //
	WebElement ActionAlerts;
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void verifyHamButton()
	{
		HamburgerBtn.click();
	}
	
	public void verifySearch(String s)
	{
		SearchBtn.click();
		SearchBar.sendKeys(s);
		SearchBtn.click();
	}
	
	public void verifyProfileIcon()
	{
		ProfileIcon.click();
		
	}
	
	public ActionAlerts ClickActionPage() throws InterruptedException
	{
		HamburgerBtn.click();
		/*JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(expand)); //visibilityOfElementLocated(By.xpath("//div[@id='hamburger-menu-hldr']//li[3]//span[1]")));
		
		//js.executeScript("arguments[0].scrollIntoView();", expand);
		//OurCommunity.click();
		//use.mouseClick(driver, expand);
		//js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		 *
		 */
		Thread.sleep(3000);
		expand.click();
		ActionAlerts.click();
		//use.mouseClick(driver, ActionAlerts);
		//
		return new ActionAlerts();
	}
}
