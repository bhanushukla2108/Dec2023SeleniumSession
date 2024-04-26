package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownConcept {


	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial/");
		
//	WebElement element=	driver.findElement(By.id("Form_getForm_Country"));
//		
//		Select select = new Select(element);
//		select.selectByIndex(3);
//		select.selectByVisibleText("India");
//		select.selectByValue("Belgium");
		By country = By.id("Form_getForm_Country");
		doSelectByIndexDropDown(country,5);
		doSelectByVisibleTextDropDown(country,"India");
		doSelectByValueDropDown(country,"Australia");

	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSelectByIndexDropDown(By locator, int index) {
		Select idx = new Select(getElement(locator));
		idx.selectByIndex(index);
		
	}
	
	public static void doSelectByVisibleTextDropDown(By locator, String visibleText) {
		if(visibleText==null || visibleText.length()==0) {
			throw new MyElementException("visible text cannot be null");
		}
		Select str = new Select(getElement(locator));
		str.selectByVisibleText(visibleText);
		
	}
	
	public static void doSelectByValueDropDown(By locator, String value) {
		if(value==null || value.length()==0) {
			throw new MyElementException("visible text cannot be null");
		}
		Select str = new Select(getElement(locator));
		str.selectByValue(value);
		
	}

}
