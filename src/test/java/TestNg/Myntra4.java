package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Myntra4 {
	@Test
	public void A() {
	 ChromeDriver d=new ChromeDriver();
	 
	 d.get("https://www.myntra.com/");
	  WebElement searchTf = d.findElement(By.className("desktop-searchBar"));
	  //call assertFalse(boolean condition)
	  Assert.assertFalse( searchTf.isDisplayed() );
	  System.out.println("Good Morning");
	  
	  //element.isSelected()----True condition
	  //element.isDisplayed-----False conditon
	  //element.isEnabled()-----True condition
//
	  
	}
}
