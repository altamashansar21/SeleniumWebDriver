package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		// UserName
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		// PassWord
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		// loginButton
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).submit();
		
		// PIM click 
		driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='PIM']")).click();
		
		// click on drop down 
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[6]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]")).click();      
		Thread.sleep(5000);
		
		// select single option 
		//driver.findElement(By.xpath("//span[normalize-space()='Automaton Tester']")).click();
		
		// count number of option
		List<WebElement> hiddens = driver.findElements(By.xpath("//div[@role='listbox']//span"));
		
		System.out.println("Number of option : "+hiddens.size());
		
		
		for (WebElement op : hiddens) {
			System.out.println(op.getText());
		}
		
	}

}
