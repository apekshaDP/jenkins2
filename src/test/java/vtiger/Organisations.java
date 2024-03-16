package vtiger;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import commonUtils.ExcelUtil;
import commonUtils.JavaUtil;
import commonUtils.ListenerImplementation;
import commonUtils.PropertyFileUtil;
import commonUtils.WebDriverUtil;

@Listeners(ListenerImplementation.class)
public class Organisations {
	PropertyFileUtil putil=new PropertyFileUtil();
	WebDriverUtil wutil=new WebDriverUtil();
	ExcelUtil eutil=new ExcelUtil();
	JavaUtil jutil=new JavaUtil();
	
	@Test
	public void OrganisationsTest() throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		wutil.maximize(driver);
		wutil.implicitwait(driver);
		// d.manage().window().maximize();
		// d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 //To read the data from property File.
		 String URL = putil.getDataFromPropertyFile("Url");
		 String USERNAME = putil.getDataFromPropertyFile("Username");
		 String PASSWORD = putil.getDataFromPropertyFile("password");
	     String OrgName = eutil.getDataFromExcel("Organisations", 0, 1);
	     String Group = eutil.getDataFromExcel("Organisations", 1, 1);
	     
		 //To launch the application
		 driver.get(URL);
		 //Login in to application
		 driver.findElement(By.name("user_name")).sendKeys(USERNAME );
		 driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		 driver.findElement(By.id("submitButton")).click();
		 driver.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
		 
		 driver.findElement(By.cssSelector("img[alt='Create Organization...']")).click();
		 
		 driver.findElement(By.name("accountname")).sendKeys(OrgName+ jutil.getRandomNumber());
		 
		 driver.findElement(By.xpath("(//input[@name='assigntype'])[2]")).click();
		 
		      WebElement dropdown = driver.findElement(By.name("assigned_group_id"));
		      
		    wutil.handledropdown(dropdown, Group);
		    
		    driver.findElement(By.xpath("(//input[@name='button'])[1]")).click();
		      Thread.sleep(2000);
		 //mouseover on img
              WebElement img = driver.findElement(By.cssSelector("img[src='themes/softed/images/user.PNG']"));
             wutil.mouseover(driver, img);
             
             
             driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
	}

	 
		
		
	}

