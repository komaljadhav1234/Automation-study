package misc;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleReview {

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		 driver.get("https://www.flipkart.com/");
		 Thread.sleep(3000);
		 driver.findElement(By.name("q")).sendKeys("onepluse smartphone");
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		 
		 driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//div[contains(text(),'OnePlus Nord 2')])[1]")).click();
		 Thread.sleep(1000);
		 
		 //WebElement rating = driver.findElement(By.xpath("((//div[@class='col col-7-12'])[2]//span)[6]"));
		 
	   // System.out.println(rating.getText());
		 
	}

}
