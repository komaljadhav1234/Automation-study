package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertNullAndNotNull {
  @Test
  public void myMethod()
  {
	  String s = null;
	  String m = "hi";
	  
	  //Assert.assertNotNull(m, "value is  null TC failed");
	 // Reporter.log("value is not null TC is passed",true);
	  
	  
	  Assert.fail();
	  Assert.assertNull(s, "value is not null TC failed");
	  Reporter.log("value is null TC is passed",true);
  }
}
