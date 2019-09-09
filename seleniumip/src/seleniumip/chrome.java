package seleniumip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.session.ChromeFilter;

public class chrome {
public static void main(String args[])
{
	System.setProperty("webdriver.chrome.driver","D:\\sai\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.findElement(By.cssSelector("#email")).sendKeys("8985583386");
	driver.findElement(By.cssSelector("#pass")).sendKeys("sssyadav");
	//driver.findElement(By.cssSelector("#u_0_8")).click();
	driver.findElement(By.xpath("//*[@id=\"u_0_6\"]")).click();
	
}
}
