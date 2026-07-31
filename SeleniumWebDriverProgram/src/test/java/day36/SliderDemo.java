package day36;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		
		Actions act =  new Actions (driver);
		
		// Minimum slider
		WebElement min_slider =driver.findElement(By.xpath("//div[@class='price-range-block']//span[1]"));
		
		 System.out.println("Location of the min Slider Befor Moving :" + min_slider.getLocation()); //(59, 247)
		 act.dragAndDropBy(min_slider, 20, 247).perform();
		 
		 System.out.println("Location of the min Slider After Moving :" + min_slider.getLocation()); //(80, 247)
		 
		 // Maximum slider 
		 WebElement max_slider = driver.findElement(By.xpath("//div[@class='price-range-block']//span[2]"));
		 //Point p = max_slider.getLocation();
		 System.out.println("Location of the max Slider Befor Moving :"+ max_slider.getLocation());		// (600, 247)
		 act.dragAndDropBy(max_slider, -100, 247).perform();
		 System.out.println("Location of the max Slider After Moving :"+ max_slider.getLocation());		// (497, 247)

	}

}
