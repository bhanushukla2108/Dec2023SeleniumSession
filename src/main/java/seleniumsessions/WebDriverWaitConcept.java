package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitConcept {

	static WebDriver driver;

	public static void main(String[] args)  {

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial/");
		
		By fullName =By.id("Form_getForm_Name");
		By busEmail =By.id("Form_getForm_Email");
		waitForElementPresence(5,fullName).sendKeys("naveen");
		//waitForElementPresence(5,busEmail).sendKeys("naveem@gmail.com");
		getElement(busEmail).sendKeys("naveem@gmail.com");
		//e1: 10 sec
//	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//	WebElement fullname_ele =wait.until(ExpectedConditions.presenceOfElementLocated(fullName));
//	fullname_ele.sendKeys("testing");
//	
//	//e2 : 0
//	driver.findElement(By.id("Form_getForm_Email")).sendKeys("test@gmail.com");

	}
	
	public static WebElement waitForElementPresence(int time,By locator) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(time));
	    return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}

