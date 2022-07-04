package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		 //driver.manage().window().maximize();
		 Thread.sleep(2000);
		 driver.switchTo().frame("menuButton");
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//button[@type='button']")).click();
		 //driver.switchTo().defaultContent();
		// driver.findElement(By.xpath("//a[@title='Change Theme']")).click();
		 

	}

}
