package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/england-in-india-2023-24-1389386/india-vs-england-4th-test-1389402/full-scorecard");
		
	//WebElement ele=	driver.findElement(By.xpath("//span[text()='Zak Crawley']/ancestor::td/following-sibling::td//span/span[text()=' b Akash Deep']"));
	
	//System.out.println(ele.getText());
	System.out.println(scoreCard("Zak Crawley"));
	System.out.println(scoreCard("Joe Root"));
		

	}
public static List<String> scoreCard(String name) {
	List<WebElement> str=driver.findElements(By.xpath("(//span[text()='"+name+"'])[1]/ancestor::td/following-sibling::td[contains(@class,'ds-whitespace-nowrap')]"));
	ArrayList<String> list = new ArrayList<String>();
	for(WebElement e : str) {
		String text = e.getText();
		list.add(text);
	}
	return list;
}
}
