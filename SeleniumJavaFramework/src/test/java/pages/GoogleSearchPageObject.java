package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObject {
	
	WebDriver driver=null;
 By txtBox_search= By.name("q");
 By btn_search=By.name("q");
 
 
 public GoogleSearchPageObject(WebDriver driver) {
	 this.driver=driver;
 }
 
 public void setextInSearchBox(String text) {
	 driver.findElement(txtBox_search).sendKeys(text);
 }
	
 public void clickOnSearchBtn() {
	 driver.findElement(btn_search).sendKeys(Keys.RETURN);
 }
}
