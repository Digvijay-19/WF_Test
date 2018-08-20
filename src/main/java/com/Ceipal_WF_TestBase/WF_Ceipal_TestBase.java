package com.Ceipal_WF_TestBase;


import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.Ceipal_WF_Testutility.ExcelOperations;
import com.relevantcodes.extentreports.ExtentReports;

public class WF_Ceipal_TestBase {

	
	public static WebDriver driver = null;
	public static ExcelOperations Eo = new ExcelOperations();
	public static ExtentReports extent = new ExtentReports();
	public static String currentDir = System.getProperty("user.dir");
	public static String TestDataPath = currentDir + "/src/main/java/com/Ceipal_WF_ExcelData/";
	public static String WF_loginPathFile = "WF_Login.xlsx";
	

	
	 public void Login(Row r){
			
		 try{
		 if(r.getCell(0).getStringCellValue()!=null){
			System.setProperty("webdriver.chrome.driver", "D:/Selenium Drivers/chromedriver.exe");
			driver = new ChromeDriver();
		 }
		 
		 else if(r.getCell(0).getStringCellValue()==null){
			System.setProperty("webdriver.gecko.driver", "D:/Selenium Drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			
		 }
		 }catch(WebDriverException e){
			 e.printStackTrace();
		 }
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.get(r.getCell(1).getStringCellValue());	
		}
	
	
}
