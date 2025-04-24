package com.coverfox_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class Coverfoxmemberdetailspage {
	
	@FindBy(xpath = "//select[@id='Age-You']") private WebElement selectmyage;
	@FindBy(xpath = "//select[@id='Age-Spouse']")private WebElement selectwifeage;
	@FindBy(xpath = "//select[@id='Age-Mother']")private WebElement selectmotherage;
	@FindBy(xpath = "//div[@class='next-btn']")private WebElement clicknextbutton;
	
	public Coverfoxmemberdetailspage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void Selectmyage(String Myage)
	{
		Reporter.log("Handling My Age", true);
		Select s1=new Select(selectmyage);
		s1.selectByValue(Myage+"y");
		
	}
	
	public void Selectwifeage(String Wifeage)
	{
		Reporter.log("Handling Wife's Age", true);
		Select s2=new Select(selectwifeage);
		s2.selectByValue(Wifeage+"y");
	}
	
	public void Selectmotherage(String Motherage)
	{   Reporter.log("Handling Mother's Age", true);
		Select s3=new Select(selectmotherage);
		s3.selectByValue(Motherage+"y");
	}

	public void clickonnextbutton()
	{
		Reporter.log("Clicking on next button", true);
		clicknextbutton.click();
	}
}
