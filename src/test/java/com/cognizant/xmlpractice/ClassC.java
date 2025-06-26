package com.cognizant.xmlpractice;

import org.testng.annotations.Test;

public class ClassC {
	
	@Test
	public void test7() {
		System.out.println("class C ---> test7"+Thread.currentThread().getId());
	}
	
	@Test
	public void test8() {
		System.out.println("class C ---> test8"+Thread.currentThread().getId());
	}
	

}
