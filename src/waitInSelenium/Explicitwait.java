package waitInSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.get("https://www.myvi.in/");
		//Thread.sleep(2000);
		 WebElement signInButton= driver.findElement(By.xpath("//a[text()='Sign In']"));
		WebDriverWait w = new WebDriverWait(driver,Duration.ofMillis(4000));
		w.until(ExpectedConditions.visibilityOf(signInButton));
		// signInButton.click();

	}

}
