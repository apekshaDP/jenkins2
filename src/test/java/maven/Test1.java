 package maven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demoapp.skillrary.com/");
		
		
		//step 1:create object of fileinputtream class and in fileinputtream constructor enter the location of the external file
		FileInputStream fis=new FileInputStream("src\\test\\resources\\Data.properties") ;
		
		//step 2: create object of properties class
		Properties p=new Properties();
		
		//step3: call Load method to load or fetch the path or location of the external file
		p.load(fis);
		 //step 4: call a method getproperty(string key)to fecth the keys
		String Url =p.getProperty("https://demoapp.skillrary.com/");
		String email  = p.getProperty("Email");
		String password = p.getProperty("Password");
		
		d.findElement(By.xpath("//a[text()='LOGIN']")).click();
		d.findElement(By.id("email")).sendKeys("admin");
		d.findElement(By.id("password")).sendKeys("admin");
		
		
		


	}

}
