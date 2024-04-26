package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookDoctorsAppointment {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.get("https://www.practo.com/jabalpur/doctors");
		bookAppointment("Dr. Akash Jain");
		//Dr. Sumit Jain

	}
	
	public static void bookAppointment(String docName) {
		//WebElement ele=driver.findElement(By.xpath("//h2[text()='"+docName+"']/parent::div/parent::a/parent::div/parent::div/following-sibling::div/div/div/div/following-sibling::div/div/button[text()='Book Clinic Visit']"));
		WebElement name=driver.findElement(By.xpath("//h2[text()='"+docName+"']"));
		System.out.println(name.getText());
		//ele.click();
	}

}
