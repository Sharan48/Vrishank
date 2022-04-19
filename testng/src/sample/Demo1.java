package sample;

import org.testng.annotations.Test;

public class Demo1 {
	@Test
	public void fact(){
		int no=1;
		int fact = 10;
		for(int i=no; i<10; i++){
			fact=fact*i;
		}	
		System.out.println(fact);
	}
	@Test
	public void fib()
	{
		int fib1=1;
		int fib2=0;
		int fib3=1;
		//System.out.println(fib1+" "+fib2+" ");
		for(int i=1; i<=10; i++)
		{
			fib3=fib1+fib2;
			fib1=fib2;
			fib2=fib3;
		}
		System.out.println(fib3);
	}
}
