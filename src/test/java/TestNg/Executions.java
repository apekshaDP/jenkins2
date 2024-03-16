package TestNg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Executions {
	@Test(priority=0,invocationCount=2)
	public void Facebook() {
		//System.out.println("facebook");
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");
		
	}
	@Test(priority=1,invocationCount=3)
	public void Amazon() {
		//System.out.println("amazon")
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.amazon.in/");
		
		
	}
	@Test(priority=2,invocationCount=1)
	public void Myntra() {
		//System.out.println("amazon")
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.myntra.com/");
		
		
	}

}
