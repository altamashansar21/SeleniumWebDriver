package day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		// 1) css --> tag#id
//		driver.findElement(By.cssSelector("input#user-name")).sendKeys("problem_user");
		driver.findElement(By.cssSelector("#user-name")).sendKeys("problem_user");
		
		
		//2) css --> tag-name[attribute ='value']
	//	driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("secret_sauce");
		driver.findElement(By.cssSelector("[placeholder='Password']")).sendKeys("secret_sauce");
		
		
		//3) css --> tag-name.classname[attribute='value']
		driver.findElement(By.cssSelector("input.submit-button[id='login-button']")).click();
		Thread.sleep(3000);
		//4) css --> tag-name.classname
//		WebElement print =driver.findElement(By.cssSelector("div.app_logo"));
		WebElement print =driver.findElement(By.cssSelector(".app_logo"));
		System.out.println(print.isDisplayed());

}
}
