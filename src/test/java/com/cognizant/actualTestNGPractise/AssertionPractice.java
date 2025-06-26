package com.cognizant.actualTestNGPractise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionPractice {
	
	@Test
	public void testA() {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.nike.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Men")).click();
		String expectedTitle="Men's Shoes, Clothing & Accessories. Nike IN";
		String actualTitle= driver.getTitle();
		Assert.assertEquals(expectedTitle,actualTitle,"Title mismatched" );
		WebElement menElement = driver.findElement(By.xpath("//h1[text()='Men']"));
		Assert.assertTrue(menElement.isDisplayed());
		
	}
	@Test
	public void softassertionPracitce() {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.nike.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Men")).click();
		String expectedTitle="sairaj";
		String actualTitle= driver.getTitle();
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(expectedTitle, actualTitle);
		System.out.println("Still running");
		sa.assertAll();
	}

}
