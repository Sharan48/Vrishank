package sample;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2 {
	@Test(invocationCount=2)
	public void test()
	{
		Reporter.log("hiiiii",true);
	}
	@Test(invocationCount=1)
	public void test1()
	{
		Reporter.log("oooooooo",true);
	}
}
