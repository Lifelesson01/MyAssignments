package Marathon.week2.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();

		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for boys");
	
		driver.findElement(By.xpath("//div[text()=\"bags for boys\"]")).click();
		
		String header=driver.findElement(By.xpath("//h2[contains(@class,'a-text-normal')]")).getText();	
		System.out.println("Header of Bags for Boys is:"+header);
		
		driver.findElement(By.linkText("Skybags")).click();
		driver.findElement(By.linkText("Safari")).click();
		Thread.sleep(500);
		
		WebElement dropdown=driver.findElement(By.id("s-result-sort-select"));
		Select option=new Select(dropdown);
		option.selectByVisibleText("Newest Arrivals");
				
		String newestarrival=driver.findElement(By.xpath("//span[contains(text(),'Safari Captain 37L')]")).getText();		
		System.out.println("Newest Arrival is:"+newestarrival);
		
		String discountedprice=driver.findElement(By.className("a-price-whole")).getText();	
		System.out.println("discountedprice:"+discountedprice);
		String title=driver.getTitle();
		System.out.println("Title of the page:"+title);
		//driver.close();
		
	}

}
