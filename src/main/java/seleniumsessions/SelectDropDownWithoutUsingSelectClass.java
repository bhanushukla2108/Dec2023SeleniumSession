package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectDropDownWithoutUsingSelectClass {

	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial/");

		
		By elements = (By.xpath("//select[@id=\"Form_getForm_Country\"]/option"));
		DoSelectValueFromDropDown(elements,"Australia");
		

			
	}
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	public static void DoSelectValueFromDropDown(By locator, String value) {
		for(WebElement e : getElements(locator)) {
			String countries = e.getText();
			System.out.println(countries);
			if(countries.contains(value)) {
				e.click();
				break;
			}
		}
	}

}
