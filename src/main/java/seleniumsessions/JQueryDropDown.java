package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JQueryDropDown {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/#google_vignette");
		
//		driver.findElement(By.id("justAnInputBox")).click();
//		
//		List<WebElement> listItems=driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
//		
//		for(WebElement e : listItems) {
//		String text=e.getText();
//		System.out.println(text);
//		if(text.contains("choice 1")) {
//			e.click();
//			break;
//		}
//		}
		By dropDown = By.id("justAnInputBox");
		By choices  = By.xpath("//span[@class='comboTreeItemTitle']");
		//tc01:single check box selection
		//selectChoice(dropDown,choices,"choice 2");
		//tc02: multi check box
		//selectChoice(dropDown,choices,"choice 2", "choice 3","choice 6");
		//tc03 : all selection
		selectChoice(dropDown,choices,"all");
		
		// ... varargs --spread parameter(js) array
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	/**
	 * This method is used for single, multiple and all selection, Please pass "all" in case of all selection
	 * @param locator
	 * @param choiceLocator
	 * @param choice
	 * @throws InterruptedException
	 */
	public static void selectChoice(By locator,By choiceLocator, String... choice) throws InterruptedException {
		
		getElement(locator).click();
		Thread.sleep(2000);
		List<WebElement> listItems=getElements(choiceLocator);
		if(!choice[0].equals("all")) {
		
		for(WebElement e : listItems) {
		String text=e.getText();
		System.out.println(text);
		for(String val : choice) {
			if(text.equals(val)) {
				e.click();
			}
			
		}

		}
		}
		else {
			//all selection logic
			for(WebElement e : listItems) {
				try {
				e.click();
				}
				catch(ElementNotInteractableException ex) {
					break;
				}
			}
			}
		}
		
	}


