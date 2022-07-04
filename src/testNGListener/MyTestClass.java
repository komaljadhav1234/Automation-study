package testNGListener;

import org.testng.Assert;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testNGListener.Listener.class)
public class MyTestClass {
	
	@Test
	public void myTest()
	{
		Assert.fail();
	}
	
	@Test(dependsOnMethods = {"myTest"})
	public void MyMethod()
	{
		// Assert.fail();  
		Reporter.log("Hi good morning",true);
	}

}
