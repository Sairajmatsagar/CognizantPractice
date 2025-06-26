package practicetestng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo {
	@BeforeClass
	public void browserSetup() {
		System.out.println("Launch browser");
		System.out.println("Navigate to application");
	}
	@BeforeMethod
	public void loginIntoApplication() {
		System.out.println("Login into application");
	}
    @Test
	public void testAddToCart() {
		
		System.out.println("Search for product");
		System.out.println("Add to cart");
		
	}
    
    @Test
    public void testRemoveProductFromCart() {
		
		System.out.println("Search for product");
		System.out.println("Add to cart");
		System.out.println("Remove Product From cart");
		
	}
   @AfterMethod
   public void logoutFromApplication() {
	   System.out.println("Logout from application"); 
   }
   @AfterClass
   public void teardown() {
	   System.out.println("close browser");
   }
}
