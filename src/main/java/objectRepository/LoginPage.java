package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;
	
	//Identify the useraname tf
	@FindBy(name="user_name")
	 private WebElement Usernametf;
	
	
	//identify password 
	@FindBy(name="user_password")
	 private WebElement Passwordtf;
	//identify loginbutton
		@FindBy(id="submitButton")
		 private WebElement loginbtn;
	

	
	public WebElement getUsernametf() {
		return Usernametf;
	}



	public WebElement getPasswordtf() {
		return Passwordtf;
	}



	public WebElement getLoginbtn() {
		return loginbtn;
	}
	//create a constructor-initialize web element
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	//Create a method
	public HomePage Login(String UsernameData,String passworddata) {
	    Usernametf.sendKeys(UsernameData);
	    Passwordtf.sendKeys(passworddata);
	    loginbtn.click();
	    return new HomePage(driver);
	}
	



	
	
}
