package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopUp {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Admin\\\\Documents\\\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	Thread.sleep(1000);
	driver.findElement(By.name("q")).sendKeys("iphone 13 pro");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	
	}
	

}
