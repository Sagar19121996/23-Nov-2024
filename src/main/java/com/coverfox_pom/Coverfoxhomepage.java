package com.coverfox_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Coverfoxhomepage {
	
	@FindBy(xpath = "//div[text()='Male']")private WebElement Maleicon;
	//@FindBy(xpath = "//button[@title='Get Started']")WebElement getstartedbutton;
	
	public Coverfoxhomepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void clickonmaleicon()
	{
		Reporter.log("Clicking on gender ", true);
		Maleicon.click();
	}

}
