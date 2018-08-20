package com.Ceipal_WF_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Ceipal_WF_TestBase.WF_Ceipal_TestBase;

public class WF_Ceipal_MenuPage extends WF_Ceipal_TestBase {

	@FindBy(xpath="//a/span[@class='title'][contains(text(),'ESS')]")
	WebElement wf_ESS;
	@FindBy(xpath="//a/span[@class='title'][contains(text(),'Employees')]")
	WebElement wf_Employees;
	@FindBy(xpath="//a/span[@class='title'][contains(text(),'Timesheet')]")
	WebElement wf_Timesheet;
	@FindBy(xpath="//a/span[@class='title'][contains(text(),'Expenses')]")
	WebElement wf_Expenses;
	@FindBy(xpath="//a/span[@class='title'][contains(text(),'Clients')]")
	WebElement wf_Clients;
	@FindBy(xpath="//a/span[@class='title'][contains(text(),'Vendors')]")
	WebElement wf_Vendors;
	@FindBy(xpath="//a/span[@class='title'][contains(text(),'Invoice')]")
	WebElement wf_Invoice;
	@FindBy(xpath="//a/span[@class='title'][contains(text(),'Asset Management')]")
	WebElement wf_Asset_Management;
	@FindBy(xpath="//*[@class='dropdown-menu']/li/child::a/span[contains(text(),'Work Authorization')]")
	WebElement wf_Work_Authorization;
	@FindBy(xpath="//*[@class='dropdown-menu']/li/child::a/span[contains(text(),'Absence Management')]")
	WebElement wf_Absence_Management;
	@FindBy(xpath="//*[@class='dropdown-menu']/li/child::a/span[contains(text(),'Immigration')]")
	WebElement wf_Immigration;
	@FindBy(xpath="//*[@class='dropdown-menu']/li/child::a/span[contains(text(),'Files')]")
	WebElement wf_Files;
	@FindBy(xpath="//*[@class='dropdown-menu']/li/child::a/span[contains(text(),'Accounts Payable')]")
	WebElement wf_Accounts_Payable;
	@FindBy(xpath="//*[@class='dropdown-menu']/li/child::a/span[contains(text(),'eBoarding')]")
	WebElement wf_eBoarding;
	@FindBy(xpath="//*[@class='dropdown-menu']/li/child::a/span[contains(text(),'Pay Data')]")
	WebElement wf_Pay_Data;
	
	public boolean WF_ESS(){
		return wf_ESS.isDisplayed();
	}

	public boolean WF_EMPLOYEES(){
		return wf_Employees.isDisplayed();
	}
	
	public boolean WF_TIMESHEET(){
		return wf_Clients.isDisplayed();
	}
	
	public boolean WF_EXPENSES(){
		return wf_Expenses.isDisplayed();
	}
	
	public boolean WF_CLIENTS(){
		return wf_Clients.isDisplayed();
	}
	
	public boolean WF_VENDORS(){
		return wf_Vendors.isDisplayed();
	}
	
	public boolean WF_INVOICE(){
		return wf_Invoice.isDisplayed();
	}
	
	public boolean WF_ASSET_MANAGEMENT(){
		return wf_Asset_Management.isDisplayed();
	}
	
	public boolean WF_WORK_AUTORIZATION(){
		return wf_Work_Authorization.isDisplayed();
	}
	
	public boolean WF_ABSENCE_MANAGEMENT(){
		return wf_Absence_Management.isDisplayed();
	}
	
	public boolean WF_IMMIGRATION(){
		return wf_Immigration.isDisplayed();
	}
	
	public boolean WF_FILES(){
		return wf_Files.isDisplayed();
	}
	
	public boolean WF_ACCOUNTS_PAYABLE(){
		return wf_Accounts_Payable.isDisplayed();
	}
	public boolean WF_EBOARDING(){
		return wf_eBoarding.isDisplayed();
	}
	public boolean WF_PAY_DATA(){
		return wf_Pay_Data.isDisplayed();
	}
	
}
