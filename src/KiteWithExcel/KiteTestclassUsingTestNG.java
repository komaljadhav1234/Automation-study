package KiteWithExcel;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KiteTestclassUsingTestNG {
	
KiteLoginPage login;
KitePinPage pin;
KiteHomePage home;
WebDriver driver;
Sheet mySheet;

	
@BeforeClass
public void launchBrower() throws EncryptedDocumentException, IOException
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Documents\\chromedriver.exe");
     driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://kite.zerodha.com/");
	 Reporter.log("launching url",true);
	 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	 login = new KiteLoginPage(driver);
	 home = new KiteHomePage(driver);
	 pin = new KitePinPage(driver);
	 File MyFile = new File("C:\\Users\\Admin\\Documents\\5thmarch.xlsx");
	 mySheet = WorkbookFactory.create(MyFile).getSheet("Sheet4");
	}
  
@BeforeMethod
public void loginToKite()
{
	login.sendUserName(mySheet.getRow(0).getCell(0).getStringCellValue());
	Reporter.log("sending UserName",true);
	login.sendPassword(mySheet.getRow(0).getCell(1).getStringCellValue());
	Reporter.log("sending Password",true);
	login.clickOnLoginButton();
	Reporter.log("Clicking onlogin button",true);
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(200));
	pin.sendPin(mySheet.getRow(0).getCell(2).getStringCellValue());
	Reporter.log("sending PIN",true);
	pin.clickOnContinueButton();
	Reporter.log("Clicking on continue button",true);
	
}
		
@Test
  public void VerifyKiteUserName() 
   {
	  // expected username--->excel
	//actual username???
 	 String expectedUserID= mySheet.getRow(0).getCell(0).getStringCellValue();
	 String actualUserID = home.getActualUserID();
	 Reporter.log("Validating user ID ",true);
	 Assert.assertEquals(expectedUserID, actualUserID,"Expected and Actual are not matching TC is FAILED");
	 Reporter.log("Expected UserID and Actual UserID are  matching TC is PASSED");
      
   
   }
@AfterMethod
public void logOutFromKiteApp() throws InterruptedException
{
	home.clickOnLogoutButton();
	Reporter.log("Logging out.........",true);
}
@AfterClass
public void closeBrowser()
{
	Reporter.log("closing browser",true);
	driver.close();
	
	
}
}
