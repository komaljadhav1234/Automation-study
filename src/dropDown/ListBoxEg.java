package dropDown;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxEg {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Documents\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.facebook.com/");
		//driver.manage().window().maximum();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(@id,'u_0_2_')]")).click();
		Thread.sleep(2000);
	
	//1 . Identify list box to be handled and store it in reference variable.	
		WebElement day = driver.findElement(By.name("birthday_day"));
		 
		 // 2. create object of select class which will accept WebElement as argument
		 
		 Select s = new Select(day);
		 
		 	//3. By using one of the select class methods we can select value:
//		 		1. selectByVisibleText: selectByVisibleText(String arg0) 
//		 		2. selectByIndex: selectByIndex(int arg0) 
//		 		3. selectByValue: selectByValue(String arg0)
		 	//Thread.sleep(1000);
		 //.selectByVisibleText("8");
		 	
		 
	}

}
