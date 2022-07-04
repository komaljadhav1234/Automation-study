package misc;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardAction {

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		 
		 driver.get("https://vctcpune.com/selenium/practice.html");
		 
		 Thread.sleep(1000);
		 WebElement textBox = driver.findElement(By.id("autocomplete"));
		 
		 //textBox.sendKeys("Velocity");-->print velocity value on textbox
		 
		 Actions act = new Actions(driver);
		 // act.sendKeys(textBox,"Pune").perform();-->Print value on textbox "pune"
		 
		//act.keyDown(textBox, Keys.SHIFT).sendKeys("pune").build().perform();--->print capital value
		 
		 //below syntax will show first letter capital remaining small
		 
		 act.keyDown(textBox, Keys.SHIFT).sendKeys("p").keyUp(Keys.SHIFT).sendKeys("une").build().perform();
		 
		 
	}

}
