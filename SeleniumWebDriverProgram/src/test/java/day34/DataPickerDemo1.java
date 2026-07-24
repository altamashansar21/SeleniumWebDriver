package day34;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataPickerDemo1 {
	
	// Select Future Date 
	static void selectFutureDate (WebDriver driver , String month , String year, String date)
	{
		// select month & Year 
		
				while (true) {
					String currentMonth =driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText(); // actual month
					String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();  // actual year 
					if (currentMonth.equals(month) && currentYear.equals(year)) {
						break;
					}
					driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); // Next
					//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click(); // previous 
				}
				
				
				List <WebElement> alldates =driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td/a"));
				for (WebElement dt : alldates) {
					
					if (dt.getText().equals(date)) {
						dt.click();
						break;
					}
				}
		
	}
	
	static void selectPastDate (WebDriver driver , String month , String year, String date)
	{
		
		// select month & Year 
		
		while (true) {
			String currentMonth =driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText(); // actual month
			String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();  // actual year 
			if (currentMonth.equals(month) && currentYear.equals(year)) {
				break;
			}
			//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); // Next
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click(); // previous 
		}
		
		
		List <WebElement> alldates =driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td/a"));
		for (WebElement dt : alldates) {
			
			if (dt.getText().equals(date)) {
				dt.click();
				break;
			}
		}
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		// Switch to frame --->
		driver.switchTo().frame(0);
		
		// Method 1. using sendKey --->
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("04/05/2024");
		
		// Method 2. Using data picker
		// expected date 
	
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		selectFutureDate(driver,"May","2027","13");
		
		
		
		

	}

}
