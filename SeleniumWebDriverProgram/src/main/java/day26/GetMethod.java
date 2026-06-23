 package day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		// get(Url)---->
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
//		WebElement Uname =driver.findElement(By.xpath("//*[starts-with(@placeholder,'Username')]"));
//		Uname.sendKeys("Admin");
//		WebElement Pass = driver.findElement(By.xpath("//*[contains(@placeholder,'P')]"));
//		Pass.sendKeys("admin123");
//		WebElement login = driver.findElement(By.xpath("//button[contains(.,'L')]"));
//		login.click();
		
			
		WebElement title = driver.findElement(By.xpath("//h5[text()='Login']"));
		// getText()
		System.out.println(title.getText());
		// getTitle()
		System.out.println(driver.getTitle());
		// getPageSource()
		System.out.println(driver.getPageSource());
		// getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		
		// getWindowHandle() -----> single browser window 
		System.out.println("id  :-"+driver.getWindowHandle());
		//driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
		
		// getWindowHandles() -----> multiple browser window 
	//	System.out.println("multipale");
	//	System.out.println(driver.getWindowHandles());
		
		// getAttribute 
		WebElement atti =driver.findElement(By.xpath("//*[contains(@placeholder,'U')]"));
		atti.sendKeys("Altamash");
		String v = atti.getAttribute("value");
		System.out.println(v);
		
		

	}

}
