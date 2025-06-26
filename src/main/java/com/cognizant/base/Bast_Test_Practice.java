package com.cognizant.base;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class Bast_Test_Practice {
	@BeforeSuite
	public void dbConnection() {
		System.out.println("Here we Db connection code");
	}
	
	@BeforeClass
	public void browserSetup() {
		System.out.println("Here we write Browser Setup");
	}
	
	@BeforeMethod
	public void loginIntoApplication() {
		System.out.println("here we write login into applivtioncode");
	}
	
	@AfterMethod
	public void LogoutFromApplication() {
		System.out.println("Here we write logout from application code");
	}
	
	@AfterClass
	public void tearDown() {
		System.out.println("Close Browser code we write here");
	}
	
	@AfterSuite
	public void closedbConnection() {
		System.out.println("Here we write close db connection code");
	}

}
