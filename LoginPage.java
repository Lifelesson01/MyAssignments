package com.salesforce.pages;

import org.openqa.selenium.WebElement;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {
	
	
	public LoginPage enterUserName(String uName) {
		
		
		clearAndType(locateElement(Locators.ID,"username"), uName);
		reportStep("Enter the UserName as :"+uName, "pass");
		return this;
	}
	
	public LoginPage enterPassword(String pWord) {
		
		clearAndType(locateElement("password"), pWord);
		return this;
	}
	
	

	public HomePage clickLogin() {
		click(Locators.ID,"Login");
		return new HomePage();
		
	}

}
