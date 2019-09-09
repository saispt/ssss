package seleniumip;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("Webdriver.chrome.driver","D:\\sai\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","D:\\sai\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://login.salesforce.com/?locale=in");
		driver.findElement(By.xpath("//*[@type='email']")).sendKeys("saispt94@gmail.com");
		driver.findElement(By.xpath("//*[@name='pw']")).sendKeys("sss");
		driver.findElement(By.xpath("//*[@type='submit']")).click();

}
}
