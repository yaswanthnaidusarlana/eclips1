package martchbatch;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class javascriptexecutor{
public static void main(String[] args) {
	WebDriverManager.edgedriver().setup();
	WebDriver driver=new EdgeDriver();
	driver.get("");
	
	
	 javascriptexecutor js=( javascriptexecutor)driver;
	 js.executeScript("alert(hello world);");
}

void executeScript(String string) {
	// TODO Auto-generated method stub
	
}
	
}
