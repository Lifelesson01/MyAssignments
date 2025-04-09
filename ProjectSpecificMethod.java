package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificMethod {
	
	public ChromeDriver driver;

	@BeforeMethod
	public  void PreConditions() {
					
		    ChromeOptions option = new ChromeOptions();   //stop pop up unnecessary notifications
		    option.addArguments("--disable-notifications");
			driver = new ChromeDriver(option);
			driver.get("https://login.salesforce.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
			driver.findElement(By.id("username")).sendKeys("dilip@testleaf.com");
			driver.findElement(By.id("password")).sendKeys("Test@2025");
			driver.findElement(By.id("Login")).click();

	}

	@AfterMethod
	public void postConditions() {
		
		driver.close();
		
			}
	
	
	}
	

