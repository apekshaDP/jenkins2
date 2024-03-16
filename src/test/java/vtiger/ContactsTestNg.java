package vtiger;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import commonUtils.BaseClass;
import commonUtils.ExcelUtil;
import commonUtils.JavaUtil;
import commonUtils.PropertyFileUtil;
import commonUtils.WebDriverUtil;

public class ContactsTestNg extends BaseClass{
	PropertyFileUtil putil=new PropertyFileUtil();
	WebDriverUtil wutil=new  WebDriverUtil();
	JavaUtil jutil = new JavaUtil();
	ExcelUtil eutil=new ExcelUtil();
	

	
	
	 @Test
	   public void contacts() throws IOException, InterruptedException {
		   
		  // WebDriver driver=new ChromeDriver() ;
		   wutil.maximize(driver);
		   //To appply implicict wait for findElement()
			wutil.implicitwait(driver);
		   
		   //To read data from proprty file
		   String URL = putil.getDataFromPropertyFile("Url");
			 String USERNAME = putil.getDataFromPropertyFile("Username");
			 String PASSWORD = putil.getDataFromPropertyFile("password");
			 String Fname = eutil.getDataFromExcel("Contacts", 0, 1);
			 String Lname = eutil.getDataFromExcel("Contacts", 1, 1);
			 String Group =eutil.getDataFromExcel("Contacts", 2, 1);
			         String OrgName = eutil.getDataFromExcel("Contacts", 3, 1);
			 
			 
			//To launch the application
			 driver.get(URL);
			 //Login in to application
			// driver.findElement(By.name("user_name")).sendKeys(USERNAME );
			 driver.findElement(By.cssSelector("input[name='user_name']")).sendKeys(USERNAME );
			 driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
			 driver.findElement(By.id("submitButton")).click();
			 //To click on contacts
			 driver.findElement(By.xpath("//a[text()='Contacts']")).click();
			 
			 driver.findElement(By.cssSelector("img[alt='Create Contact...']")).click();
			 //enter first name
			 driver.findElement(By.name("firstname")).sendKeys(Fname);
			 //enter last name
			 driver.findElement(By.name("lastname")).sendKeys(Lname);
			//To fail the test script
				//WebElement notifyowner = driver.findElement(By.name("notify_owner"));
				//Assert.assertTrue(notifyowner.isSelected());
				
			 //To fail the testscript
		     String actaulurl = driver.getCurrentUrl();
		     String expectedurl = " http://localhost:8888/index.php?module=Contacts&action=EditView&return_action=DetailView&parenttab=Marketing";
		    
			                
			 Assert.assertEquals(actaulurl, expectedurl);
			 
			 driver.findElement(By.xpath("(//input[@name='assigntype'])[2]")).click();
			 //in dropdown select Team Selling
			
		      WebElement dropdown = driver.findElement(By.name("assigned_group_id"));
		        
			  wutil.handledropdown(dropdown, Group);		 
            //click on + symbol
			    driver.findElement(By.xpath("(//img[@alt='Select'])[1]")).click();
			        
			        //Transfer the drver control from parent window to child window
		          wutil.switchwindow(driver, "http://localhost:8888/index.php?module=Accounts&action=Popup&popuptype=specific_contact_account_address&form=TasksEditView&form_submit=false&fromlink=&recordid=");
              	driver.findElement(By.id("search_txt")).sendKeys(OrgName );
	                driver.findElement(By.name("search")).click();
	                
	                driver.findElement(By.xpath("//a[text()='Intel0']")).click();
	                wutil.switchwindow(driver, "http://localhost:8888/index.php?module=Contacts&action=EditView&return_action=DetailView&parenttab=Marketing");
	                
	                driver.findElement(By.xpath("(//input[@name='button'])[1]")).click();
	              //To click a screenshot
	                wutil.screenshot(driver, "ContactTest");
	        		
	        		Thread.sleep(2000);
	        		
	        		//To Take screenshot of contacts
	        		wutil.screenshot(driver, "Contacts");
	        		
	        	    //Thread.sleep(2000);
	        		
	                
	                WebElement img = driver.findElement(By.cssSelector("img[src='themes/softed/images/user.PNG']"));
	                wutil.mouseover(driver, img);
	                
	                
	                driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
	                
	       
	
	
	
	
	
	
	
	 }
	
	
	
	
	
	
}
