package day30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlesFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10))	;	
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		// Frames 1
		WebElement frame1 =driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1); 	// passed frame as a WebElement  / Switch to frame1
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Welcome");
		
		driver.switchTo().defaultContent(); 			// Go back to page 
		
		// Frames 2
		WebElement frame2 =driver.findElement(By.xpath("//frameset//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Altamash");
		
		driver.switchTo().defaultContent();		// Go back to page 
		
		// Frame 3
		WebElement frame3 =driver.findElement(By.xpath("//frameset//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Ansar");
		
		// inner iFrames - part of frame3 
		driver.switchTo().frame(0); 	// Switch to frame using index 
		//driver.findElement(By.xpath("//div[@id='i9']//div[@class='AB7Lab Id5V1']")).click();
		
		WebElement rdbutton = driver.findElement(By.xpath("//div[@id='i9']//div[@class='AB7Lab Id5V1']"));
		JavascriptExecutor Js = (JavascriptExecutor)driver;
		Js.executeScript("arguments[0].click();", rdbutton);
		
		driver.switchTo().defaultContent();
		
		// Frames 5
		WebElement frame5 = driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
		driver.switchTo().frame(frame5);
		driver.findElement(By.xpath("//input[@name='mytext5']")).sendKeys("Hello Aafee");
		
		driver.findElement(By.linkText("https://a9t9.com")).click();
		
		
		Boolean logo = driver.findElement(By.xpath("//img[@alt='Ui.Vision by a9t9 software - Image-Driven Automation']")).isDisplayed();
		System.out.println(logo);
		String tiltle = driver.getTitle();
		System.out.println(tiltle);
		
		
		driver.quit();
		
	}

}
