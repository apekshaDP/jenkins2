package objectRepository;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonUtils.WebDriverUtil;

public class HomePage extends WebDriverUtil{
	
	
	public WebDriver driver;
	
	//identify oraganisation module
	@FindBy(xpath="(//a[text()='Organizations'])[1]")
	 private WebElement Organization;
	
	//identify contact module
	@FindBy(xpath="//a[text()='Contacts']")
	 private WebElement contact;
	
	
	public WebElement getOrganization() {
		return Organization;
	}





	public WebElement getContact() {
		return contact;
	}
	
	

	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	 private WebElement image;
	



	public WebElement getImage() {
		return image;
	}





	public WebElement getSignout() {
		return signout;
	}
	public HomePage(WebDriver driver) {
	 PageFactory.initElements(driver, this);
	}
	 public OrganistionPage Home() {
		 //click on Organisations
		 Organization.click();
		 return new OrganistionPage(driver);
	 }
		 public LoginPage Home(WebDriver driver) {
		 //mousehover on image
		 
		 mouseover(driver,image);
		 signout.click();
		 return new LoginPage(driver);
		 }
		 
		 
	 




	//identify image module
		
	
	
	
	
	//identify signout module
	@FindBy(xpath="//a[text()='Sign Out']")
	 private WebElement signout;
	
	
	
	


}






































