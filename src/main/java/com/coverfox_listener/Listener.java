package com.coverfox_listener;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.coverfox_base.Baseclass;
import com.coverfox_utility.UtilityClass;


public class Listener extends Baseclass implements ITestListener {

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		String testName = result.getName();
		Reporter.log("Congratulation Test "+testName+" is Passed", true);
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		String testName = result.getName();
		Reporter.log("Sorry Test "+testName+" is Failed", true);
		try {
			UtilityClass.Takescreenshot("testcase"+testName+"_failed", driver);
		} catch (IOException e) 
		 {
			// TODO Auto-generated catch block
			//Note:this extra has been added because of thread.sleep taken in screenshot in utility class
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		String testName = result.getName();
		Reporter.log("The Test "+testName+" is Skipped,Please Try again", true);
	}

}
