package com.cognizant.actualTestNGPractise;

import org.testng.annotations.Test;

public class PriorityPracitce {
	@Test(priority = -1)
	public void testC() {
		System.out.println("test C");
	}

	@Test
	public void testA() {
		System.out.println("test A");
	}
	@Test
	public void testB() {
		System.out.println("test B");
	}
	
}
