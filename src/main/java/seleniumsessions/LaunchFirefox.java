package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//automation steps
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		String title=driver.getTitle();
		System.out.println(title);
		
		//checkpoint/verification
		
		if(title.equals("Google")) {
			System.out.println("Correct title--Pass");
		}
		else {
			System.out.println("Incorrect title--Failed");
		}
	String url =	driver.getCurrentUrl();
	System.out.println(url);
	if(url.contains("google.com")) {
		System.out.println("url--Passed");
	}
	else {
		System.out.println("url--Failed");
	}
	driver.close();

	}

	}


