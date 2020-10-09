import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapability {

	public static void main(String[] args) {
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("ignoreProtectedModeSettings", true);
		
		 System.setProperty("webdriver.ie.driver","./drivers/IEDriverServer.exe");
		 WebDriver driver=new InternetExplorerDriver(cap);
		 
		 driver.get("https://www.google.com/");
		 driver.findElement(By.name("q")).sendKeys("A");
		 driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		
		 driver.close();
		 System.out.println("test completed succsessfully");	        

	}

}
