package day38;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessTesting {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless=new");		// setting for headless mode of execution 
		
		// 1). Lunch Browser 
		WebDriver driver = new ChromeDriver(options);				// For ChromeBrowser 
		
		// 2). Open URL https://testautomationpractice.blogspot.com/
		driver.get("https://testautomationpractice.blogspot.com/");
		
		// 3). Validation Title should be   "Automation Testing Practice"
		String act_title = driver.getTitle();
		
		if (act_title.equals("Automation Testing Practice")) {
			System.out.println("Test Pass");
		} else {
			System.out.println("Test Failed");
		}
		
		 // 4). Close Browser 
		//		driver.close();
	   //		driver.quit();

	}

}
