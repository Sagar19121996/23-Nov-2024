package com.coverfox_test;


import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.coverfox_base.Baseclass;
import com.coverfox_pom.Coverfoxaddressdetailspage;
import com.coverfox_pom.Coverfoxhealthplanpage;
import com.coverfox_pom.Coverfoxhomepage;
import com.coverfox_pom.Coverfoxmemberdetailspage;
import com.coverfox_pom.Coverfoxresultpage;
import com.coverfox_utility.UtilityClass;

public class TestNgPomcoverfoxclassduplicate extends Baseclass {
	
	Coverfoxhomepage chm;
	Coverfoxhealthplanpage chp;
	Coverfoxmemberdetailspage cmd;
	Coverfoxaddressdetailspage cad;
	Coverfoxresultpage crp;
	public static Logger logger;
	
	
	
	@BeforeClass
	public void LaunchBrowser() throws EncryptedDocumentException, IOException
	{
		logger= Logger.getLogger("23rdNov24_CoverFox");
		  PropertyConfigurator.configure("log4j.properties");
		  logger.info("Welcome to Coverfox Testing");
          
		
		
		
		
		
		logger.info("Launching Web Browser");
		LaunchingWebBrowser();
		chm=new Coverfoxhomepage(driver);
		chp=new Coverfoxhealthplanpage(driver);
		cmd=new Coverfoxmemberdetailspage(driver);
		cad=new Coverfoxaddressdetailspage(driver);
		crp=new Coverfoxresultpage(driver);
		
	}
	
	@BeforeMethod
	public void precondition() throws EncryptedDocumentException, IOException
	{
		logger.info("Clicking on Male Icon");
		chm.clickonmaleicon();
		logger.info("Clicking on Wife Icon");
		chp.clickonwifeicon();
		logger.info("Clicking on Mother Icon");
		chp.clickonmothericon();
		logger.info("Clicking on Next Button");
		chp.clickonnextbutton();
		logger.info("Selecting My age");
		cmd.Selectmyage(UtilityClass.readdatafromexcel("Sheet1", 1, 0));
		logger.info("Selecting Wife age");
		cmd.Selectwifeage(UtilityClass.readdatafromexcel("Sheet1", 1, 1));
		logger.info("Selecting Mother's age");
		cmd.Selectmotherage(UtilityClass.readdatafromexcel("Sheet1", 1, 2));
		logger.info("Clicking on Next Button");
		cmd.clickonnextbutton();
		logger.info("Entering My Pincode");
		cad.entermypincode(UtilityClass.readdatafromexcel("Sheet1", 1, 3));
		logger.info("Entering Mother's Pincode");
		cad.entermotherpincode(UtilityClass.readdatafromexcel("Sheet1", 1, 4));
		logger.info("Entering Mobile Number");
		cad.entermobilenumber(UtilityClass.readdatafromexcel("Sheet1", 1, 5));
		logger.info("Click on continue Button");
		cad.clickoncontinuebutton();
		
		
	}
	
	@Test
	public void validateplan() throws InterruptedException 
	{
		
		int plancardresult = crp.PLANRESULT();
		int plancardvalue = crp.PLANCARDVALUE();
		
		logger.info("Validating Result");	
		Assert.assertEquals(plancardresult, plancardvalue);
		Reporter.log("TC IS PASS AS BOTH VALUES ARE SAME", true);
		
	}
	
	
	
	
	

	@AfterClass
	public void closingbrowser()
	{
		logger.info("Closing Browser");
		ClosingWebBrowser();

		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
