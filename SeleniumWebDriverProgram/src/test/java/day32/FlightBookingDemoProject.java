package day32;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FlightBookingDemoProject {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://blazedemo.com/");
		driver.manage().window().maximize();
		
		// Choose your departure_city
		WebElement departure_city = driver.findElement(By.xpath("//select[@name='fromPort']"));
		Select cityFrom = new Select(departure_city);
		cityFrom.selectByVisibleText("Mexico City");
		
		//Choose your destination_city
		WebElement destination_city = driver.findElement(By.xpath("//select[@name='toPort']"));
		Select Cityto = new Select(destination_city) ;
		Cityto.selectByValue("New York");
		
		// find flight 
		driver.findElement(By.xpath("//input[@value='Find Flights']")).submit();
		
		//
		int rows = driver.findElements(By.xpath("//table[@class='table']//tbody/tr")).size();
		
		double minPrice = Double.MAX_VALUE;
		int rowIndex =0;
		for(int r =1; r<=rows; r++)
		{
			String price = driver.findElement(By.xpath("//table[@class='table']//tr["+r+"]//td[6]")).getText();
			price = price.replace("$", "");
			double p = Double.parseDouble(price);
			if (p<minPrice) {
				minPrice=p;
				rowIndex=r;
				
			}
			
		}
		System.out.println("Minimum Price : " + minPrice);
		System.out.println("Row : " + rowIndex);
		driver.findElement(By.xpath("//table[@class='table']//tbody/tr[2]//td[1]//input")).click();
		
		// Flight form
		
		driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys("Imran khan ");
		
		driver.findElement(By.xpath("//input[@id='address']")).sendKeys("main road makarana");
		
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Makrana");
		
		driver.findElement(By.xpath("//input[@id='state']")).sendKeys("Rajesthan");
		
		driver.findElement(By.xpath("//input[@id='zipCode']")).sendKeys("341505");
		
		// Visa Card 
		WebElement card =	driver.findElement(By.xpath("//select[@id='cardType']"));
		Select visaCard = new Select(card);
		visaCard.selectByIndex(2);
		
		driver.findElement(By.xpath("//input[@id='creditCardNumber']")).sendKeys("123456789");
		
		driver.findElement(By.xpath("//input[@id='nameOnCard']")).sendKeys("Imran Khan");
		
		driver.findElement(By.xpath("//input[@value='Purchase Flight']")).submit();
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
	

	}

}
