package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		// X-path with single attribute --->
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("problem_user");
		
		
		// X-path with Multiple attribute ---> 
		driver.findElement(By.xpath("//input[@placeholder='Password'] [@id='password']")).sendKeys("secret_sauce");
		
		Thread.sleep(2000);
		// X-path with "and", "or" operators 
		//driver.findElement(By.xpath("//*[@id='login-button' and @ data-test='login-button']")).click(); ---> and 
		driver.findElement(By.xpath("//*[@id='login-button' or @ data-test='logon']")).click(); // -----> or
		
		Thread.sleep(3000);
		
		// X-path with text() ----->
		//driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).click();
		boolean displaycondions =driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).isDisplayed();
		System.out.println(displaycondions);
		
		String s =driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).getText();
		System.out.println(s);
		
		// X-path with contains ----->
		//driver.findElement(By.xpath("//button[contains(@id,'react-burger-m')]")).click();
		
		//Thread.sleep(2000);
		
		// X-path with starts-with
		//driver.findElement(By.xpath("//a[starts-with(@id,'logout')]")).click();
		
		// Chain X-path
		String ss =driver.findElement(By.xpath("(// div[@class='inventory_item_label'] )[6]//a")).getText();
		System.out.println(ss);

	}

}
