package day28;

import java.net.MalformedURLException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCondtionMethod {

	public static void main(String[] args) throws MalformedURLException {
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://demowebshop.tricentis.com/");   // accept URL only in the String format.
		
//		URL myurl = new URL ("https://demowebshop.tricentis.com/");
//		driver.navigate().to(myurl);
		
		driver.navigate().to("https://demowebshop.tricentis.com/");
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().refresh();
		

	}

}
