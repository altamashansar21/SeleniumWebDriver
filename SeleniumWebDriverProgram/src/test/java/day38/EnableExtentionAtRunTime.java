package day38;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EnableExtentionAtRunTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions option = new ChromeOptions();
		File file = new File ("--load-extension=C:\\Users\\altam\\CRX\\uBlock-Chrome-Web-Store");
		option.addExtensions(file);
		
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		

	}

}
