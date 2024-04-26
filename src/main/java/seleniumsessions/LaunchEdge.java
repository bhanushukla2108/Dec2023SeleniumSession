package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchEdge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new EdgeDriver();
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


