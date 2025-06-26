package com.cognizant.base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class Base_Test {
	public WebDriver driver;
	
	@BeforeSuite
	public void   dbConnection() {
		System.out.println("Here we write database connectivity code");
	}
	
	@Parameters({"url","browser"})
	@BeforeClass
	public void browserSetup(String url, @Optional("Edge")  String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
	
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		
	}

	@BeforeMethod
	public void loginIntoApplication() {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
	}

	@AfterMethod
	public void logoutFromApplication() {
		driver.findElement(By.xpath("//button[text()='Open Menu']")).click();
		driver.findElement(By.linkText("Logout")).click();
	}

	@AfterClass
	public void teardown() {
		driver.quit();
	}
	
	@AfterSuite
	public void closeDb() {
		System.out.println("disconnect database here");
	}
}
