package com.cognizant.actualTestNGPractise;

import org.testng.annotations.Test;

public class InvocationCountPractice {
	
	
	@Test(invocationCount = 3)
	public void testA( ) {
		System.out.println("Test A");
	}

}
