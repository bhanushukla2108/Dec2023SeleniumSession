package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.get("http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-htm");
		Thread.sleep(3000);
//		WebElement main=driver.findElement(By.xpath("//a[@class='menulink']"));
//		WebElement subElement = driver.findElement(By.xpath("//ul[@class='submenu']/li/following-sibling::li/a[text()='Courses']"));
		
//		Actions act = new Actions(driver);
//		Thread.sleep(3000);
//		act.moveToElement(main).build().perform();
//		Thread.sleep(3000);
//		subElement.click();
		By main = By.xpath("//a[@class='menulink']");
		//By subElement = By.xpath("//ul[@class='submenu']/li/following-sibling::li/a[text()='Courses']");
		By subElements = By.xpath("//ul[@class='submenu']/li");
		//doClickMoveElement(main,subElement);
		doClickAnyElements(main,subElements,"Single Videos");

	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public static void doClickMoveElement(By parent, By child) {
		Actions act = new Actions(driver);
		act.moveToElement(getElement(parent)).build().perform();
		getElement(child).click();
		
	}
	public static void doClickAnyElements(By par, By sub, String name) {
		Actions act = new Actions(driver);
		act.moveToElement(getElement(par)).build().perform();
		for(WebElement e: getElements(sub)) {
			if(e.getText().equalsIgnoreCase(name)) {
				e.click();
				break;
			}
		}
	}

}
