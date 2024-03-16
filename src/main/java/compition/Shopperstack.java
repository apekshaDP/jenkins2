package compition;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shopperstack {
	public static void main(String[] args) {
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.shoppersstack.com/");
		d.findElement(By.xpath("//button[text()='Login']")).click();
	}

}
