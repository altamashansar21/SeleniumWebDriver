package day28;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClosingSpecificBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
         WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		Set<String> WindowIds = driver.getWindowHandles();
		
		for (String string : WindowIds) {
			String titles =driver.switchTo().window(string).getTitle();
			System.out.println(titles);
			if (titles.equals("OrangeHRM") || titles.equals("OrangeHRM: All in One HR Software for Businesses | OrangeHRM"))
			{
				driver.close();
				break;
			}
		}

	}

}
