package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Execution3 {
	//For parrllel execution -classes
	
	@Test
	public void SkillraryTest() {
		WebDriver driver=new ChromeDriver() ;
		driver.get("https://www.skillrary.com/ ");
		
	}
	@Test
	public void VtigerTest() {
		WebDriver driver=new ChromeDriver() ;
		driver.get("https://www.vtiger.com/ ");
		
	}

}
