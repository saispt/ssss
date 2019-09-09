package seleniumips;


import java.util.concurrent.TimeUnit;



import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;



public class driverssetup {

 WebDriver driver;

 public WebDriver setup() {

	 System.setProperty("webdriver.chrome.driver","D:\\sai\\chromedriver.exe");

       ChromeOptions chromeOptions = new ChromeOptions();

      chromeOptions.addArguments("---disable-notifications");

      driver = new ChromeDriver(chromeOptions);

 driver.get("https://www.marshallspetzone.com");

 driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

 driver.manage().window().maximize();

 return driver;



 }

 
 }

