package com.cognizant.actualTestNGPractise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestLogin {
	
	@Test
    public void loginWithValidCredential() {
    	WebDriver driver =new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	driver.get("https://www.saucedemo.com/v1/");
    	driver.findElement(By.id("user-name")).sendKeys("standard_user");
    	driver.findElement(By.id("password")).sendKeys("secret_sauce");
    	driver.findElement(By.id("login-button")).click();
    	
    }

}
