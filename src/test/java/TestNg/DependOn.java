package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DependOn {
	@Test
public void Zomato() {
		WebDriver d=new ChromeDriver();
		d.get("https://www.zomato.com/");
		String actualUrl = d.getCurrentUrl();
	    String expectedUrl = " https://www.zomato.com/pune";
	    Assert.assertEquals(actualUrl ,  expectedUrl);
		
	}
	@Test(dependsOnMethods="Zomato")
	public void Facebook() {
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");
		
	}
	
	@Test(dependsOnMethods="Zomato")
	public void Swiggy() {
		WebDriver d=new ChromeDriver();
		d.get("https://www.swiggy.com/ ");
		
	}

}
