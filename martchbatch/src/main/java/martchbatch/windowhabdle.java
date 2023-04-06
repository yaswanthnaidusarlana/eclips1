package martchbatch;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowhabdle {
private static final String Windowhandle = null;

public static void main(String[] args) {
	WebDriverManager.edgedriver().setup();
	WebDriver driver=new EdgeDriver();
	driver.get("https://letcode.in/windows");
	String windowhan=driver.getWindowHandle();
	
	
	System.out.println("first Window:"+Windowhandle);
	driver.findElement(By.id("multi")).click();
	List<string> l1=new ArreyList<String>(driver.getWindowHandles());
	System.out.println(l1.size());
	for(int i=0;i<l1.size();i++)
	{
		System.out.println(l1.get(i));
		driver.switchTo().window(l1.get(i));
		System.out.println("The url is:"+driver.getCurrentUrl());
	}

	driver.close();
	driver.quit();

}
}