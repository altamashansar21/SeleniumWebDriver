package day22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    
	    // name---->
	    driver.findElement(By.name("user-name")).sendKeys("standard_user");
	    
	    // id ----->
	    driver.findElement(By.id("password")).sendKeys("secret_sauce");
	    
	    
	    // className --->
	    driver.findElement(By.className("submit-button")).click();
	    
	    Thread.sleep(2000);
	    
	    // LinkText & PartialLinkText ---->
	    //driver.findElement(By.linkText("Sauce Labs Backpack")).click();	 // ---->     LinkText
	     // driver.findElement(By.partialLinkText("Sauce")).click();
	      
	      // tag-name
	    List <WebElement> img = driver.findElements(By.tagName("img"));
	    System.out.println(img.size());
	    
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[text()='Add to cart']")).click();

	}

}
