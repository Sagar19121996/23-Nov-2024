package com.coverfox_pom;



import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Coverfoxresultpage {
	
	@FindBy(xpath = "//div[text()='43 matching Health Insurance Plans']") WebElement planresult;
	@FindBy(xpath = "//div[@class='plan-card-container']") List<WebElement> plancards;
	
	public Coverfoxresultpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void validateplan() throws InterruptedException
	{
		
		String planresulttext = planresult.getText();
		String[] result = planresulttext.split(" ");
		int resultinnumber = Integer.parseInt(result[0]);
		Thread.sleep(8000);
		int cardvalue = plancards.size();
		
		if(resultinnumber==cardvalue)
		{
			
			Reporter.log("TC IS PASSED", true);
		}
		else
		{
			Reporter.log("TC IS FAILED", true);
		}
			
	}
	
	public int PLANRESULT() throws InterruptedException 
	{
		Reporter.log("Getting Planresult", true);
		Thread.sleep(8000);
		String planresulttext = planresult.getText();
		
		String[] result = planresulttext.split(" ");
		int resultinnumber = Integer.parseInt(result[0]);
		return resultinnumber;
	}
	
	public int PLANCARDVALUE()
	{
		Reporter.log("getting plan value", true);
		int cardvalue = plancards.size();
		return cardvalue;
	}
	
	

}
