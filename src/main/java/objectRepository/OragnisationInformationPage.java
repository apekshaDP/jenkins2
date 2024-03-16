package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonUtils.WebDriverUtil;

public class OragnisationInformationPage {
	
	public WebDriver driver;
	
	WebDriverUtil wutil=new WebDriverUtil();
	@FindBy(name="accountname")
	private WebElement Organizationname;

	public WebElement getOrganizationname() {
		return Organizationname;
	}
	//Identifying group radio button
	@FindBy(xpath="(//input[@name='assigntype'])[2] ")
	private WebElement assigntype;

	public WebElement getAssigntype() {
		return assigntype;
	}
	//identifying the dropdown
	@FindBy(name="assigned_group_id")
	private WebElement dropdown;

	public WebElement getDropdown() {
		return dropdown;
	}
	
	//identify save btn
	@FindBy(xpath="(//input[@name='button'])[1]")
	private WebElement save;

	public WebElement getSave() {
		return save;
	}
	public OragnisationInformationPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//Create a Method
	public HomePage organisationInformation(String OrgName,String grpData) {
		//Enter organisation name
		
		 Organizationname.sendKeys(OrgName);
		 //click on grpbt
		 assigntype.click();
		 //select support group
		 wutil.handledropdown(dropdown,grpData );
		 //click on save btn
		 save.click();
		 return new HomePage(driver);
		 
		
	}
	
	
	
	
	

}
