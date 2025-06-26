package com.cognizant.actualTestNGPractise;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DepedencyPractice {
	
	@Test
	public void addToCart() {
		System.out.println("Product added successfully into cart");
		Assert.assertTrue(false);
	}
	
	@Test(dependsOnMethods = {"addToCart"})
	public void removeProductFromCart() {
		System.out.println("Product romeved successfully from cart");
	}

}
