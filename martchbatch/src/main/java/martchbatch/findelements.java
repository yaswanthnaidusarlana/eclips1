package martchbatch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class findelements {
public static void main(String[] args) {
	WebDriverManager.edgedriver().setup();
	WebDriver driver=new EdgeDriver();
	driver.get("https://demo.opencart.com/");
	driver.findElement(By.linkText("My Account")).click();
	driver.findElement(By.linkText("Login")).click();
	List l1=driver.findElements(By.xpath("//a[@class='list-group-item']"));
	
	System.out.println("list count is: "+l1.size());
	int i;
	for(i=0;i<l1.size();i++)
		
	{
		System.out.println("list count is: "+l1.indexOf(i));
		
	}
}
}
