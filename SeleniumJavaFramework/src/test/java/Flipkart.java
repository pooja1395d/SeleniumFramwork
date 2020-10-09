import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();    //a. open the browser
		driver.get("https://www.flipkart.com/");  //b. navigate to flipkart
		driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']")).sendKeys("8601410119"); //c. enter phone number
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("azam2996");  //d. enter password
	
		
		driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']//span[contains(text(),'Login')]")).click();    // e. click login button
		System.out.println("User is logged in successfully");  //verify the user is logged in successfully
        driver.close();
		driver.quit();   // close the browser
		
	}

}
