package webelement_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnable {

	
		public static void main(String[] args) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Documents\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
//			driver.manage().window().maximize();
			driver.get("https://www.myvi.in/");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[text()='Sign In']")).click();
			Thread.sleep(2000);
			WebElement  OTPButton = driver.findElement(By.xpath("//button[text()='send OTP']"));
			
			if(OTPButton.isEnabled())
			{
				OTPButton.click();
			}
			else
			{
				System.out.println("Entering mobile number");
				driver.findElement(By.name("number")).sendKeys("9875635320");
			
				
				if(OTPButton.isEnabled())
				{
					OTPButton.click();
				}
				else
				{
					System.out.println("Failed to click OTP Button");
				}
			}
			
		
		}
		

	

		
	}


