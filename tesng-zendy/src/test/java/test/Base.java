package test;


import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import utils.Common;

public class Base {
  
	String url="https://test-app.zendy.io";
	String browser="chrome";
	static WebDriver driver;
	Common common;
	
  @BeforeTest
  public void beforeTest() {
	  common= new Common();
	  common.setUpBrowser(browser, url);
	  driver=common.getDriver();
	  
  }

  @AfterTest
  public void afterTest() {
	  common.quitBrowser();
  }

}
