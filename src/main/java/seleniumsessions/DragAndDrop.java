package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
//		WebElement source = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
//		WebElement destination = driver.findElement(By.xpath("//p[text()='Drop here']"));
//		
//		Actions act = new Actions(driver);
//		act.clickAndHold(source).moveToElement(destination).release().build().perform();
		By so = By.xpath("//p[text()='Drag me to my target']");
		By des = By.xpath("//p[text()='Drop here']");
		
		doDrangAndDrop(so,des);
		

	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static void doDrangAndDrop(By src, By destin) {
		Actions act = new Actions(driver);
		act.clickAndHold(getElement(src)).moveToElement(getElement(destin)).release().build().perform();
		
	}

}
