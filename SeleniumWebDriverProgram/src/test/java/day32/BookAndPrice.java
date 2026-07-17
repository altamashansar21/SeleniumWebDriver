package day32;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookAndPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the book name : ");
		String bookname = sc.nextLine();

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		// rows 
		int row =driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr")).size();
		

		for(int r =2; r<=row; r++)
		{
			String Book =driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
			
			if (Book.equalsIgnoreCase(bookname)) {
				
				String price =driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
				System.out.println(Book+"\t"+price);
			}
		}

		sc.close();
	}

}
