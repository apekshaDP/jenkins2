package TestNg;



import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softass {
	@Test
	public void MyntraPage() {
		ChromeDriver d=new ChromeDriver();
		 d.get("https://www.myntra.com/");
		        String actualUrl = d.getCurrentUrl();
		        
		             String exceptedUrl = "https://www.myntra.com/";
		  //create object of soft Assert class
		  SoftAssert sa=new SoftAssert();
		  //call assertEqual(boolean actual,boolean expected)
		  sa.assertEquals(actualUrl,exceptedUrl );
		  System.out.println("Good morning");
		  sa.assertAll();
		  
	}
	
	
	
	
	
	

}
