package martchbatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
	public class pagefactory1 {


WebDriver driver; //By myaccountlink-By.linkText("My Account");

@FindBy(linkText="My Account")

WebElement myaccountlink; //By loginlink-By.linkText("Login");

@FindBy(linkText="Login") WebElement loginlink;

//By email-By.id("input-email");

@FindBy(id="input-email")

WebElement email;

//By password=By.id("input-password"); @FindBy(id="input-password") WebElement password;

//By loginbutton=By.xpath("//button[@type='subm

@FindBy(xpath="//button[@type='submit']")

WebElement loginbutton;

private Object password;



	
	public void clickonmyaccount() {

		(myaccountlink).click();

		}

		public void clickonloginlink() {

		(loginlink).click();

		}

		public void enteremail()

		{

		(email).sendKeys("march@gmail.com");

		}

		public void enterpassword() 

		{
		((WebElement) password).sendKeys("welcome");

		}

		public void clickonsubmit()
		{

		(loginbutton).click();
		}
		}
		
