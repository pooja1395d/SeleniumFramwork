import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
public class ExtentDemo1 {
 private static WebDriver driver=null;
	
 public static void main(String[] args) {
	  ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
	    

      ExtentReports extent = new ExtentReports();
      extent.attachReporter(htmlReporter);
      ExtentTest test1 = extent.createTest("Google Search", "This is the test for google search functionality"); //3

		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 driver=new ChromeDriver();
		 
		//log(LogStatus, details)
		test1.log(Status.INFO, "Starting test case");
		driver.get("https://www.google.com/");
		test1.pass("navigate to google");

		driver.findElement(By.name("q")).sendKeys("Autmation");
		test1.pass("enteres text in search box");

		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		test1.pass("press keyboard enter key");

		driver.close();
		driver.quit();
		test1.pass("close the browser");
        
		test1.info("test is completed");

		// calling flush writes everything to the log file
		extent.flush();
	}
}
