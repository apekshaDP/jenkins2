package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra2 {
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("https://www.myntra.com/");
		String url = d.getCurrentUrl();
		System.out.println("url");
		
	    String title = d.getTitle();
	    System.out.println(title);
	}

}
