package homeassignments.week3.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestList {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		
		driver.get(" https://www.ajio.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	WebElement search=driver.findElement(By.xpath("//input[@name='searchVal']"));
	search.sendKeys("bags");
	search.submit();
	Thread.sleep(500);
	driver.findElement(By.xpath("//label[contains(@class,'facet-linkname-Men')]")).click();		
	Thread.sleep(500);
	driver.findElement(By.xpath("//label[contains(@class,'Fashion Bags')]")).click();
	
	String text=driver.findElement(By.xpath("//div[@class='length']/strong")).getText();
	System.out.println("COunt is:"+text);
	
	
	List<WebElement> brandsinPage = driver.findElements(By.className("brand"));
	
	for(int i=0;i<brandsinPage.size();i++)
	{
		System.out.println("Brands:"+brandsinPage.get(i).getText());
	}
	
	
	
	List<WebElement> bagNames = driver.findElements(By.className("nameCls"));
		for(int i=0;i<bagNames.size();i++)
		{
			System.out.println("Bag Names:"+bagNames.get(i).getText());
		}
	
	
	}

}
