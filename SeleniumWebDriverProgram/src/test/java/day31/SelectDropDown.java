package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class SelectDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement  countryDropdown =driver.findElement(By.xpath("//select[@id='country']"));
		Select c = new Select(countryDropdown);
		
		// select option from the drop down 
		
		//c.selectByVisibleText("France");
		//c.selectByValue("japan");
		c.selectByIndex(5);
		
		// capture the option from drop down 

		List	 <WebElement> Option  = c.getOptions();
		System.out.println("number of option in drop down "+Option.size());
		
		/*// printing the option
		for (int i = 0; i < Option.size(); i++) {
			System.out.println(Option.get(i).getText());
			
		} */
		
		// enhanced for loop 
		for (WebElement op : Option) {
			System.out.println(op.getText());
		}
		
	}

}
