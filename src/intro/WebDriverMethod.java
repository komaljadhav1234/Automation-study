package intro;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethod {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize(); //maximize method
		 
		driver.get("https://vctcpune.com/"); // to get the url;
		Thread.sleep(2000);
		
		// driver.close();//close current window;
		// driver.quit();//close all tab opened by selenium
		 
		 driver.manage().window().maximize(); //its also known as cascade method
		// driver.manage().window().minimize(); //
		
	driver.navigate().to("https://www.flipkart.com/"); //navigate to new page method
	driver.navigate().back();	//navigate back
	driver.navigate().forward(); //navigate forward

	driver.navigate().refresh();
	
	String title = driver.getTitle();
	
	
	driver.close();
	}

}