package POM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactInformationPage {
	
	
	@FindBy(name="firstname")
	 private WebElement firstname;

	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	@FindBy(name="lastname")
	 private WebElement lastname ;
	
	@FindBy(xpath="(//input[@name='assigntype'])[2]")
	  private  WebElement assigntype;

	public WebElement getAssigntype() {
		return assigntype;
	}
	@FindBy(xpath="//select[@name='assigned_group_id']")
	private WebElement dropdown;

	public WebElement getDropdown() {
		return dropdown;
	}
	@FindBy(xpath="(//input[@name='button'])[1]")
	private WebElement save;

	public WebElement getSave() {
		return save;
	}
	public ContactInformationPage(WebDriver driver) {
		 PageFactory.initElements(driver, this);
	}
	



}
