package com.coverfox_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Coverfoxhealthplanpage {
	
	@FindBy(xpath = "//div[text()='Wife']")private WebElement wifeicon;
	@FindBy(xpath = "//div[text()='Mother']")private WebElement mothericon;
	@FindBy(xpath = "//div[@class='next-btn']")private WebElement nextbutton;
	
	
	public Coverfoxhealthplanpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickonwifeicon()
	{
		Reporter.log("Clicking on wife icon", true);
		wifeicon.click();
	}
	
	public void clickonmothericon()
	{
		Reporter.log("Clicking on mother icon", true);
		mothericon.click();
	}
	
	public void clickonnextbutton()
	{
		Reporter.log("Clicking on next button", true);
		nextbutton.click();
	}
	

}
