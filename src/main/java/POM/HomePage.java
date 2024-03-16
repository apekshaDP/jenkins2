package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	//identify contact module
		@FindBy(xpath="//a[text()='Contacts']")
		 private WebElement contact;
		@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
		 private WebElement image;
		//identify signout module
		@FindBy(xpath="//a[text()='Sign Out']")
		 private WebElement signout;
		public WebElement getContact() {
			return contact;
		}
		public WebElement getImage() {
			return image;
		}
		public WebElement getSignout() {
			return signout;
		}
		public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
		public void Home() {
			contact.click();
		}
		
}
