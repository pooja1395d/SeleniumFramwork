package test;


//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class TestNG {
 
	WebDriver driver=null;
	
	@BeforeTest
 public void setTest() {
	 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	 driver=new ChromeDriver();
}

	
	@Test
public void testPage() {
	 driver.get("https://www.google.com/");
	 driver.findElement(By.name("q")).sendKeys("Automation step by step");
	 driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
}

//List<WebElement> listOfElements=driver.findElements(By.xpath("//input"));
//int count=listOfElements.size();
//System.out.println("list of elements:"+count);

	@AfterTest
	public void tearDown() {
	 driver.close();
	 driver.quit();
	 System.out.println("test completed succsessfully");	        
         
}
}           