package dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelection {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Documents\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://demoqa.com/select-menu");
		//driver.manage().window().maximum();
		Thread.sleep(100);
		
	WebElement dropdownbox = driver.findElement(By.name("cars"));
	
	//1. create object of select class
	
	Select s = new Select(dropdownbox);
	
	//2. check is multiple
	boolean result =s.isMultiple();
	System.out.println("isMultiple result is "+result);
	
	//3.multiple select
	s.selectByIndex(0);
	Thread.sleep(100);
	s.selectByIndex(1);
	Thread.sleep(100);
	s.selectByIndex(2);
	Thread.sleep(500);
	
	//4. how to de-select
	
//	s.deselectAll(); // can br use only for multiple selectable
	s.deselectByValue("volvo");
	
	System.out.println(s.getFirstSelectedOption().getText());
	
	WebElement firstWebElement = s.getFirstSelectedOption();
	String myText = firstWebElement.getText();
	System.out.println("1st selected option is "+myText);
	
	System.out.println(s.getAllSelectedOptions().size());
	
	for(int i=0;i<=s.getAllSelectedOptions().size()-1;i++)
	{
		System.out.println(s.getAllSelectedOptions().get(i).getText());
	}
	
	}

}
