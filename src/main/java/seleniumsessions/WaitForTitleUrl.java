package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForTitleUrl {

	static WebDriver driver;

	public static void main(String[] args)  {

		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		
		driver.findElement(By.linkText("Sign Up")).click();
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//		wait.until(ExpectedConditions.titleContains("Free CRM software for customer"));
		//String t =waitForTitleContains("Free CRM",5);
		//String t=waitForTitleToBe("Free CRM software for customer relationship management, sales, and support.",5);
		String t = waitForURLFraction("/register",5);
		//String t=waitForURLTobe("https://classic.crmpro.com/",5);
		System.out.println(t);
		

	}
	
	public static String waitForTitleContains(String title, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		try {
		if(wait.until(ExpectedConditions.titleContains(title))) {
			return driver.getTitle();
		}
		}
		catch(Exception e){
			System.out.println("title is not found within timeout");
		}
		return null;
		
	}
	
	public static String waitForTitleToBe(String title, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		try {
		if(wait.until(ExpectedConditions.titleIs(title))) {
			return driver.getTitle();
		}
		}
		catch(Exception e){
			System.out.println("title is not found within timeout");
		}
		return null;
		
	}
	public static String waitForURLFraction(String url, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		try {
		if(wait.until(ExpectedConditions.urlContains(url))) {
			return driver.getCurrentUrl();
		}
		}
		catch(Exception e){
			System.out.println("url is not found within timeout");
		}
		return null;
		
	}
	public static String waitForURLTobe(String url, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		try {
		if(wait.until(ExpectedConditions.urlToBe(url))) {
			return driver.getCurrentUrl();
		}
		}
		catch(Exception e){
			System.out.println("url is not found within timeout");
		}
		return null;
		
	}

}
