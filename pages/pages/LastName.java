package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class LastName extends ProjectSpecificMethods{

	
	public LastName enterLastName(String lname) {
		type(locateElement(Locators.XPATH,"//input[@placeholder='Last Name']"),lname);
		reportStep("Enter the LastName as :"+lname, "pass");
		return this;
	}	
		public void clickSave() {
			click(locateElement(Locators.XPATH,"//button[@title='Save']"));
			
		}
		
	}

