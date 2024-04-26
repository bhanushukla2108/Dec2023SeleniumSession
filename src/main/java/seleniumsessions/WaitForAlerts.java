package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForAlerts {

	static WebDriver driver;

	public static void main(String[] args) {
		// alert
		// prompt
		// cofirm

		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		System.out.println(alert.getText());
		alert.accept();

	}
	public static Alert waitForJSAlert(int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.alertIsPresent());

	}
	public static String getAlertText(int timeout) {
		return waitForJSAlert(timeout).getText();

	}
	public static void acceptAlert(int timeout) {
		waitForJSAlert(timeout).accept();

	}
	
	public static void dismissAlert(int timeout) {
		waitForJSAlert(timeout).dismiss();

	}
	
	public static void alertSendKeys(int timeout,String value) {
		waitForJSAlert(timeout).sendKeys(value);

	}
	
	

}
