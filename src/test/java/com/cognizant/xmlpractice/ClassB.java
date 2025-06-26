package com.cognizant.xmlpractice;

import org.testng.annotations.Test;

public class ClassB {
	
	@Test	(groups = {"smoke"})
	public void test4() {
		System.out.println("class B ---> test4"+Thread.currentThread().getId());
	}
	
	@Test	(groups = {"sanity"})
	public void test5() {
		System.out.println("class B ---> test5"+Thread.currentThread().getId());
	}
	@Test(groups = {"regression"})
	public void test6() {
		System.out.println("class B ---> test6"+Thread.currentThread().getId());
	}

}
