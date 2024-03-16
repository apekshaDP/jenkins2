package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(name="user_name")
	 private WebElement Usernametf;
	
	
	//identify password 
	@FindBy(name="user_password")
	 private WebElement Passwordtf;
	public WebElement getUsernametf() {
		return Usernametf;
	}
	public WebElement getPasswordtf() {
		return Passwordtf;
	}
	public WebElement getLoginbtn() {
		return loginbtn;
	}
	
	
		//identify loginbutton
		@FindBy(id="submitButton")
		 private WebElement loginbtn;
		
		public LoginPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
			
		}
		
		public void Login(String Userdata,String passwordData) {
			Usernametf.sendKeys(Userdata);
			Passwordtf.sendKeys(passwordData);
			loginbtn.click();
		}

}
