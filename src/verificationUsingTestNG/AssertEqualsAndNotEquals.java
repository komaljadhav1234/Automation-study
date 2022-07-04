package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertEqualsAndNotEquals {
  @Test
  public void mymethod() 
  {
	  String s = "Velocity";
	  String m = "Velocity";
	  String n = "Pune";
	  
	  //if s and m are same then TC should be passed else TC failed
	  
	 // Assert.assertEquals(s, m,"String are not Matching Tc is failed");
	 // Reporter.log("Strings are matching TC is passed",true);
	  
	  Assert.assertNotEquals(m,n,"String are not Matching Tc is failed");
	  Reporter.log("Strings are not matching TC is passed",true);
  }
  
 }
