package misc;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOfLinksInWebpage {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		 
		 driver.get("https://vctcpune.com/selenium/practice.html");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		 
		 List<WebElement> links = driver.findElements(By.tagName("a"));
		 
		 
		 System.out.println(links.size());
		//print all links
		 
		Iterator<WebElement> it = links.iterator();
		 	while(it.hasNext())
		 	{
		 		System.out.println(it.next());
		 	}
	}

}
