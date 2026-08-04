package day38;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RunTestIncognitoMode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String [] {"enable-automation"});
		
		WebDriver driver = new ChromeDriver(options);			
		driver.get("https://demo.nopcommerce.com/");
		
		String act_title = driver.getTitle();
		
		if (act_title.equals("Automation Testing Practice")) {
			System.out.println("Test Pass");
		} else {
			System.out.println("Test Failed");
		}

	}

}
