package day37;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		//ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/#");
		driver.manage().window().maximize();
		
		WebElement Name = driver.findElement(By.xpath("//input[@id='name']"));
		
		// Passing the text into Name - alternate of sendKeys()
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//JavascriptExecutor js = driver;
		js.executeScript("arguments[0].setAttribute('value','altamash')",Name);
		
		
		//
		
		WebElement InBox = driver.findElement(By.xpath("//input[@id='male']"));
		js.executeAsyncScript("arguments[0].click()",InBox);

	}

}
