package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableEg3 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(2000);
		
		List<WebElement> NumOfRows = driver.findElements(By.xpath("//tr"));
		List<WebElement> NumOfcolumns = driver.findElements(By.xpath("//th"));
	
		int totalNumOfRows = NumOfRows.size();
		int totalNumOfcolumns = NumOfcolumns.size();
		
		System.out.println("total number of rows are"+totalNumOfRows);
		System.out.println("total number of rows are"+totalNumOfcolumns);
		
		for(int i=1;i<=totalNumOfRows;i++)
		{
			for(int j=1;j<=totalNumOfcolumns;j++)
			{
				if(i==1)
				{
					String text = driver.findElement(By.xpath("//table//tr["+i+"]//th["+j+"]")).getText();
					System.out.print(text+" ");
				}
				else
				{
				String text = driver.findElement(By.xpath("//table//tr["+i+"]//td["+j+"]")).getText();
				System.out.print(text+" ");
			}
			
			System.out.println();
		}
	
	}
	}

}
