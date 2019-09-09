package seleniumips;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sync {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\sai\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// driver.get("https://www.alaskaair.com/hotels/mp/home/en/?utm_source=alaska&utm_medium=partner-page&utm_campaign=alaska-homepage-bookingformlet-hotelstab-Q12019-home-tr");
		//driver.get("http://www.oyorooms.com/?utm_source=Social_O_web&utm_medium=11&utm_content=102b8ef756827a0334756cc9670c55&utm_term=102d0ab9229599b8971125267e7796");
		//WebElement src=driver.findElement(By.id("autoComplete__home"));
		//src.sendKeys("T Nagar,Chennai, Tamil Nadu");
		//src.sendKeys(Keys.TAB);
		/*driver.findElement(By.id("autoComplete__home")).sendKeys(Keys.ENTER);
		/*src.sendKeys(Keys.ENTER);
		
		/*driver.findElement(By.id("autoComplete__home")).sendKeys("chennai");
		
	    driver.findElement(By.id("autoComplete__home")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[contains@class.oyo-cell oyo-cell--3-col oyo-cell--4-col-tablet oyo-cell--4-col-phone]")).sendKeys("keys.ENTER");
		driver.findElement(By.xpath("//*[contains@class.u-textCenter searchButton searchButton--home]")).click();
	/*	WebElement source=driver.findElement(By.id("autoComplete__home)"));
		source.sendKeys("chennai");
		Thread.sleep(1000);
		source.sendKeys(Keys.ENTER);*/
		
		driver.get("https://www.cheapoair.com/flights/booknow/destinations/states?state-code=AK&fpaffiliate=coa-google-destination&fpsub=&utm_campaign=Destination-Destinations_Exact_1_ATLAS&utm_term=alaska%20flight&utm_term_id=kwd-360859158&utm_source={google}&utm_medium={cpc}&device=c&fpprice=$241&campaignID=1671901396&adgroupId=67743271634&gclid=EAIaIQobChMI_9ylubfo4wIVjIBwCh199gsvEAAYASAAEgKdpPD_BwE");
		driver.findElement(By.xpath("//*[contains@Enter a city, airport or landmark]")).sendKeys("NYC");
		driver.findElement(By.xpath("//*[contains@Enter a city, airport or landmark]")).sendKeys(Keys.TAB);
		
		
		
		
		
		
	
	}

}