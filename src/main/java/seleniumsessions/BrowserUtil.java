package seleniumsessions;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import seleniumsessions.BrowserException;

public class BrowserUtil {

		
		WebDriver driver;
		
		public WebDriver launchBrowser(String browserName) {
			System.out.println("browser name : " + browserName);
		
		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;

		default:
			System.out.println("Please pass the right browser.."+browserName);
			throw new BrowserException("BROWSER NOT FOUND");
			
		

	}
		return driver;
		
		}
		
		public void launchURL(String string) {
			if (string == null) {
				throw new BrowserException("URL IS NULL");
			}

			String appUrl = String.valueOf(string);
			if (appUrl.indexOf("http") == 0) {
				driver.navigate().to(string);
			} else {
				throw new BrowserException("HTTP/s IS MISSING IN URL");
			}
		}

		public String getPageTitle() {
			return driver.getTitle();
		}

		public String getPageURL() {
			return driver.getCurrentUrl();
		}

		public void closeBrowser() {
			driver.close();
		}

		public void quitBrowser() {
			driver.quit();
		}

}


