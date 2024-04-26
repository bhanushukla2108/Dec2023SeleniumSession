package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocatorConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		WebElement ele = driver.findElement(By.xpath("//a[text()='Privacy Policy']"));

		driver.findElement(RelativeLocator.with(By.xpath("//input[@type='checkbox']")).toRightOf(ele)).click();

		WebElement ele1 = driver.findElement(By.xpath("//a[contains(@href,'download')]"));
		String text = driver.findElement(RelativeLocator.with(By.xpath("//a[contains(@href,'History')]")).above(ele1))
				.getText();
		
		System.out.println(text);

	}

}
