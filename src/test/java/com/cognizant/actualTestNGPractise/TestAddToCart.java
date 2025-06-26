package com.cognizant.actualTestNGPractise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cognizant.base.Base_Test;

public class TestAddToCart extends Base_Test {
    @Test
	public void testAddToCart() {
    	driver.findElement(By.xpath("(//button[text()='ADD TO CART'])[1]")).click();
	}
    
	public void testRemoveProductFromCart() {
		
    	driver.findElement(By.xpath("(//button[text()='ADD TO CART'])[1]")).click();
	    driver.findElement(By.xpath("//a[contains(@class,'shopping_cart_link')]")).click();
	    driver.findElement(By.xpath("//button[text()='REMOVE']")).click();
	   
	    
	}
}
