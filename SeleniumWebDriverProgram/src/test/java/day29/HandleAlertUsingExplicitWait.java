package day29;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

// Handle Alert without using switch().alert();
// using single Explicit wait .


public class HandleAlertUsingExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait Mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		
		Thread.sleep(3000);
		
		Alert alert = Mywait.until(ExpectedConditions.alertIsPresent());		// capture the alert 
		
		Alert myAlert =driver.switchTo().alert();
		System.out.println(myAlert.getText());
		alert.accept(); 
		

	}

}
