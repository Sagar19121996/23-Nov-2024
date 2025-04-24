package com.coverfox_base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import com.coverfox_utility.UtilityClass;

public class Baseclass {
	protected static WebDriver driver;
	
	public void LaunchingWebBrowser() throws IOException
	{
		
		
		driver=new ChromeDriver();
		driver.get(UtilityClass.readdatafrompropertiesfile("Url"));
		//driver.get("https://www.coverfox.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(6000));
		Reporter.log("Launching browser",true);
		
		
		
		
	}
	
	public void ClosingWebBrowser()
	{
		
		driver.quit();
		Reporter.log("Closing browser",true);
		
	}

}
