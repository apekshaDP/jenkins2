package vtiger;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssVtigerC {

	public void VtigerTestCrm() throws InterruptedException, IOException {
		
		 WebDriver driver = new ChromeDriver();
	     
	     driver.manage().window().maximize();
	      
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 driver.get("https://demo.vtiger.com/vtigercrm/");
		 
		 //To click on Signin button
		 driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		
		 //To click on 3 lines
		 driver.findElement(By.xpath("(//span[@class='app-icon fa fa-bars'])[1]")).click();
		 
		 Thread.sleep(2000);
		    
		 WebElement market = driver.findElement(By.xpath("//span[text()=' MARKETING']"));
		 
		 Actions a = new Actions(driver);
		    
		 a.moveToElement(market).perform();
		    
		 driver.findElement(By.xpath("(//span[text()=' Contacts'])[1]")).click();
		 
		 driver.findElement(By.id("Contacts_listView_basicAction_LBL_ADD_RECORD")).click();
		 
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 
		 js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		 
		 driver.findElement(By.cssSelector("div[class='fileUploadBtn btn btn-primary']")).click();	
		    
		 Runtime.getRuntime().exec("C:\\Users\\bhagy\\Desktop\\vtiger.exe");
		    
		 Thread.sleep(2000);
		    
		 driver.findElement(By.xpath("//button[text()='Save']")).click();
		}

}