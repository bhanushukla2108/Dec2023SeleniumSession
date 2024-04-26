package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenCartLoginTest {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BrowserUtil br = new BrowserUtil();
		driver=br.launchBrowser("Chrome");
		br.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		String title = br.getPageTitle();
		System.out.println(title);
		
		By username = By.id("input-email");
		By password = By.id("input-password");
		
		ElementUtil ele = new ElementUtil(driver);
		ele.doSendKeys(username, "bhanu@gmail.com");
		ele.doSendKeys(password, "bhanu@123");

	}

}
