package com.salesforce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;


public class CreateIndividuals extends ProjectSpecificMethods{
	
	
	public LastName clickNew() {
		WebElement newindividual = locateElement(Locators.XPATH,"//div[@title='New']");
		 JavascriptExecutor js = (JavascriptExecutor) getDriver();
		    js.executeScript("arguments[0].click();", newindividual);
		return new LastName();
	}
	
	
}
	