package vtiger;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import commonUtils.ExcelUtil;
import commonUtils.PropertyFileUtil;
import commonUtils.WebDriverUtil;



public class Leads {
	PropertyFileUtil putil=new PropertyFileUtil();
	WebDriverUtil wutil=new WebDriverUtil();
	ExcelUtil eutil=new ExcelUtil();
	  @Test
	public void LeadsClass() throws IOException {
		  WebDriver driver=new ChromeDriver();
			wutil.maximize(driver);
			wutil.implicitwait(driver);
			
			//To read the data from property File.
			 String URL = putil.getDataFromPropertyFile("Url");
			 String USERNAME = putil.getDataFromPropertyFile("Username");
			 String PASSWORD = putil.getDataFromPropertyFile("password");
			 
			 driver.get(URL);
			 //Login in to application
			 driver.findElement(By.name("user_name")).sendKeys(USERNAME );
			 driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
			 driver.findElement(By.id("submitButton")).click();
			 
			 driver.findElement(By.xpath("(//a[text()='Leads'])[1]")).click();
		
	}

}
