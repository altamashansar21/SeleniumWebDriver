package day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");
		
		WebElement Box1 = driver.findElement(By.xpath("//input[@id='field1']"));
		WebElement Box2 = driver.findElement(By.xpath("//input[@id='field2']"));
		WebElement button = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		
		Box1.clear();
		Box1.sendKeys("Welcome");
		
		// double click
		Actions act = new Actions(driver);
		act.doubleClick(button).perform();
		
		String text = Box2.getAttribute("value");
		System.out.println("Print Box1 Text :"+text);
		
		
		if (text.equals("Welcome")) {
			System.out.println("Text copied");
		}
		else {
			System.out.println("Text Not Copied Properly..");
		}
		
		
		

	}

}
