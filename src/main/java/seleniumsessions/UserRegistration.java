package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserRegistration {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserUtil brutil = new BrowserUtil();
		driver=brutil.launchBrowser("Firefox");
		brutil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		String title = brutil.getPageTitle();
		System.out.println(title);
		
		By firstname = By.id("input-firstname");
		By lastname = By.id("input-lastname");
		By email = By.id("input-email");
		By phoneno = By.id("input-telephone");
		By password = By.id("input-password");
		By passwordconfirm = By.id("input-confirm");
		
		ElementUtil eleu = new ElementUtil(driver);
		eleu.doSendKeys(firstname, "Bhanu");
		eleu.doSendKeys(lastname, "Shukla");
		eleu.doSendKeys(email, "bhanushukla@gmail.com");
		eleu.doSendKeys(phoneno, "956186099");
		eleu.doSendKeys(password, "bhanu@123");
		eleu.doSendKeys(passwordconfirm, "bhanu@123");
		
		

	}

}
