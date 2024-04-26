package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableTraverse {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		int colcount = driver.findElements(By.xpath("//table[@id='customers']//th")).size();
		System.out.println("Total column count is :"+colcount);
        for(int col=1;col<=colcount; col++) {
        List<WebElement> allcol = driver.findElements(By.xpath("//table[@id='customers']//tr/following-sibling::tr/td["+col+"]"));
            for(WebElement ele : allcol) {
             String alltext =  ele.getText();
             System.out.println(alltext);
            }
		}
		//getRows();
	}
	
//	public static void getRows() {
//	List<WebElement> rows =	driver.findElements(By.xpath("//table[@id='customers']//tr/following-sibling::tr/td[1]"));
//	for(WebElement e : rows) {
//		String text = e.getText();
//		System.out.println(text);
//	}
//	}
	

	

}
