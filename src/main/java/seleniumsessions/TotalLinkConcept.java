package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinkConcept {
       static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//total link
		//print the text of each link
		//avoid blank text
		//broken link
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		List<WebElement>alllinks=driver.findElements(By.tagName("a"));
		
		System.out.println("total links: "+alllinks.size());
		
		for(WebElement e: alllinks) {
			String text = e.getText();
			if(text.length()!=0) {
				System.out.println(text);
			}
		}
		System.out.println("=================================================");
		
		//total text fields on the page
	List<WebElement>allTextField=	driver.findElements(By.className("form-control"));
	System.out.println("All text field: "+allTextField.size());
	
	for(WebElement e: allTextField) {
		e.sendKeys("Tesing"); //This will enter testing in all text field
	}
		

	}

}
