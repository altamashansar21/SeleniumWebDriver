package day25;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_AxesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().window().maximize();
		
		// self --> select the current node.
		String self =driver.findElement(By.xpath("//a[text()='Kirloskar Oil Engine']/self::a")).getText();
		System.out.println("Self : "+self);
		
		// parent ---> select the parent node of the current node (always one) 
		String parent =driver.findElement(By.xpath("//a[text()='KSB']/parent::td")).getText();
		System.out.println("Parent : "+parent);
		
		// child ---> Select all children of the current node (One or Many)
		
		List <WebElement> child = driver.findElements(By.xpath("//tbody/child::tr"));
		System.out.println("Number of Child element :"+child.size());
		
		// Ancestor ---> Select all ancestor (parent GrandParent etc. )
		
		String text = driver.findElement(By.xpath("//a[text()='NHPC']/ancestor::tr")).getText();
		System.out.println("Ancestor : "+text);
		
		// Descendant  ---> Select all Descendant (Child, GrandChilder etc. )
		
		List <WebElement> Descendant = driver.findElements(By.xpath("//tbody/descendant::tr"));
		System.out.println("Number of Descendant node : "+Descendant.size());
		
		// Preceding-Sibling ---> select all sibling before the current node  
		
		List <WebElement> Preceding_Sibling = driver.findElements(By.xpath("//a[text()='Cipla']/ancestor::tr/preceding-sibling::tr"));
		System.out.println("Number of Preceding-sibling : "+Preceding_Sibling.size());
		
		// Following-sibling ---> select all sibling after the current node
		List <WebElement> Following_sibling = driver.findElements(By.xpath("(//td/following-sibling::td) "));
		System.out.println("Number of Following-sibling node : "+Following_sibling.size());
		
		// Preceding -->> select all nodes that appear before the current node in the document
		List <WebElement> preceding = driver.findElements(By.xpath("//a[text()='IDBI Bank']/preceding::tr"));
		System.out.println("Number of Preceding nodes : "+preceding.size());
		
		
		
		// Following ---> selects everything in the document after the closing tag of the current node 
		List <WebElement> Following = driver.findElements(By.xpath("//a[text()='IDBI Bank']/following::tr"));
		System.out.println("Number of Following nodes : "+Following.size());
		
		
		
	}

}
