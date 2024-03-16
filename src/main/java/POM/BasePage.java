package POM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import commonUtils.ExcelUtil;
import commonUtils.PropertyFileUtil;
import commonUtils.WebDriverUtil;

public class BasePage {
	public static void main(String[] args) throws IOException {
		WebDriver driver;
		//WebDriver driver=new ChromeDriver();
		
		PropertyFileUtil util=new PropertyFileUtil();
		ExcelUtil eutil=new ExcelUtil();
		WebDriverUtil wutil=new WebDriverUtil();
		
		   String BROWSER = util.getDataFromPropertyFile("Browser");
			String URL = util.getDataFromPropertyFile("Url");
	       String USERNAME = util.getDataFromPropertyFile("Username");
		    String PASSWORD =util.getDataFromPropertyFile("password");
		    String FNAME = eutil.getDataFromExcel("Contacts", 0, 1);
		    String LNAME = eutil.getDataFromExcel("Contacts", 1, 1);
		   String GROUP = eutil.getDataFromExcel("Contacts", 2, 1);
		    
		    if (BROWSER.equals("Chrome")) {
				driver=new ChromeDriver();
			} 
		    else if(BROWSER.equals("Edge")) {
		    	driver=new EdgeDriver();
		    	
		    }
		    else {
		    	driver=new FirefoxDriver();

			}
		    
		driver.get( URL );
		driver.manage().window().maximize();
		LoginPage lp=new LoginPage(driver);
		lp.Login( USERNAME , PASSWORD);
		//PageFactory.initElements(driver, lp);
//		lp.getUsernametf().sendKeys(USERNAME );
//		lp.getPasswordtf().sendKeys( PASSWORD);
//		lp.getLoginbtn().click();
//		
		HomePage hp=new HomePage(driver);
		hp.Home();
//		PageFactory.initElements(driver, hp);
//		hp.getContact().click();
//		
		 ContactsPage cp=new  ContactsPage(driver);
		 cp.ContactsPage();
//		 PageFactory.initElements(driver, cp);
//		 cp.getCreateContact().click();
//		 
		 ContactInformationPage cip=new ContactInformationPage(driver);
//		 PageFactory.initElements(driver, cip);
//		 cip.getFirstname().sendKeys(FNAME);
//		 cip.getLastname().sendKeys( LNAME);
//		 cip.getAssigntype().click();
//		 wutil.handledropdown(cip.getDropdown(),GROUP);
//		 
//		 cip.getSave().click();
//		 
//		 wutil.mouseover(driver, hp.getImage());
//		 hp.getSignout().click();
//		 
//		 
//		
//		 
//		 
		 
		
		
	}
	

}
