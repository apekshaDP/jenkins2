package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganistionPage {
	
	public WebDriver driver;
	@FindBy(xpath="//img[@alt='Create Organization...']")
	 private WebElement CreateOrganization;

	public WebElement getCreateOrganization() {
		return CreateOrganization;
	}
	public OrganistionPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//Create a Method
	public OragnisationInformationPage  Organisations() {
		//click on Oranisation...(+)
		CreateOrganization.click();
		return new OragnisationInformationPage(driver);
	}
	
	
	
	
	

}
