package day38;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleSSL {

	public static void main(String[] args) {
		
		ChromeOptions opation = new ChromeOptions();
		opation.setAcceptInsecureCerts(true);		// accept SSL Certificate 
	
		
		WebDriver driver = new ChromeDriver(opation);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		System.out.println("Title of the page :"+driver.getTitle()); 	// Privacy error 

	}

}
