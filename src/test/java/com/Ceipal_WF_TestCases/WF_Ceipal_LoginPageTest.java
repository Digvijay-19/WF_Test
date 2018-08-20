package com.Ceipal_WF_TestCases;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Ceipal_WF_Pages.WF_Ceipal_LoginPage;
import com.Ceipal_WF_TestBase.WF_Ceipal_TestBase;
import com.relevantcodes.extentreports.ExtentReports;

public class WF_Ceipal_LoginPageTest extends WF_Ceipal_TestBase {

	
	WF_Ceipal_LoginPage lp;
	
	public WF_Ceipal_LoginPageTest(){
		super();
	}
	
	@BeforeClass
	public void reports(){
		 extent = ExtentReports.get(WF_Ceipal_LoginPageTest.class);
		 extent.init("./AutomationReport.html", true);
		 extent.config().documentTitle("FreeCRMAutomationReport");
		 extent.config().reportHeadline("FreeCRMReport");
		 extent.config().reportTitle("AutomationTestCasesReport");
		 extent.config().displayCallerClass(false);
		 extent.config().useExtentFooter(false);
	}
	
	
	@BeforeMethod
	public void login() throws IOException, InterruptedException{
		    int rowCount = Eo.getRowCount(TestDataPath, WF_loginPathFile, 0);
		    System.out.println(rowCount);
		    for(int i=1;i<=rowCount;i++){
			Row r =Eo.getRow(TestDataPath, WF_loginPathFile, 0, 1);
			Login(r);
			lp = new WF_Ceipal_LoginPage();
			lp.loginDetails(r);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			lp.validateCompanyName();
		 }
	}

	@Test
	public void ValidateTitle() throws Exception {
		String title = driver.getTitle();
		Assert.assertEquals(title, title);
		}

	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
