package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage 
{

	//1.data members
	
	@FindBy(xpath="//span[@class='user-id']") private WebElement userID;
	@FindBy(xpath="//a[@target='_self']") private WebElement logOut;
	
	//2.constructor
	public KiteHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//3.methods
	public void validateUserID()
	{
			 String actualUserID = userID.getText();
			 String expectedUserID = "ELR328";
			 if( actualUserID.equals(expectedUserID))
			 {
				 System.out.println("User ID matching TC is passed");
			 }
			 else 
			 {
				 System.out.println("User ID  not matching TC is Failed");	 
			 }
	}
	
	public void clickOnLogoutButton() throws InterruptedException
	{
		userID.click();
		Thread.sleep(200);
		logOut.click();
	}
	
}
