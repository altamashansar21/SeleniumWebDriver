package day34;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DataPickerDamo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demoqa.com/date-picker");
		driver.manage().window().maximize();
		
	//	driver.findElement(By.xpath("//input[@id='datePickerMonthYearInput']")).clear();
		String year = "2023";
		String month = "March";
		String date = "13";
		
		WebElement Dob = driver.findElement(By.id("datePickerMonthYearInput"));

		Dob.click();
		Dob.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		Dob.sendKeys(Keys.BACK_SPACE);
		
		// Select Year 
		WebElement MonthDropDown =	driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		
		Select selectMonth = new Select(MonthDropDown);
		selectMonth.selectByVisibleText(month);
		
		// Select Mount
		WebElement YearDropDown =	driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
		Select selectYear = new Select(YearDropDown);
		selectYear.selectByVisibleText(year);
		
		List <WebElement> alldates =driver.findElements(By.xpath("//div[@class='react-datepicker__week']//div"));
		for (WebElement dt : alldates) {
			
			if (dt.getText().equals(date)) {
				dt.click();
				break;
			}
		}

	

	}

}
