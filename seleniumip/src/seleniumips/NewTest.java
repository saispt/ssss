package seleniumips;



import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;


import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.Listeners;



import java.io.File;

import java.io.IOException;



//import org.apache.commons.io.FileUtils;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebElement;

import org.testng.annotations.AfterTest;


public class NewTest extends driverssetup{

 @BeforeTest

 public void beforeTest() throws IOException {

  driver=setup();

//  TakesScreenshot ts =(TakesScreenshot)driver;
//
//  File src =ts.getScreenshotAs(OutputType.FILE);
//
//  FileUtils.copyFile(src, new File("D:\\sai\\sss\\seleniumip\\screenshots\\homepage.png"));

  

 }

 @Test

 public void f() throws InterruptedException {

  driver.findElement(By.xpath("//*[@id=\"cbp-hrmenu-tab-14\"]/a/span")).click();

  Thread.sleep(2000);

  driver.findElement(By.xpath("//*[@id=\"left-column\"]/div[1]/div/ul/li[3]/a")).click();

  Thread.sleep(2000);

  driver.findElement(By.xpath("//*[@id=\"left-column\"]/div[1]/div/ul/li/a")).click();

  driver.findElement(By.xpath("//*[@id=\"js-product-list\"]/div/div[1]/article/div[1]/a/img")).click();

  driver.findElement(By.xpath("//*[@class=\"btn btn-primary btn-lg add-to-cart\"]")).click();

  Thread.sleep(2000);

// WebElement frame = driver.findElement(By.name("f24dcee8c7b9ce"));

// driver.switchTo().frame(frame);

// driver.findElement(By.xpath("//*[@class=\"_2t-5\"]")).click();

// Thread.sleep(2000);

 // driver.switchTo().defaultContent();

  //driver.findElement(By.xpath("//*[text()='Continue shopping']")).click();

 //*[text()='Continue shopping']

  

  

  //driver.findElement(By.xpath("//a[text()='Proceed to checkout']")).click();

// JavascriptExecutor js=(JavascriptExecutor)driver;

// js.executeScript("window.scrollBy(0,2000)");

  driver.findElement(By.xpath("//button[@class=\"btn btn-secondary btn-block\"]")).click();

  Thread.sleep(2000);

  driver.findElement(By.xpath("//*[@id=\"promo-code\"]/form/div/input[3]")).sendKeys("dgfhg");

  

  JavascriptExecutor jsp = (JavascriptExecutor)driver;

  jsp.executeScript("window.scrollBy(0,400)");

  WebElement buy = driver.findElement(By.xpath("//*[@class=\"btn btn-primary btn-lg btn-block\"]"));

  buy.click();  

  Thread.sleep(1000);

  WebElement frame = driver.findElement(By.name("f24dcee8c7b9ce"));

   driver.switchTo().frame(frame);

   driver.findElement(By.xpath("//*[@class=\"_2t-5\"]")).click();

  driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/div/div[2]/div/a")).click();

  driver.findElement(By.xpath("//*[@id=\"mobile-cart-toogle\"]/i")).click();



 }

  

 @AfterTest

 public void afterTest() {

	

 }



}






