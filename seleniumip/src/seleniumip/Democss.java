package seleniumip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Democss { 
	public static void main(String args[])
	{
	System.setProperty("webdriver.chrome.driver","D:\\sai\\chromedriver.exe");
	//System.setProperty("webdriver.chrome.driver","D:\\sai\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://aws.amazon.com/console/");
	//driver.findElement(By.linkText("\'https://console.aws.amazon.com/console/home?nc2=h_ct&src=header-signin\'")).click();
	
	}
}
