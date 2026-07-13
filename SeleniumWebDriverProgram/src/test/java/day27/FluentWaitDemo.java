package day27;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		// Fluent Wait 
				Wait<WebDriver> my = new FluentWait<WebDriver>(driver)
						.withTimeout(Duration.ofSeconds(30))
						.pollingEvery(Duration.ofSeconds(5))
						.ignoring(NoSuchElementException.class);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		
			WebElement f=	my.until(new Function<WebDriver, WebElement >() {
					public WebElement apply(WebDriver driver) {
						return driver.findElement(By.xpath("//input[@placeholder='Username']"));
					}
				});
			f.sendKeys("Admin");
			
		
		//driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		//driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.close();
		

	}

}
