package day29;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		//1). Normal Alert with OK Button 
		
		/*driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		
		Thread.sleep(3000);
		
		Alert myAlert =driver.switchTo().alert();
		System.out.println(myAlert.getText());
		myAlert.accept(); */
		
		// 2). Confirmation Alert - OK & Cancel 
		
		/* driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();			// Close alert using Ok button
		//driver.switchTo().alert().dismiss();			// close alert using cancel button 
		
		 */
		
		// 3). Prompt alert - input box
		
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		
		Thread.sleep(3000);
		Alert my =driver.switchTo().alert();
		
		my.sendKeys("Welcome");
		Thread.sleep(3000);
		my.accept();
		 
	}
	
}
