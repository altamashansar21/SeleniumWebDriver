package day38;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// 1). driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
				driver.get("https://testautomationpractice.blogspot.com/#");
		driver.manage().window().maximize();
		
		// 1). Full page Screenshot 
		/*TakesScreenshot ts = (TakesScreenshot)driver;
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		File main = new File(System.getProperty("user.dir")+"\\screenshots\\full.png");
		sourceFile.renameTo(main);  // copy source file to main file  */
		
		// 2). Capture the screenshot of specific section 
		WebElement flag =driver.findElement(By.xpath("//td[@class='first columns-cell']"));

		File sourceflag = flag.getScreenshotAs(OutputType.FILE);
		File m = new File(System.getProperty("user.dir")+"\\screenshots\\flg.png");
		sourceflag.renameTo(m);
		
		// 3). Capture the Screenshot of WebElement 
		WebElement logo = driver.findElement(By.xpath("//h1[normalize-space()='Automation Testing Practice']"));
		File sourceLogo = logo.getScreenshotAs(OutputType.FILE);
		File LogoMain = new File(System.getProperty("user.dir")+"\\screenshots\\Logo.png");
		sourceLogo.renameTo(LogoMain);
		
		
	}

}
