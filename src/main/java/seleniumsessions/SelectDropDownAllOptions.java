package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownAllOptions {

	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial/");

		WebElement element = driver.findElement(By.id("Form_getForm_Country"));

//		Select select = new Select(element);
//		List<WebElement> countryOptions = select.getOptions();
//		System.out.println(countryOptions.size());
//
//		for (WebElement e : countryOptions) {
//        String text = e.getText();
//        System.out.println(text);
//        if(text.equals("India")) {
//        	e.click();
//        	break;
//        }
//		System.out.println(text);
//			
//			
//		}
		
		By ele = By.id("Form_getForm_Country");
		//doSelectDropDownValue(ele,"Australia");
	    //int count = 	getDropDownValues(ele);
	    //System.out.println(count);
		printSelectDropDownValue(ele);

	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	//get all option in the form of string not webelement
	public static List<String> getDropDownOptionsTextList(By locator) {
		List<WebElement>optionList = getDropDownOptionsList(locator);
		List<String> optionsTextList = new ArrayList<String>();
		for(WebElement e : optionList) {
			String optionText = e.getText();
			optionsTextList.add(optionText);
		}
		return optionsTextList;
	}
	
	public static List<WebElement> getDropDownOptionsList(By locator) {
		Select select = new Select(getElement(locator));
		return select.getOptions();
	}
	
	public static int getDropDownValues(By locator) {
		return getDropDownOptionsList(locator).size();
	}
	
	public static void doSelectDropDownValue(By locator,String value) {
		for (WebElement e : getDropDownOptionsList(locator)) {
	        String text = e.getText();
	        System.out.println(text);
	        if(text.equals(value)) {
	        	e.click();
	        	break;
	        }	
				
			}
		
	}
	public static void printSelectDropDownValue(By locator) {
		for (WebElement e : getDropDownOptionsList(locator)) {
	        String text = e.getText();
	        System.out.println(text);
					
			}
		
	}

}
