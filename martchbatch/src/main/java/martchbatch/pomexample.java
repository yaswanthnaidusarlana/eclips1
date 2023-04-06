package martchbatch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class pomexample {
	public static void main(String[] args) {
	
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
	pageobjects obj=new pageobjects(driver);
	driver.get("https://demo.opencart.com/");
	obj.Clickonmyaccount();
	obj.clickonloginlink();
	obj.enteremail();
	obj.enterpassword();
	obj.clickonsubmit();

}
}
