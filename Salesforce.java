package testcases;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Salesforce extends ProjectSpecificMethod{
	@Test
	public  void Test() {

								
	   WebElement toggle=driver.findElement(By.xpath("//span[contains(text(),'App Launcher')]"));
		driver.executeScript("arguments[0].click();",toggle );
		
		driver.findElement(By.xpath("//button[contains(text(),'View All')]")).click();
		
	WebElement search=driver.findElement(By.xpath("//li[contains(@class,'slds-p-vertical_small')]//p[contains(text(),'Entities')]"));
	driver.executeScript("arguments[0].click();",search );
		
	driver.findElement(By.xpath("//a[contains(@class,'slds-button')]//span[contains(text(),'Legal')]")).click();
	System.out.println("run1");
	WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Entities List')]"));
	 driver.executeScript("arguments[0].click();", element); 
	 
		System.out.println("run");
		driver.findElement(By.xpath("//span[contains(@class,'Entities')]")).click();
		System.out.println("run2");
		driver.findElement(By.xpath("//div[text()='New']")).click();
		
		driver.findElement(By.name("Name")).sendKeys("AGS");
		driver.findElement(By.name("CompanyName")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("//label[contains(text(),'Description')]")).sendKeys("SalesForce");
		driver.findElement(By.xpath("//span[text()='Active'])")).click();
		driver.findElement(By.name("SaveEdit")).click();
	}

}
