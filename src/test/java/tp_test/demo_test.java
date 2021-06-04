/*
 * nikhil test
 * 
 */


package tp_test;

import  org.testng.Assert;
import org.testng.annotations.Test;

public class demo_test {
	
	@Test
	public void add()
	{
		System.out.println("sum");
		int a=1;
		int b = 3 ; 
	System.out.println(a+b);
	 Assert.assertEquals(4,a+b);
				
	}

}
