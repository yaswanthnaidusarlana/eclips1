package martchbatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class login {
	public static void main(String[] args) {
		System.out.println("hello world");
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.opencart.com/");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("marchbatch@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("welcome");
		driver.findElement(By.xpath("\\button[@type='submit']")).click();
		
	}
	
}
