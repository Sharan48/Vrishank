package sample;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
	@Test
	public void test()
	{
		Reporter.log("New life",true);
	}

	@Test
	public void test1()
	{
		Reporter.log("New Begin",true);
	}
}
