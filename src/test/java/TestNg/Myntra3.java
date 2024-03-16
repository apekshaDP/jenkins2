package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Myntra3 {
	
  @Test
  public void Title() {
	  ChromeDriver d=new ChromeDriver();
	  d.get("https://www.myntra.com/");
	  WebElement element = d.findElement(By.className("desktop-searchBar"));
	  //assertTrue(boolean condition)
	  //Assert.assertTrue(element.isSelected());
	 // Assert.assertTrue(element.isDisplayed());
	  Assert.assertTrue(element.isEnabled());
	  System.out.println("Good morning");
	  
	  //element.isSelected()----False condition
	  //element.isDisplayed-----True conditon
	  //element.isEnabled()-----True condition
//
//	  String actualurl = d.getCurrentUrl();
//	  String exceptedurl="https://www.myntra.com/";
//	  //call assertEquals(boolean actual,boolean expected)
//	 Assert.assertEquals( actualurl, exceptedurl);
//	  
//	  if (actualurl.equals("https://www.myntra.com/pune")) {
//		  System.out.println("url is not matching");
//	  }
//	  else {
//		  System.out.println("url is not matching");
////	  }
//	        String actualtitle = d.getTitle();
//	        String exceptedtitle="Online Shopping for Women, Men, Kids Fashion & Lifestyle - Myntra";
//	        Assert.assertEquals(actualtitle, exceptedtitle);
//	        System.out.println(actualtitle);
	  
  }
}
