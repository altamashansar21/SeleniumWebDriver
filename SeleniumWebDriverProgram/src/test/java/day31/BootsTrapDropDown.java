package day31;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootsTrapDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://mdbootstrap.com/docs/standard/extended/multiselect/");
		driver.manage().window().maximize();
		
		// select single option
		
		driver.findElement(By.xpath("//div[@id='select-dropdown-container-766499']//div[3]")).click();

	}

}
