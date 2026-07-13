package day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionMethodDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		// isDisplayed(); ---->
		
		//WebElement Display =driver.findElement(By.xpath("(//img[ contains(@alt,'Picture of $25 Virtual Gift Card')]/ancestor::div)[10]"));
		//System.out.println(Display.isDisplayed());
		
		boolean Display =driver.findElement(By.xpath("(//img[ contains(@alt,'Picture of $25 Virtual Gift Card')]/ancestor::div)[10]")).isDisplayed();    
		System.out.println(Display);
		
		// isEnabled(); ---->
		boolean is = driver.findElement(By.xpath("//input[@id='small-searchterms']")).isEnabled();
		System.out.println(is);
		
		boolean as = driver.findElement(By.xpath("//input[@value='Search']")).isEnabled();
		System.out.println(as);
		
		
		// isSelected ------>
		WebElement Excellent=	driver.findElement(By.xpath("//*[@id=\"pollanswers-1\"]"));
		WebElement Good=	driver.findElement(By.xpath("//*[@id=\"pollanswers-2\"]"));
		
		System.out.println("Befor Selection......");
		System.out.println(Excellent.isSelected());   // false
		System.out.println(Good.isSelected());		//  false
		
		
		System.out.println("After Selection Good");
		Good.click();
		
		System.out.println(Excellent.isSelected());		// false 
		System.out.println(Good.isSelected());			// True 
		
		
		System.out.println("After Selection Excellent");
		Excellent.click();
		
		System.out.println(Excellent.isSelected());		// false 
		System.out.println(Good.isSelected());			// True 
		
		
		
		
		
		

	}

}
