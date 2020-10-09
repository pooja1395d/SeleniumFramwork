


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Google_search;

public class GoogleSearchTest {
	private static WebDriver driver=null;
	
 public static void main(String[] args) throws InterruptedException {
	


	 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.get("https://www.google.com/");
	 
	 //driver.findElement(By.name("q")).sendKeys("Automation step by step");
	 Google_search.textBox_search(driver).sendKeys("Automation step by step");
	 
	 //driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	 Google_search.Btn_search(driver).sendKeys(Keys.RETURN);
	 


	
	 Thread.sleep(3000);
	 driver.close();
	 System.out.println("test completed succsessfully");	        
}           
}
            