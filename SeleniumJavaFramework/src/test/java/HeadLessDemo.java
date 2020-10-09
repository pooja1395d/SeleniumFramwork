import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessDemo {

	
	public static void main(String[] args) {
		test();
	}
	
	public static void  test() {
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 
		 ChromeOptions option=new ChromeOptions();
		 option.addArguments("--headless");
		 
		 WebDriver driver=new ChromeDriver(option);
		 driver.get("https://www.google.com/");
		 
		 driver.findElement(By.name("q")).sendKeys("Auto");
		 driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		
		 driver.close();
		 driver.quit();
		 System.out.println("completed");
	}

	
}

