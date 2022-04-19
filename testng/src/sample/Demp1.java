package sample;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demp1 {
	@Test(priority=2)
	public void test1(){
		Reporter.log("hello",true);
	}
	@Test(priority=1)
	public void test2()
	{
		Reporter.log("Hi",true);
	}
	
}
