package day37;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FilesUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		
		// Single File Upload -->
		
//		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Users\\altam\\OneDrive\\Documents\\maven-archetype-quicks.txt");
//		
//		  if (driver.findElement(By.xpath("//ul[@id='fileList']")).getText().equals("maven-archetype-quicks.txt"))
//	  		{System.out.println("File is succesfully Upload.."); 
//		 } else {
//		  System.out.println("Upload Fail");
//		  }
		  
		// Multiple Files Upload
		  
		  String file1 = "C:\\Users\\altam\\OneDrive\\Pictures\\Screenshots\\Screenshot 2026-07-31 153035.png"; 
		  String file2 = "C:\\Users\\altam\\OneDrive\\Pictures\\Screenshots\\Screenshot 2026-07-30 151247.png";
		  
		  driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"\n"+file2);
		  
		  int Upload = driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
		  
		  System.out.println(Upload);
		  
		  if (Upload==2) {
			  System.out.println("All files are upload ");
		}
		  else {
			System.out.println("Files are not upload or incorrect files uploaded");
		}

	}
	

}
