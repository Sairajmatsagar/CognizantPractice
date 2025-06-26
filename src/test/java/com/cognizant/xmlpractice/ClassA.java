package com.cognizant.xmlpractice;

import org.testng.annotations.Test;

public class ClassA {
	
	@Test(groups = {"smoke"})
	public void test1() {
		System.out.println("class A ---> test1"+Thread.currentThread().getId());
	}
	
	@Test(groups = {"smoke","regression"})
	public void test2() {
		System.out.println("class A ---> test2"+Thread.currentThread().getId());
	}
	@Test(groups = {"sanity"})
	public void test3() {
		System.out.println("class A ---> test3"+Thread.currentThread().getId());
	}

}
