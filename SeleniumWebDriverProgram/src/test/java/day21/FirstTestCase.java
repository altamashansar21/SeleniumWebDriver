package day21;

import org.openqa.selenium.chrome.ChromeDriver;

/*
 	Test case ---> 
   -------------------
   1. Launch browser (chrome)
   2. Open URL :- https://www.opencart.com/index.php?route=cms%2Fdemo
   3. validate title should be 'Your store'.
   4. close browser.
 */

public class FirstTestCase {

	public static void main(String[] args) {
		
		// 1. Launch browser (chrome).
		ChromeDriver driver = new ChromeDriver();
		
		//2. Open URL :- https://www.opencart.com/index.php?route=cms%2Fdemo
		driver.get("https://www.opencart.com/index.php?route=cms%2Fdemo");
		
		//3. validate title should be 'Your store'.
		
		String act_title = driver.getTitle();
		System.out.println("Actual Title: " + act_title);
		if (act_title.equals("OpenCart - Demo"))
		{
			System.out.println("Test passed");
		}
		else {
			System.out.println("Test Failed");
		}
		
		// 4. close browser 
		driver.close();
		

	}

}
