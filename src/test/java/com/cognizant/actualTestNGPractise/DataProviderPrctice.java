package com.cognizant.actualTestNGPractise;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderPrctice {
	
	@DataProvider(name = "logindata", parallel = true)
	public String[][] loginData(){
		String [][]arr= {{"standard_user","secret_sauce"},{"locked_out_user","secret_sauce"},{"problem_user","secret_sauce"},{"performance_glitch_user","secret_sauce"}};
	    return arr;
	}
	
	@Test(dataProvider = "logindata" , threadPoolSize = 2 )
	public void loginIntoApllication(String username,String password) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/v1/");
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
