package day36;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenTheLink_InNewTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://testautomationpractice.blogspot.com/#");
		driver.manage().window().maximize();
		
		WebElement About =driver.findElement(By.xpath("//a[normalize-space()='Online Trainings']"));

		Actions act = new Actions(driver);
		
		// CTRl+REGlink
		act.keyDown(Keys.CONTROL).click(About).keyUp(Keys.CONTROL).perform();
		
		// switch to registration page
		
		List<String> ids = new ArrayList<String>(driver.getWindowHandles());
		
		driver.switchTo().window(ids.get(1));
		
		String s = driver.getTitle();
		System.out.println(s);
		
		driver.switchTo().window(ids.get(0));
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Altamash");

	}

}
