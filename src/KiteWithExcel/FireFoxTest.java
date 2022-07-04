package KiteWithExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxTest {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\Documents\\geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.get("https://kite.zerodha.com/");

	}

}
