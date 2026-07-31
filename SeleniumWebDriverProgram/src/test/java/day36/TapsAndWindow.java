package day36;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TapsAndWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		
		// Selenium4.X
		driver.get("https://testautomationpractice.blogspot.com/#");
		
		//driver.switchTo().newWindow(WindowType.TAB);		// Open new tab
		driver.switchTo().newWindow(WindowType.WINDOW);		
		driver.get("https://text-compare.com/");
		
	}

}
