package objectRepository;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import commonUtils.ExcelUtil;
import commonUtils.JavaUtil;
import commonUtils.PropertyFileUtil;
import commonUtils.WebDriverUtil;

public class BasePage{
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver;
		PropertyFileUtil util=new PropertyFileUtil();
	   String BROWSER = util.getDataFromPropertyFile("Browser");
		String URL = util.getDataFromPropertyFile("Url");
       String USERNAME = util.getDataFromPropertyFile("Username");
	    String PASSWORD =util.getDataFromPropertyFile("password");
	    
	    ExcelUtil eutil=new ExcelUtil();
	    String ORGNAME = eutil.getDataFromExcel("Organisations", 0, 1);
	    String GROUP = eutil.getDataFromExcel("Organisations", 1, 1);
	    WebDriverUtil wutil=new WebDriverUtil();
	    
	    JavaUtil jutil=new JavaUtil();
	    
	    
	    
	    if (BROWSER.equals("Chrome")) {
			driver=new ChromeDriver();
		} 
	    else if(BROWSER.equals("Edge")) {
	    	driver=new EdgeDriver();
	    	
	    }
	    else {
	    	driver=new FirefoxDriver();

		}
	                
		//WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//To launch the app
		driver.get(URL);
		
		
		
		//Create object of LoginPage
		LoginPage lp=new LoginPage(driver);
		lp.Login(USERNAME, PASSWORD);
		//to initialize the web ele
		//PageFactory.initElements(driver, lp);
//		lp.getUsernametf().sendKeys(USERNAME );
//	
//		lp.getPasswordtf().sendKeys(PASSWORD);
//		lp.getLoginbtn().click();
//		
		
		//create Object of HomePage
		 HomePage hp=new  HomePage (driver);
		 hp.Home();
		 //hp.Home(driver);
		// PageFactory.initElements(driver, hp);
		//PageFactory.initElements(driver, hp);
		 //To clicxk on org
//		 hp.getOrganization().click();
//	
//		 //create object of organisations
		 OrganistionPage op=new OrganistionPage (driver);
		 op.Organisations();
//		// PageFactory.initElements(driver, op);
//		 //To click on org(+)
//		 op.getCreateOrganization().click();
//		 
//		 //craete the obj of OragnisationInformationPage
		 OragnisationInformationPage oip=new OragnisationInformationPage(driver);
		 oip.organisationInformation(ORGNAME+jutil.getRandomNumber(),GROUP);
		 Thread.sleep(2000);
		 hp.Home(driver);
//		// PageFactory.initElements(driver, oip);
//		 //To enter oragnisation name
//		 oip.getOrganizationname().sendKeys(ORGNAME+jutil.getRandomNumber());
//		 //Click on group radio button
//		 oip.getAssigntype().click();
//		 
//		//Select support group in the dropdown
//		 wutil.handledropdown(oip.getDropdown(), GROUP);
//		 
//		 //click on save btn
//		 oip.getSave().click();
//		 //Mouseover on img
//		 Thread.sleep(2000);
//		 wutil.mouseover(driver, hp.getImage());
//		// hp.getImage()
//		 
//		 //click on signout btn
//		 hp.getSignout().click();
//		 
//		 
		 
		 
		 
		 
		 
	     
		
	}
	
	

}
