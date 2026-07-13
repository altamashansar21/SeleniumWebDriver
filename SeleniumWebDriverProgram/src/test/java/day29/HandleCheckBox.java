package day29;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");

		// 1). Select specific CheckBox 
		//driver.findElement(By.cssSelector("input#sunday")).click();
		
		// 2). Select all the CheckBoxes 
		
	List<WebElement> Checkbox =	driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
	
	/*for (int i = 0; i < Checkbox.size(); i++) {
		
		Checkbox.get(i).click(); 
	}*/ 
	
	/*for (WebElement Box : Checkbox) {
		
		Box.click();
	}c
	*/
	
	
	//3).  Select last 3 check box
	// total no. of checkBoxs how many checkBoxes want to selected = starting index
	// 7-3=4 (Starting Index)
	
	/*for (int i = 4; i < Checkbox.size(); i++) {
		Checkbox.get(i).click();
	}*/
	
	//4).  Select First 3 check box
	
	/*for (int i = 0; i < 3; i++) {
		Checkbox.get(i).click();
	} */
	
	//5). UnSelect the checkBoxes if they are selected 
	
	/*for (int i = 0; i < 3; i++) {
		Checkbox.get(i).click();
	}
	Thread.sleep(3000);
	
	for (WebElement Box :Checkbox) {
		if (Box.isSelected()) {
			Box.click();
		} 
	
	
		
	}*/
	
	
	// 6).
	
	for (int i = 0; i < Checkbox.size(); i++) {
		
		if (i ==0 || i==2 || i==4) {
			Checkbox.get(i).click();
		}
	}
	}

}
