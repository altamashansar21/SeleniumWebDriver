package day28;

import java.time.Duration;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		Set <String> WindowIds =driver.getWindowHandles();
		
		//Approch1.
		/*List <String> windowlist = new ArrayList<> (WindowIds);
		
		String parent = windowlist.get(0);
		String child = windowlist.get(1);
		
		// Switch to child window 
		driver.switchTo().window(child);
		System.out.println(driver.getTitle());
		
		// Switch to parent window 
		driver.switchTo().window(parent);
		System.out.println(driver.getTitle()); */
		
		// Approach 2. 
		
		for (String WinID : WindowIds) {
			String titile =driver.switchTo().window(WinID).getTitle();
			
			if (titile.equals("OrangeHRM")) {
				System.out.println(driver.getCurrentUrl());
			} else {
				System.out.println(driver.getCurrentUrl());
			}
		}

	}

}
