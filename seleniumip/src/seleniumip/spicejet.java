package seleniumip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class spicejet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\sai\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.spicejet.com");
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		int i = 1;
		while (i < 5) {
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		/*
		 * driver.findElement(By.id("hrefIncAdt")).click();
		 * driver.findElement(By.id("btnclosepaxoption")).click();
		 */
		/*
		 * for(int i=1;i<5;i++) { driver.findElement(By.id("hrefIncAdt")).click();
		 * System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		 * //driver.findElement(By.id("btnclosepaxoption")).click();
		 */

	}
}
