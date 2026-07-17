package day32;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		// 1). find total number of row in a tables 
			int row =driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr")).size();		// multiple tables 
		//	int row = driver.findElements(By.tagName("tr")).size();	 								//single table 
		 
			System.out.println("Number of row : " + row );
		
		// 2). find total number of columns in a table 
		
			   int columns = driver.findElements(By.xpath("//table[@name='BookTable']//tr//th")).size();		// multiple table 
			
			// int columns = driver.findElements(By.tagName("th")).size();										// single table 
			   System.out.println("Numbe of columns : " + columns);
			   
			   
	    // 3) read data from specific row and column ( ex: 5th row and 1 column )
			   
			String booktable= driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
			System.out.println(booktable + "\n");
		
	    // 4).  read data from All row and column	
			
			 /*for (int r =2; r<=row; r++)
			{
				for(int c =1; c<=columns; c++)
				{
					String vlaue= driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
					System.out.print(vlaue+"\t");
				}
				System.out.println(" ");
			} */
			
		// 5). Print Book name whose author is mukesh
			/*
			for(int r =2; r<=row; r++)
			{
				String Author =driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
				if (Author.equals("Amit")) {
					String AuthorBook =driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
					System.out.println(AuthorBook+"\t"+Author);
				}
			}	*/
			
		// 6). find total price of all the book 
			
			
		
			int table = 1;
			for(int r =2; r<=row; r++)
			{
				String Book =driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
				
				table = table+Integer.parseInt(Book);
				System.out.println("Total price of the book : "+table);
				}
			
			
	}

}
