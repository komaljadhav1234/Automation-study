package intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First_SeleniumCode {

	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Documents\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.amazon.com/");
	
	//driver.close();
	//driver.quit();
	driver.manage().window().maximize();
	//driver.manage().window().minimize();
	driver.navigate().to("https://www.flipkart.com/");
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
	}
}
