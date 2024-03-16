package TestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotaions {
	
	 @BeforeSuite
	 public void BF() {
		 System.out.println("Before suite");
	 }
	 @AfterSuite
	 public void as() {
		 System.out.println("After suite");
	 }
	 
	
	  @Test
	  public void Amazon(){
	
		  System.out.println("Amazon");
	  }
	
	  @Test
	  public void Facebook() {
		  System.out.println("facebook");
	  }
	  @BeforeMethod
	  public void BM() {
		  System.out.println("Before Method");
	  }
	  @AfterMethod
	  
	  public void AM() {
		  System.out.println("After Method");
	  }
	  @BeforeClass
	   public void BC() {
		  System.out.println("Before class");
	  }
	  @AfterClass
	   public void AC() {
		  System.out.println("After class");
	  }
	  @BeforeTest
	  public void BT() {
		  System.out.println("Before Test");
	  }
	  @AfterTest
	  public void AT() {
		  System.out.println("After Test");
	  }
	  
	  
	

}
