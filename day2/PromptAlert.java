package homeassignments.week3.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

	public static void main(String[] args) {


		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://leafground.com/alert.xhtml");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		
		Alert promptalert = driver.switchTo().alert();
		String text1=promptalert.getText();
		System.out.println("Prompt alert text:"+text1);
		promptalert.sendKeys("Sowjanya");
		promptalert.accept();
		//promptalert.dismiss();
		
		
	}

}
