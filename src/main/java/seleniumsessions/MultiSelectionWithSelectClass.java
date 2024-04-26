package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectionWithSelectClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://html.com/attributes/select-multiple/");
	WebElement dropDownEle =driver.findElement(By.xpath("//select[@multiple]"));
	
	Select select = new Select(dropDownEle);
	if(select.isMultiple()) {
		System.out.println("multi select is possible");
		select.selectByVisibleText("American flamingo");
		select.selectByVisibleText("Andean flamingo");
		select.selectByVisibleText("Chilean flamingo");
		select.selectByVisibleText("Lesser flamingo");
	}
	//select.deselectByVisibleText("Lesser flamingo");
	//select.deselectAll();
	
	List<WebElement> element=select.getAllSelectedOptions();
	System.out.println(element.size());
	
	for(WebElement e : element) {
	String s=e.getText();
	System.out.println(s);
	}

	}

}
