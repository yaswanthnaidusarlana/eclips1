package martchbatch;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alert {
public static void main(String[] args) {
	WebDriverManager.edgedriver().setup();
	WebDriver driver=new EdgeDriver();
	driver.get("https://letcode.in/alert");
	driver.findElement(By.id("accept")).click();
Alert simplealert=driver.switchTo().alert();
System.out.println("Alert Text:"+simplealert.getText());
simplealert.accept();
}
}
