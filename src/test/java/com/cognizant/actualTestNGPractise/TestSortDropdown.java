package com.cognizant.actualTestNGPractise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.cognizant.base.Base_Test;

public class TestSortDropdown  extends Base_Test{
	
	@Test
	public void testSortDropdown() {
    	WebElement sortDropdown = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
	    Select dropdown=new Select(sortDropdown);
	    dropdown.selectByVisibleText("Price (low to high)");
	    
	}

}
