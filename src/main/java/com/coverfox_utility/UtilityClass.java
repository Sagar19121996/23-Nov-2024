package com.coverfox_utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class UtilityClass {


	public static void Takescreenshot(String ScreenshotName,WebDriver driver) throws IOException, InterruptedException
	{
		Thread.sleep(3000);
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\SAGAR JADHAV\\eclipse-workspace\\seleniumStudy\\src\\screenshotsofcoverfox\\"+ScreenshotName+".png");
		FileHandler.copy(src, destination);
		Reporter.log("Screenshot is saved in "+destination, true);
		
		
		
	}
	
	public static String readdatafromexcel(String Sheetname,int row,int column) throws EncryptedDocumentException, IOException
	{
		FileInputStream myfile=new FileInputStream("D:\\Api Testing\\coverfoxdata.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet(Sheetname);
		String data = mysheet.getRow(row).getCell(column).getStringCellValue();
		return data;
		
	}
	
	
	public static void scrollintoview(WebElement element,WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].ScrollIntoView(true)",element);
		Reporter.log("Scrolling into view", true);
		
		
		
		
	}
	
	public static String readdatafrompropertiesfile(String key) throws IOException
	{
		
		Properties prop=new Properties();
		//C:\Users\SAGAR JADHAV\eclipse-workspace\dec96\src\main\resources\TestData
		FileInputStream MYFILE=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\TestData\\coverfoxresource.properties");
		prop.load(MYFILE);
		String keyvalue = prop.getProperty(key);
		Reporter.log("reading"+key+"from properties file",true);
		return keyvalue;
		
	}
	
}
