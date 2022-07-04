package intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebDriverMethods {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Admin\\\\Documents\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://Kite.zerodha.com/");
		
		 String title = driver.getTitle();
		 
		 System.out.println(title);
		 
		 System.out.println(driver.getTitle());
		 
		String url =  driver.getCurrentUrl();
		System.out.println("url is "+url);
		
		System.out.println(driver.getCurrentUrl());
	}

}
