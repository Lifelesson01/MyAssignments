package Marathon.week2.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.pvrcinemas.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//span[(text()='Cinema')]")).click();
		driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Marina Mall')]")).click();
	
	driver.findElement(By.xpath("//span[contains(text(),'Today')]")).click();
	Thread.sleep(500);
	driver.findElement(By.xpath("//li[contains(@class,'p-dropdown-item')]")).click();
	Thread.sleep(500);
	driver.findElement(By.xpath("//li[contains(@class,'p-dropdown-item')][7]")).click();
	driver.findElement(By.xpath("//button[contains(@class,'filter-btn')]")).click();
	driver.findElement(By.xpath("//button[text()='Accept']")).click();
	driver.findElement(By.xpath("//span[@class='seat-current-pvr']")).click();
	driver.findElement(By.xpath("//button[text()='Proceed']")).click();
	String seatinfo=driver.findElement(By.xpath("//div[@class='seat-number']")).getText();
	System.out.println("seat number:"+seatinfo);
	String grandtotal=driver.findElement(By.xpath("//div[@class='grand-amount']")).getText();		
	System.out.println("Grand total:"+grandtotal);
	driver.findElement(By.xpath("//button[text()='Proceed']")).click();
	WebElement closePopup = driver.findElement(By.xpath("(//div[contains(@class,'cross-icon')])[2]"));
	closePopup.click();
	System.out.println("Current Page Title: " + driver.getTitle());
	driver.close();
	}

}
