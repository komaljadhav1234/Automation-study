package webelement_study;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplay {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(5000);
		
		WebElement textBox = driver.findElement(By.id("displayed-text")); //text box xpath
		
		boolean result = textBox.isDisplayed();
		System.out.println("text box status is "+result);
		textBox.sendKeys("hi gm");
		
		driver.findElement(By.id("hide-textbox")).click(); //hide box xpath
		boolean result1 = textBox.isDisplayed();
		System.out.println("the text box status is "+result1);
	}

}
