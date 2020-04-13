package com.mp.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.mp.qa.pages.ActionAlerts;
import com.mp.qa.pages.HomePage;
import com.mp.qa.pages.LoginPage;
import com.mp.qa.pages.NewsPage;
import com.mp.qa.util.TestUtil;

public class mp_base {
	
	public static Properties prop;
	public static WebDriver driver;
	public static ChromeOptions options;
	public static LoginPage loginpage;
	public static HomePage homePage;
	public static ActionAlerts actionalerts;
	public static NewsPage newspage;
	
	public mp_base() {
	
	try {
		prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/com/mp" + "/qa/config/mp_config.properties");
		
		prop.load(fis);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	public static void initialization() {
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome"))
		{
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sumanmek\\Desktop\\Testing\\Selenium\\chromedriver.exe");
			/*options = new ChromeOptions();
			options.setHeadless(true);
			//options.addArguments("--headless"); 
			driver = new ChromeDriver(options);*/
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}
}
