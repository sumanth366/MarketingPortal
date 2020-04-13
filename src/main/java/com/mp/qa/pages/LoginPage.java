package com.mp.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mp.qa.base.mp_base;
import com.mp.qa.util.*;

public class LoginPage extends mp_base {
	
	//Page Factory - OR
	@FindBy(name = "loginfmt") //id = i0116 , name = "loginfmt", rel xpath = //input[@id='i0116']
	WebElement username;
	
	@FindBy(name = "Password")
	WebElement password;
	
	@FindBy(id = "idSIButton9")
	WebElement Next;
	

	@FindBy(id = "submitButton")
	WebElement LoginBtn;
	
	
	//initializing the page objects using pagefactory.initElements "this" indicates current class object
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public HomePage login(String un, String pwd){
		username.sendKeys(un);
		Next.click();
		password.sendKeys(pwd);
		LoginBtn.click();
		Next.click();
		    	//JavascriptExecutor js = (JavascriptExecutor)driver;
		    	//js.executeScript("arguments[0].click();", loginBtn);
		    	
		return new HomePage();
	}

}
