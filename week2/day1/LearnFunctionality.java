package week2.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver; 

public class LearnFunctionality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		
	//	EdgeDriver driver1=new EdgeDriver();
		
		driver.get("https://facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("sowjiag38@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Sowja");
		
		driver.findElement(By.name("login")).click();
	}

}
