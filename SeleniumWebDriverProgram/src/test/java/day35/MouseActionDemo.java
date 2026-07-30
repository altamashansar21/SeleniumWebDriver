package day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().window().maximize();
		
		WebElement freeEBook =driver.findElement(By.xpath("//a[@class='no_border'][normalize-space()='Free Ebooks']"));
		
		WebElement FreeMachine = driver.findElement(By.xpath("//span[normalize-space()='Free Machine Learning Ebooks']"));
				
		WebElement freeDeep = driver.findElement(By.xpath("//span[normalize-space()='Free Deep Learning eBooks']"));
		Actions act = new Actions(driver);
		
		// Mouse hover
		//act.moveToElement(freeEBook).moveToElement(FreeMachine).moveToElement(freeDeep).build().perform();
		
		act.moveToElement(freeEBook).moveToElement(FreeMachine).moveToElement(freeDeep).click().perform();

	}

}
