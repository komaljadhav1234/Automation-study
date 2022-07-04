package KiteAppBaseClass;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class BaseClasses 
{
	protected WebDriver driver;
	//browser setup
	
	public void openBrowser()
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Documents\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://kite.zerodha.com/");
		 Reporter.log("launching url",true);
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
	}

}
