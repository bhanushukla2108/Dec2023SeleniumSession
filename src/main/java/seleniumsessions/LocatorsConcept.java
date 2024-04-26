package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By username = By.id("input-email");
		By pwd = By.id("input-password");
		
		ElementUtil ele = new ElementUtil(driver);
		ele.doSendKeys(username, "test@gmail.com");
		ele.doSendKeys(pwd, "test@123");

	}

}
