package test;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class BasicTest extends Base {
  @Test
  public void TestDownloadArticle() {
	  
	  //STEP 1: User logs in into the system
	  WebDriverWait wait = new WebDriverWait(driver, 50);
	  WebElement login=wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.className("css-1ipkqoe"))));
	  login.click();
	  
	  driver.findElement(By.id("email")).sendKeys("avbabitha@gmail.com");
	  driver.findElement(By.id("password")).sendKeys("Babi@zendy2022");
	  
	  try {
		Thread.sleep(3000);
	  } catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	  }
	  
	  WebElement signIn = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("sign_in_btn"))));
	  signIn.click();
	  		  
	   try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	  
	  //Step 2: User Searches using the keyword search “Software quality assurance best practices”
	  WebElement search = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@type='search']"))));
	  search.sendKeys("Software quality assurance best practices");
	 
	  try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 
	 WebElement searchButton=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='css-1har4nf']")));
	 searchButton.click();
	 
	 // STEP 3: User clicks download for the third search result
	 WebElement download= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='search-result-2']//child::button[@id='downloadLinkBtn']")));
	 download.click();
	 
	 ArrayList<String> tabs =  new ArrayList<String>(driver.getWindowHandles());
	 driver.switchTo().window(tabs.get(1));
	  
  }
}
