package seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandle {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();

		Set<String> windowHandles = driver.getWindowHandles();

		Iterator<String> it = windowHandles.iterator();

		String parent = it.next();
		System.out.println("Unique identifier of parent window "+parent);

		String child = it.next();
		System.out.println("Unique identifier of child window "+child);
		
		driver.switchTo().window(child);
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
		driver.switchTo().window(parent);
		System.out.println(driver.getCurrentUrl());
		
		

	}

}
