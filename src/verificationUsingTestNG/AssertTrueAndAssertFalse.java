package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertTrueAndAssertFalse {
  @Test
  public void myMethod ()
  {
	  boolean a =true;
	  boolean b =false;
	  boolean c =true;
	  
	// Assert.assertTrue(a, "A value is false Tc is failed");
	// Reporter.log("A value id true Tc is passed",true);
	 
	  
	  Assert.assertFalse(b, "value is true Tc is failed");
	  Reporter.log("value is false Tc is passed",true);
  }
}
