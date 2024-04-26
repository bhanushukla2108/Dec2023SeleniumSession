package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchSuggestion {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		//driver.get("https://google.co.in");
		driver.get("https://groww.in/");
		
//		driver.findElement(By.name("q")).sendKeys("selenium");
//		Thread.sleep(3000);
		
//		List<WebElement> suggList=driver.findElements(By.xpath("//ul[@class='G43f7e']//div[@class='wM6W7d']/span"));
//		System.out.println(suggList.size());
		
//		for(WebElement e : suggList) {
//			String text=e.getText();
//			if(text.contains("python")) {
//				e.click();
//				break;
//			}
//		}
		By searchGrow = By.id("globalSearch23");
		By growList = By.xpath("//div[@class='valign-wrapper vspace-between width100 gsc23SuggestionContent']");
		//By searchField = By.name("q");
		//By suggList = By.xpath("//ul[@class='G43f7e']//div[@class='wM6W7d']/span");
	//	doSearch(searchField,suggList,"selenium","webdriver");
		doSearch(searchGrow,growList,"paytm","One97");

	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	public static void doSearch(By searchlocator, By locator, String searchKey,String name) throws InterruptedException {
		getElement(searchlocator).sendKeys(searchKey);
		Thread.sleep(3000);
		for(WebElement e : getElements(locator)) {
			String text=e.getText();
			if(text.contains(name)) {
				e.click();
				break;
			}
		}
	}

}
