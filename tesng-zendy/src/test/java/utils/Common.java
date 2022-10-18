package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Common {

	WebDriver driver;
	
	public void setUpBrowser(String browser,String url) {
		String currDir= System.getProperty("user.dir");

		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", currDir + "\\drivers\\chromedriver.exe" );
			driver = new ChromeDriver();
		} 
		else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", currDir + "\\drivers\\geckodriver.exe" );
			driver = new FirefoxDriver();

		}
		else {
			System.out.println("No valid browser, hence quitiing the automation run");
			System.exit(0);
		}

		if(url!="") {
			driver.get(url);
		}else {
			driver.get("about:blank");
		}

	}
	
	public WebDriver getDriver() {
		return this.driver;
	
	}

	public void closeBrowser() {
		driver.close();
	}
	
	public void quitBrowser() {
		driver.quit();
	}
}
