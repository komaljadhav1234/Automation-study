package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableEg1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(2000);
		
		WebElement text = driver.findElement(By.xpath("//td[contains(text(),'Learn SQL in Practical')]"));
		System.out.println(text.getText());
		
		  List<WebElement> tableHeader = driver.findElements(By.xpath("//table//th"));
		  
		  for( WebElement th:tableHeader)
		  {
			  System.out.print(th.getText()+"|| ");
		  }
		  
		  System.out.println();
		  
		  List<WebElement> row3 = driver.findElements(By.xpath("//table//tr[3]"));
		
		  for(WebElement r:row3)
		 {
			 System.out.print(r.getText()+" || ");
		 }
		  
		
		  

	}

}
