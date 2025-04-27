package com.salesforce.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class HomePage  extends ProjectSpecificMethods{
	
	
	public HomePage clickToggle() {  
	    WebElement toggle = locateElement(Locators.XPATH, "//span[contains(text(),'App Launcher')]");
	    JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    js.executeScript("arguments[0].click();", toggle);
	    return this;
	}

	public HomePage clickViewAll() {
	    WebElement viewAllButton = locateElement(Locators.XPATH, "//button[contains(text(),'View All')]");
	    JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    js.executeScript("arguments[0].click();", viewAllButton);
	    return this;
	}
	

	
	public CreateIndividuals clickIndividuals() {
		WebElement individual =locateElement(Locators.XPATH,"//p[text()='Individuals']");
		 JavascriptExecutor js = (JavascriptExecutor) getDriver();
		    js.executeScript("arguments[0].click();", individual);
		return new CreateIndividuals();
	}

	
}
