package KiteAppBaseClass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

import KiteAppUtility.UtilityUsingPropertyFile;
import net.bytebuddy.utility.RandomString;

public class BaseClassesUsingProperty 
{
	protected static WebDriver driver;
	//browser setup
	
	public void openBrowser() throws IOException
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Documents\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get(UtilityUsingPropertyFile.readDataFromProperty("URL"));
		 Reporter.log("launching url",true);
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
	}
	public void takeScreenshot(String TCName) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		
		File dest = new File("C:\\Users\\Admin\\Pictures\\screenshot\\testScreenshot"+TCName+".png");
		FileHandler.copy(src, dest);
	
	}

}
