package Marathon.week2.day5;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Tata {

	public static void main(String[] args) throws InterruptedException, IOException {

		ChromeDriver driver=new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.get("https://www.tatacliq.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.navigate().refresh();
		
	/*	Alert alert = driver.switchTo().alert();
		alert.accept();  */
		
		Actions act=new Actions(driver);
		
		WebElement brands = driver.findElement(By.xpath("//div[contains(text(),'Brands')]"));
		Thread.sleep(500);

		
		act.moveToElement(brands).perform();
		
		
		WebElement watchesAcc = driver.findElement(By.xpath("//div[text()='Watches & Accessories']"));
		Thread.sleep(500);
		act.moveToElement(watchesAcc).perform();
		
		driver.findElement(By.xpath("//div[text()='Casio']")).click();
		WebElement dropdown = driver.findElement(By.xpath("//select[@class='SelectBoxDesktop__hideSelect']"));

        // Create a Select object and select by visible text
        Select select = new Select(dropdown);
        select.selectByVisibleText("New Arrivals");

        System.out.println("New Arrivals selected!");
        
        driver.findElement(By.xpath("//div[contains(@class,'newFilCheckboxBlock')]")).click();
        Thread.sleep(4000);
        
        /*Actions act1=new Actions(driver);
        
        WebElement scrolldown = driver.findElement(By.xpath("//div[contains(text(),'Service')]"));
        act1.scrollToElement(scrolldown);  */

		List<WebElement> priceOfWatches = driver.findElements(By.xpath("//div[contains(@class,'priceHolder')]"));
		for(int i=0;i<priceOfWatches.size();i++)
		{
			String priceW = priceOfWatches.get(i).getText();
			System.out.println("List of Watches Prices:"+priceW);
			
		}
		System.out.println("Printed all watch prices");
	//	driver.navigate().refresh();
		Thread.sleep(2000);
		
	  WebElement casio = driver.findElement(By.xpath("//div[contains(@class,'ProductDescription__headerText')]/h3"));
	//  casio.click();
		
	  driver.executeScript("arguments[0].click();", casio);  //JavaScript ->to fix ElementStaleexception
	  
	  String parentWindow = driver.getWindowHandle();
	  
	  Set<String> allWindows = driver.getWindowHandles();
	 
	  List<String> windows=new ArrayList<String>(allWindows);
	  //switch to child window 
	  driver.switchTo().window(windows.get(1));
	  
	  String childprice = driver.findElement(By.xpath("//div[@class='ProductDetailsMainCard__price']//h3")).getText();
	  System.out.println("price of watch from second window:"+childprice);
	  
	  //switch to parent window 
	  driver.switchTo().window(windows.get(0));
	  String parentprice = driver.findElement(By.xpath("//div[@class='ProductDescription__content']//h3")).getText();
	  System.out.println("price of watch from second window:"+parentprice);
	  //comparing parent & child window watch prices
	  if(parentprice.equals(childprice))
	  {
		  System.out.println("Both the child and parent windows prices are same");
	  }
	  else
	  {
		  System.out.println("Both the child and parent windows prices are different");
	  }
	  //switch to child window
	  driver.switchTo().window(windows.get(1));
	  driver.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
	 //display no.of items in the cart
	  String cartcount = driver.findElement(By.xpath("//span[@class='DesktopHeader__cartCount']")).getText();
	  System.out.println("Items in the cart is:"+cartcount);
	  //click add to cart
	  driver.findElement(By.xpath("//div[@class='DesktopHeader__myBagShow']")).click();
	  Thread.sleep(3000);
	  
	  //screenshots
	  
	  File source = driver.getScreenshotAs(OutputType.FILE);
	  File destination = new File("./Screenshots/lastpage.png");
	  FileUtils.copyFile(source, destination);
	  
	  //close windows one by one
	  
	  for(int i=0;i<windows.size();i++)
	  {
		  driver.switchTo().window(windows.get(i));
		  driver.close();
	  }
	  
	  
	  
	}

}
