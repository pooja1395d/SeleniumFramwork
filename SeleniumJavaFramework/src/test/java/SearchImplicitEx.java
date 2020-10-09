

//import java.util.List;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchImplicitEx {
 public static void main(String[] args)  {
	


	 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.google.com/");
	 
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 //default is 250 ms
	 
	 driver.findElement(By.name("q")).sendKeys("search string");
	 driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	 
	 driver.findElement(By.name("abcd")).click();
	 
//List<WebElement> listOfElements=driver.findElements(By.xpath("//input"));
//int count=listOfElements.size();
//System.out.println("list of elements:"+count);
	 driver.close();
	 System.out.println("test completed succsessfully");	        
}           
}
            