package seleniumip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\sai\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
       // driver.get("http://google.com");
       // driver.getTitle();
       // System.out.println(driver.getTitle());
       // driver.close();
        //driver.get("https://facebook.com");
        //driver.close();
        driver.get("https://login.salesforce.com/?locale=in");
        //driver.findElement(By.xpath("/html/body/header/div[2]/div[3]/div/div[3]/div/div/div/nav/div[1]/div/div[3]/div[1]/div[6]/div/a")).click();
       // driver.findElement(By.xpath("//*[@id='username']'")).sendKeys("sai");
        driver.findElement(By.id("username")).sendKeys("sai");
       // driver.findElement(By.xpath("//*[@id='password']")).sendKeys("sais");
        driver.findElement(By.id("password")).sendKeys("sai");
        driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
        //thread.sleep(3000);
        
        
	}
}
