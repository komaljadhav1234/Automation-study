package misc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Actions1 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		 
		 driver.get("https://demo.guru99.com/test/drag_drop.html");
		 
		 Thread.sleep(1000);
		 driver.manage().window().maximize();
		 Thread.sleep(1000);
		 
		//move to element using mouse actions
		 Actions act = new Actions(driver);
		 WebElement MyElement = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		 act.moveToElement(MyElement).perform();
		 
		 //click using mouse actions
		WebElement testElement = driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[2]"));
		//1st way
		//act.moveToElement(testElement).perform();
		//act.click().perform();
		
		//2nd way
		//act.moveToElement(testElement).click().build().perform();
		//we used build bcoz multiple action combine together
		 
		 //3rd way
		//act.click(testElement).perform();
		
		//1st way=right click----context click
		
		//act.moveToElement(testElement).contextClick().build().perform();
		 
		//2nd way= right click
		
		act.contextClick(testElement).perform();
		 
		 
	}

}
