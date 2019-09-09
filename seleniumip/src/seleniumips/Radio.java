package seleniumips;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Radio {
	public static void main(String args[])throws Exception
	{
 //System.setProperty("Webdriver.chrome.driver","D:\\sai\\chromedriver.exe");
 System.setProperty("webdriver.chrome.driver","D:\\sai\\chromedriver.exe");
 WebDriver driver=new ChromeDriver();
 driver.get("http://www.echoecho.com/htmlforms10.htm");
// driver.findElement(By.xpath("//input[@value='Butter']")).click();
// Thread.sleep(2000);
 //System.out.println(driver.findElements(By.xpath("//input[@name='group1']")).size());
 int count =driver.findElements(By.xpath("//input[@name='group1']")).size();
 for(int i=0;i<count;i++)
 {
	System.out.println(driver.findElements(By.xpath("//input[@name='group1']")).get(i));
	 }
 
}
}