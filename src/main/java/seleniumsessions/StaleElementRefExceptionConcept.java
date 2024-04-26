package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StaleElementRefExceptionConcept {
    static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		WebElement emailId = driver.findElement(By.id("input-email"));
		Thread.sleep(2000);
		emailId.sendKeys("naveen@gmail.com");
		driver.navigate().refresh();
		
//		emailId = driver.findElement(By.id("input-email"));
//		emailId.sendKeys("tom@gmail.com");
//		
//		//back and forward
//		
//		driver.findElement(By.xpath("//a[text()='About Us']")).click();
//		driver.navigate().back();
//		emailId.clear();
//		emailId.sendKeys("bhanu@gmail.com");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
				             wait.pollingEvery(Duration.ofMillis(500))
				             .ignoring(StaleElementReferenceException.class)
				             .withMessage("Element not found...");
				             
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-email"))).sendKeys("tom@gmail.com");
				             
		

	}

}
