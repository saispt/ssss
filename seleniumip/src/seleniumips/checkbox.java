package seleniumips;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {
public static void main(String args[]) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","D:\\sai\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.spicejet.com");
	System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
	driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
	System.out.println(driver.findElement(By.id("input[id*='SeniorCitizenDiscount']")).isSelected());
	//count no of check boxes
	System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
	driver.findElement(By.id("divpaxinfo")).click();
	Thread.sleep(2000);
}
}
