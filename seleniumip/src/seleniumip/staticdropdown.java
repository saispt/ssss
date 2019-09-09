package seleniumip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class staticdropdown {

	public static void mian(String args[]) {
		System.setProperty("Webdriver.chrome.driver", "D:\\sai\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http:\\www.spicejet.com");
		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		s.selectByValue("2");
		s.selectByIndex(2);
		s.selectByVisibleText("USD");
	}
}
