package webelement_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(2000);
		WebElement checkbox = driver.findElement(By.id("checkBoxOption1"));

	if(checkbox.isSelected())
	{
		System.out.println("checkbox is already selected");
		
	}
	else
	{
		System.out.println("selecting check box");
		checkbox.click();
		if(checkbox.isSelected())
		{
			System.out.println("checkbox is  selected now");
		}
		else
		{
			System.out.println("failed to select check box");
		}
	}
	}
	

}
