package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class DeleteIndividual extends ProjectSpecificMethods {
	
	public DeleteIndividual clickList(String lname) {
		type(locateElement(Locators.XPATH,"//input[@name='Individual-search-input']"),lname);
		reportStep("Enter the LastName as :"+lname, "pass");
		return this;
	}
		public DeleteIndividual clickDropdown() {
			click(locateElement(Locators.XPATH,"//a[@role='button' and @title='Show more actions'])[1]"));
			return this;
		}

		
		public DeleteIndividual clickDeletebutton() {
			click(locateElement(Locators.XPATH,"//div[@title='Delete']//parent::a[@role='menuitem']"));
			return this;
		}

		
			public void clickDeletepopup() {
			click(locateElement(Locators.XPATH,"//button[@title='Delete']"));
			
		}
		
	}


