package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Execution4 {
	
	
	
public WebDriver driver;
	
	@Parameters("Browser")
	@Test
	public void MyntraTest(String Browser) {
		if (Browser.equals("Chrome") ) {
				 driver=new ChromeDriver();
			
		} else {
			 driver =new EdgeDriver();

		}
		driver.get("https://www.myntra.com");
		
	}
	
	
}
