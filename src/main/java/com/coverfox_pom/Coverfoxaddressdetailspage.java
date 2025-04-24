package com.coverfox_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Coverfoxaddressdetailspage {
	
	@FindBy(xpath = "(//input[@placeholder='6 Digit Pincode'])[1]") WebElement mypincode;
	@FindBy(xpath = "(//input[@placeholder='6 Digit Pincode'])[2]") WebElement motherpincode;
	@FindBy(xpath = "//input[@placeholder='Your mobile number']") WebElement mobilenumber;
	@FindBy(xpath = "//div[@class='next-btn']") WebElement continuebutton;
	@FindBy(xpath ="(//div[text()=' Please enter a valid pincode '])[1]") WebElement mypincodeerror;
	@FindBy(xpath = "(//div[text()=' Please enter a valid pincode '])[2]") WebElement Parentspincodeerror;
	@FindBy(xpath = "//div[text()=' Please enter a valid mobile no. ']") WebElement Mobilenoerror;

	
	public Coverfoxaddressdetailspage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void entermypincode(String Mypincode)
	{
		Reporter.log("Entering my Pincode", true);
		mypincode.sendKeys(Mypincode);
	}
	
	public void entermotherpincode(String Motherpincode)
	{
		Reporter.log("Entering mother's Pincode", true);
		motherpincode.sendKeys(Motherpincode);
	}
	
	public void entermobilenumber(String Mobileno)
	{
		Reporter.log("Entering mobile no", true);
		mobilenumber.sendKeys(Mobileno);
	}
	
	public void clickoncontinuebutton()
	{
		Reporter.log("Clicking on continue button", true);
		continuebutton.click();
	}
	public Object gettingmypincodeerrortext()
	{
		Reporter.log("Getting my pincode error text", true);
		String myerror = mypincodeerror.getText();
		return myerror;
	}
	public Object gettingotherpincodeerrortext()
	{
		Reporter.log("Getting parent pincode error text", false);
		String Parenterror = Parentspincodeerror.getText();
		return Parenterror;
	}
	
	public Object gettingmobilenoerror()
	{
		Reporter.log("Getting mobile no error text", true);
		String mobileerror = Mobilenoerror.getText();
		return mobileerror;
	}
}
