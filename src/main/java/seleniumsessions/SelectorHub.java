package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectorHub {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		userTableClick("Joe.Root");
		System.out.println(userDetails("Joe.Root"));
		

	}
	public static void userTableClick(String name) {
	WebElement ele =driver.findElement(By.xpath("//a[text()='"+name+"']/ancestor::tr//input[@type='checkbox']"));
	ele.click();
	}
	
	public static List<String> userDetails(String userName) {
		List<WebElement>userList = driver.findElements(By.xpath("//a[text()='"+userName+"']/parent::td/following-sibling::td"));
		ArrayList<String> list = new ArrayList<String>();
		
		for(WebElement e : userList ) {
			String text = e.getText();
			list.add(text);
		}
		return list;
	}

}
