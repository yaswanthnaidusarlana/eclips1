package martchbatch;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class javascriptexecutor1 {
public static void main(String[] args) {
	WebDriverManager.edgedriver().setup();
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.amazon.in/");
	
	
	 javascriptexecutor js=( javascriptexecutor)driver;
	 js.executeScript("window.scrollBy(0,1500)");
	 
}
	
}



