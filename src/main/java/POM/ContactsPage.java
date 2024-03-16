package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage {
	

	@FindBy(xpath="//img[@alt='Create Contact...']")
	 private WebElement CreateContact;

	public WebElement getCreateContact() {
		return CreateContact;
	}
	 public ContactsPage(WebDriver driver) {
	 PageFactory.initElements(driver, this);
	 }
	 public void ContactsPage() {
		 CreateContact.click();
	 }


}
