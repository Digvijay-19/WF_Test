package com.Ceipal_WF_Pages;


import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Ceipal_WF_TestBase.WF_Ceipal_TestBase;


public class WF_Ceipal_LoginPage extends WF_Ceipal_TestBase {

	@FindBy(xpath="//a[contains(text(),'Sign In')]")
     WebElement signInBtn;	
	@FindBy(id="useremail")
	WebElement wf_userName;
	@FindBy(id="checkuser")
	WebElement wf_nextBtn;
	@FindBy(id="searchinput1")
	WebElement wf_passWord;
	@FindBy(id="login_submit")
	WebElement loginBtn;
	@FindBy(xpath="//div[@class='sign-cookie']/child::div/child::div[@class='form-group show']")
	WebElement wf_signCookie;
	@FindBy(xpath="//a/child::div[@class='GlobalCompany_name']/span[starts-with(text(),'WF')]")
	WebElement wf_companyName;
	@FindBy(xpath="//a/span[@class='title'][contains(text(),'Home')]")
	WebElement wf_home;
	
   public WF_Ceipal_LoginPage(){
		
		PageFactory.initElements(driver, this);
	}

	public void loginDetails(Row r) throws InterruptedException{
		
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		signInBtn.click();
		Thread.sleep(2000);
		if(wf_signCookie.isDisplayed()){
			Thread.sleep(2000);
			wf_passWord.clear();
			wf_passWord.sendKeys(r.getCell(3).getStringCellValue());
	}
		else {
			wf_userName.clear();
			wf_userName.sendKeys(r.getCell(2).getStringCellValue());
			Thread.sleep(2000);
			wf_nextBtn.click();
			Thread.sleep(2000);
			wf_passWord.clear();
			wf_passWord.sendKeys(r.getCell(3).getStringCellValue());
			Thread.sleep(2000);
			loginBtn.click();
			Thread.sleep(6000);
	    
	}
}
	
	public void validateCompanyName(){
		
		if(wf_home.isDisplayed()){
			wf_home.click();
		}
		
		else {
			wf_companyName.click();
		}
	}
}