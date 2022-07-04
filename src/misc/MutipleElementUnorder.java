package misc;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MutipleElementUnorder {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		 driver.get("https://www.google.com/");
		 Thread.sleep(5000);
		 
		 driver.findElement(By.name("q")).sendKeys("honda");
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		 
		 List<WebElement> searchResults = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
	
		 		for( WebElement search:searchResults)
		 		{
		 			System.out.println(search.getText());
		 			
		 		}
		 		String exepectedresult = "honda civic";
		 	
		 		for(WebElement results:searchResults)
		 		{
		 			  String actualresult = results.getText();//honda 
		 			  
		 			  if(actualresult.equals(exepectedresult))
		 			  {
		 				  results.click();
		 				  break;
		 			  }
		 				  
		 		}
		 		
		 		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		 		
		 		//driver.findElement(By.linkText("Images")).click();
		 		
		 		driver.findElement(By.partialLinkText("Images")).click();
	}

}
