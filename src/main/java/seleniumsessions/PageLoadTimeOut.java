package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadTimeOut {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(120));
		
		long sec =driver.manage().timeouts().getPageLoadTimeout().getSeconds();
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form");
		
		System.out.println(sec);

	}

}
