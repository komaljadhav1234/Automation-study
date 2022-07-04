package scrolling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingToView {

	public static void main(String[] args ) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Documents\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		Thread.sleep(1000);
	    WebElement HideShowButton = driver.findElement(By.id("hide-textbox"));
	    
	     JavascriptExecutor j = (( JavascriptExecutor)driver);
	     
	     j.executeScript("arguments[0].scrollIntoView(true);",HideShowButton);
	     Thread.sleep(1000);
	     
	
	}

}
