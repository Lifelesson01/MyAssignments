package com.salesforce.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.salesforce.pages.LoginPage;

public class LoginPage_TC_001  extends ProjectSpecificMethods{
	
	
	@BeforeTest
	public void setValues() {
		excelFileName="Login";
		testcaseName="Salesforce Application";
		testDescription="Login page";
		authors="Bhuvanesh";
		category="Sanity";
	}
	
	
	@Test(dataProvider = "fetchData")
	public void login(String uName,String pWord,String lname) {
		
		LoginPage lp=new LoginPage();
		lp.enterUserName(uName)
		.enterPassword(pWord)
		.clickLogin()
		.clickToggle()
		.clickViewAll()
		.clickIndividuals() 
		.clickNew()                              //Not for delete 
		.enterLastName(lname)					//Not for delete
		.clickSave();							//Not for delete
		//Delete
	/*	.clickList()
		.clickDropdown()
		.clickDeletebutton()
		.clickDeletepopup();   */
		
	}

}
