import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPageObject;

public class GoogleSearchPageTest {
	
	private static WebDriver driver=null;
	public static void main(String[] args) {
		googleSearchtest();
	}


	public static void googleSearchtest() {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver=new ChromeDriver();
	

		GoogleSearchPageObject searchPageObj= new GoogleSearchPageObject(driver);
			driver.get("https://www.google.com/");		 
			searchPageObj.setextInSearchBox("Abcd");
			searchPageObj.clickOnSearchBtn();
			driver.close();


		}
	}
