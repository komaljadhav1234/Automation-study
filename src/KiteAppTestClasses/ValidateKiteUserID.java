package KiteAppTestClasses;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import KiteAppBaseClass.BaseClasses;
import KiteAppPOM.KiteHomePage;
import KiteAppPOM.KiteLoginPage;
import KiteAppPOM.KitePinPage;
import KiteAppUtility.Utility;

public class ValidateKiteUserID extends BaseClasses
{
	KiteLoginPage login;
	KitePinPage pin;
	KiteHomePage home;
	
	
	
	@BeforeClass
	public void launchBrowser()
	{
		openBrowser();
		login = new KiteLoginPage(driver);
		pin = new KitePinPage(driver);
		home = new KiteHomePage(driver);
	}
	
	@BeforeMethod
	public void loginToKiteApp() throws EncryptedDocumentException, IOException
	{
		login.sendUserName(Utility.readDataFromExcel(0, 0));
		//Reporter.log("sending username",true);
		login.sendPassword(Utility.readDataFromExcel(0, 1));
		//Reporter.log("sending password",true);
		login.clickOnLoginButton();
		//Reporter.log("sending on login button",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(100));
		pin.sendPin(Utility.readDataFromExcel(0, 2));
		//Reporter.log("sending pin",true);
		pin.clickOnContinueButton();
		//Reporter.log("click on continue button",true);
	}
	
	@Test
	public void validateUserName() throws EncryptedDocumentException, IOException
	{
		 String actualUserName = home.getActulUserID();
		 String ExpectedUserName = Utility.readDataFromExcel(0, 0);
		 
		 Assert.assertEquals(actualUserName, ExpectedUserName,"TC is FAILED actual and expected user name not matching");
		 Reporter.log("User names ar matching TC is passed",true);
		 Utility.takeScreenshot(driver);
	}
	
	@AfterMethod
	
	public void logoutfromKiteApp() throws InterruptedException
	{
		
		home.clickOnLogoutButton();
	
	}

	@AfterClass
	public void closeBrowser()
	{
		
		driver.close();
	
	}
}
