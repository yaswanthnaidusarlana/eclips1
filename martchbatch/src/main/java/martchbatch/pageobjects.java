package martchbatch;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class pageobjects {
WebDriver driver;
By Myaccountlink=By.linkText("My Account");
By loginlink=By.linkText("Login");
By email=By.id("input-email");
By password=By.id("input-password");
By loginbutton=By.xpath("//button[@type='submit']");


	public pageobjects(WebDriver driver2) {
	// To Auto-generated constructor 
this.driver=driver;
}
	public void Clickonmyaccount()
	{
		driver.findElement(Myaccountlink).click();
		
	}
	public void clickonloginlink()
	{
		driver.findElement(loginlink).click();
	}
	public void enteremail()
	{
		driver.findElement(email).sendKeys("abcd@gmail.com");
	}	
	public void enterpassword()
	{
		driver.findElement(password).sendKeys("welcome");
	}	
	public void clickonsubmit()
	{
		driver.findElement(loginbutton).click();
	}	
}

