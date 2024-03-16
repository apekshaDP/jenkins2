package commonUtils;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	//driver global varaible
	public WebDriver driver;
	//only for taking ss
	public static WebDriver sdriver;
	//WebDriver driver=new ChromeDriver();
	WebDriverUtil wutil=new WebDriverUtil();
	PropertyFileUtil putil=new PropertyFileUtil();
	@BeforeSuite
	public void BS() {
		System.out.println("Connect To Data Base ");
	}
	@BeforeClass
	public void BC() throws IOException {
		//Beforeclass annotation is used to launch Application
		
				String BROWSER = putil.getDataFromPropertyFile("Browser");
				String URL = putil.getDataFromPropertyFile("Url");
				
				//WebDriver driver = new ChromeDriver();	
				
				if (BROWSER.equals("Chrome"))
				{
					 driver=new ChromeDriver();
				} 
				else if(BROWSER.equals("Edge")){
					
					 driver=new EdgeDriver();
		        }
				else {
					
					driver=new FirefoxDriver();
				 }
				
				
				
				wutil.maximize(driver);
				wutil.implicitwait(driver);
				//only for take ss
				sdriver=driver;
				driver.get(URL);

		
	}
	@BeforeMethod
	public void BM() throws IOException {
	
		//@BeforeMethod is used to login to the application
		String USERNAME = putil.getDataFromPropertyFile("Username");
		 String PASSWORD = putil.getDataFromPropertyFile("password");
		 //Login to the application
		// driver.findElement(By.cssSelector("input[name='user_name']")).sendKeys(USERNAME );
		 driver.findElement(By.name("user_name")).sendKeys(USERNAME );
		 driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		 driver.findElement(By.id("submitButton")).click();
		
	}
	@AfterMethod
	public void AM() throws InterruptedException {
		//@Affter method is used to sign out form the application.
		 //mouseover on img
		Thread.sleep(2000);
        WebElement img = driver.findElement(By.cssSelector("img[src='themes/softed/images/user.PNG']"));
       wutil.mouseover(driver, img);
       
       
       driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		
	}
	@AfterClass
	public void AF() {
		//After class is used to close the browser
		driver.quit();
		
	}
	@AfterSuite
	public void AS() {
		System.out.println("Dissconnect To Data Base ");
	}
	

}
